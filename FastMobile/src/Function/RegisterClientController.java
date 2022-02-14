/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.Client_TypeController;
import Controllers.ClientController;
import Controllers.PersonController;
import Controllers.PlanController;
import Interface.RegisterClient;
import Models.Client_Type;
import Models.Person;
import Models.Client;
import Models.Plan;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
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
        tabla.setModel(tablePlans);
    }
    
    public void insertTable(RegisterClient rc){
        String []info=new String[2];
        info[0] = rc.getjTextFieldClient_Phone().getText();
        info[1] = plans.get(rc.getjComboBoxPlan().getSelectedIndex()).getName();
        tablePlans.addRow(info);
    }
    
}
