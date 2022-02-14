/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.Client_TypeController;
import Controllers.ClientController;
import Controllers.Client_PhoneController;
import Controllers.PersonController;
import Controllers.PlanController;
import Interface.RegisterClient;
import Models.Client_Type;
import Models.Client_Phone;
import Models.Person;
import Models.Client;
import Models.Plan;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateo Obando
 */
public class RegisterClientController {         
    DefaultTableModel tablePlans = new DefaultTableModel();
    PersonController personControl = new PersonController();
    ClientController clientControl = new ClientController();
    Client_PhoneController client_PhoneControl = new Client_PhoneController();
    Client_TypeController typeControl = new Client_TypeController();  
    PlanController planControl = new PlanController();  
    List<Client_Type> types;
    List<Plan> plans;
    
    public void sendForm(RegisterClient rc){
        String nombre = rc.getjTextFieldCedula().getText();
        Date current_date = new Date();
        
        //TODOOOOO
        boolean suspended = rc.getjRadioButtonSuspended();
        Person person = new Person(
                nombre,
                rc.getjTextFieldNombre().getText(),
                rc.getjTextFieldApellido().getText(),
                rc.getjTextFieldEmail().getText(),
                rc.getjTextFieldPhone().getText(),
                rc.getjTextFieldAddress().getText(),
                Double.parseDouble(rc.getjTextFieldLatitud().getText()),
                Double.parseDouble(rc.getjTextFieldLongitud().getText())
        );
        
        
        Client_Type selected_type = types.get(rc.getjComboBoxType().getSelectedIndex());
        
        Client c = new Client(person,selected_type,suspended,current_date);
        personControl.createPerson(person);
        clientControl.createClient(c);   
        
        addClient_Phones(c, rc.getjTable());
        //Create Client_Phone
    }
    
    public void loadTypes(JComboBox<String> lista){
        types = typeControl.getClient_Types();
        lista.removeAllItems();
        for(int i=0;i<types.size();i++){
            lista.addItem(types.get(i).getName());
        }
    }
    
    public void loadPlans(JComboBox<String> lista){
        plans = planControl.getPlans();
        lista.removeAllItems();
        for(int i=0;i<plans.size();i++){
            lista.addItem(plans.get(i).getName());
        }
    }
    
    public void loadTable(JTable tabla){
        
        tablePlans.addColumn("Teléfono");
        tablePlans.addColumn("Plan");
        tablePlans.addColumn("Plan ID");
        tabla.setModel(tablePlans);
    }
    
    public void insertTable(RegisterClient rc){
        //Comprobar antes de insertar
        //System.out.println(tablePlans.getRowCount());
        Client_Type selected_type = types.get(rc.getjComboBoxType().getSelectedIndex());
        if(tablePlans.getRowCount()<3 || !"Natural".equals(selected_type.getName())){
            String []info=new String[3];
            info[0] = rc.getjTextFieldClient_Phone().getText();
            info[1] = plans.get(rc.getjComboBoxPlan().getSelectedIndex()).getName();
            info[2] = Integer.toString(rc.getjComboBoxPlan().getSelectedIndex());
            tablePlans.addRow(info);
            rc.getjTextFieldClient_Phone().setText("");    
        }else{
            JOptionPane.showMessageDialog(null,"Los clientes naturales pueden tener solo hasta 3 líneas telefónicas");
        }
            
    }
    
    public void removePhone(RegisterClient rc){
        int row = rc.getjTable().getSelectedRow();
        if(row>=0){
            tablePlans.removeRow(row);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione una Fila");
        }
    }    
    
    public void addClient_Phones(Client client, JTable tabla){
        Client_Phone selected_client_phone;
        Plan selected_plan;
        String phone;
        for(int i = 0; i < tabla.getRowCount(); i++){
            //System.out.println(plans);
            //System.out.print(i);
            System.out.println(tabla.getModel().getValueAt(i, 0));            
            //Convertir en string,luego en int y luego lo busca en plans
            System.out.println(plans.get(Integer.parseInt(tabla.getModel().getValueAt(i, 2).toString())).getName());
            
            phone = tabla.getModel().getValueAt(i, 1).toString();
            selected_plan = plans.get(Integer.parseInt(tabla.getModel().getValueAt(i, 2).toString()));
            
            selected_client_phone = new Client_Phone(client, phone, selected_plan);
            client_PhoneControl.createClient_Phone(selected_client_phone);
        }
    }
}
