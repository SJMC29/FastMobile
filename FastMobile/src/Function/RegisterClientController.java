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
import Interface.Menu;
import Interface.ProfileUsers;
import Interface.RegisterClient;
import Models.Client_Type;
import Models.Client_Phone;
import Models.Person;
import Models.Client;
import Models.Plan;
import Models.User;
import java.awt.Color;
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
    
    public Client_Type tipoSeleccionado(int i){
        return types.get(i);
    }
    
    public void goToMenu(RegisterClient registerClient, User usuario){
            new Menu(usuario).setVisible(true);
            registerClient.dispose();
    }
    
    public void sendForm(RegisterClient rc){
        String cedula = rc.getjTextFieldCedula().getText();
        String nombre = rc.getjTextFieldNombre().getText();
        String apellido = rc.getjTextFieldApellido().getText();
        String mail = rc.getjTextFieldEmail().getText();
        String phone = rc.getjTextFieldPhone().getText();
        String address = rc.getjTextFieldAddress().getText();
        String latitude = rc.getjTextFieldLatitud().getText();
        String longitude = rc.getjTextFieldLongitud().getText();
        
        Date current_date = new Date();
        
        //Validacion XD        
        Integer error = 0;      
        
        if(cedula.equals("")){
            error = 1;
            rc.getjTextFieldCedula().setBackground(new Color(255,200,200));
            System.out.println("error cedula");
        }
        if(nombre.equals("")){
            error = 1;
            rc.getjTextFieldNombre().setBackground(new Color(255,200,200));
            System.out.println("error nombre");
        }
        if(apellido.equals("")){
            error = 1;
            rc.getjTextFieldApellido().setBackground(new Color(255,200,200));
            System.out.println("error apellido");
        }
        if(mail.equals("")){
            error = 1;
            rc.getjTextFieldEmail().setBackground(new Color(255,200,200));
            System.out.println("error mail");
        }
        if(phone.equals("")){
            error = 1;
            rc.getjTextFieldPhone().setBackground(new Color(255,200,200));
            System.out.println("error phone");
        }
        if(address.equals("")){
            error = 1;
            rc.getjTextFieldAddress().setBackground(new Color(255,200,200));
            System.out.println("error address");
        }
        if(latitude.equals("") || !isNumeric(latitude)){
            error = 1;
            rc.getjTextFieldLatitud().setBackground(new Color(255,200,200));
            System.out.println("error latitude");
        }
        if(longitude.equals("") || !isNumeric(longitude)){
            error = 1;
            rc.getjTextFieldLongitud().setBackground(new Color(255,200,200));
            System.out.println("error longitude");
        }
        if(rc.getjTable().getRowCount()==0){
            error = 1;
            rc.getjLabelErrorLinea().setVisible(true);
            System.out.println("error tabla");
        }
        
        
        if(error == 0){//Si no hay error enviar
            //TODOOOOO
            boolean suspended = rc.getjRadioButtonSuspended();
            Person person = new Person(
                    cedula,
                    nombre,
                    apellido,
                    mail,
                    phone,
                    address,
                    Double.parseDouble(latitude),
                    Double.parseDouble(longitude)
            );        

            Client_Type selected_type = tipoSeleccionado(rc.getjComboBoxType().getSelectedIndex());

            Client c = new Client(person,selected_type,suspended,current_date);


            System.out.println(rc.getjTable().getRowCount());
            //personControl.createPerson(person);
            //clientControl.createClient(c);   
            //addClient_Phones(c, rc.getjTable());
        }        
    }
    
    public void visible(RegisterClient rc,Boolean bool){
        rc.getjLabelErrorLinea().setVisible(bool);    
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
            //System.out.println(tabla.getModel().getValueAt(i, 0));            
            //Convertir en string,luego en int y luego lo busca en plans
            //System.out.println(plans.get(Integer.parseInt(tabla.getModel().getValueAt(i, 2).toString())).getName());
            
            phone = tabla.getModel().getValueAt(i, 0).toString();
            selected_plan = plans.get(Integer.parseInt(tabla.getModel().getValueAt(i, 2).toString()));
            
            selected_client_phone = new Client_Phone(client, phone, selected_plan);
            client_PhoneControl.createClient_Phone(selected_client_phone);
        }
    }
    
    //AUX
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
