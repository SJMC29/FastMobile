/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.PersonController;
import Controllers.RolController;
import Controllers.UserController;
import Interface.Menu;
import Interface.RegisterClient;
import Interface.RegisterUser;
import Models.Person;
import Models.Rol;
import Models.User;
import java.awt.Color;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author EDITH
 */
public class RegisterUserController {
    
    RolController rolControl = new RolController();
    PersonController personControl = new PersonController();
    UserController userControl = new UserController();
    List<Rol> roles;
    
    public void goToMenu(RegisterUser registeruser, User usuario){
            new Menu(usuario).setVisible(true);
            registeruser.dispose();
    }    
    
    public Rol rolSeleccionado(int i){
        return roles.get(i);
    }
    
    public void sendForm(RegisterUser ru){
        reset_bg(ru);
        if(validation(ru) == 0){
            Person p = new Person(ru.getjTextFieldCedula().getText(), 
                                    ru.getjTextFieldNombre().getText(), 
                                    ru.getjTextFieldApellido().getText(),
                                    ru.getjTextFieldEmail().getText(),
                                    ru.getjTextFieldPhone().getText(),
                                    ru.getjTextFieldAddress().getText(),
                                    Double.parseDouble(ru.getjTextFieldLatitud().getText()),
                                    Double.parseDouble(ru.getjTextFieldLongitud().getText()));
            // System.out.println("p = " + p);
            Rol r = rolSeleccionado(ru.getjComboBoxRol().getSelectedIndex());
            User u = new User(p, ru.getjTextFieldPassword().getText(), ru.isActive(), r);
            personControl.createPerson(p);
            userControl.createUser(u);
            //System.out.println("Descomentame negro");
            reset_text(ru);
        }
    }
    
    public void cargarRoles(JComboBox<String> comboBoxRol){
        roles = rolControl.getRols();
        comboBoxRol.removeAllItems();
        for(int i=0;i<roles.size();i++){
            comboBoxRol.addItem(roles.get(i).getName());
        }
    }
    
    public boolean isNumeric(String strNum) {
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
    
    public Integer validation(RegisterUser ru){
        Integer error = 0;      
        
        if(ru.getjTextFieldCedula().getText().equals("") || !isNumeric(ru.getjTextFieldCedula().getText())){
            error = 1;
            ru.getjTextFieldCedula().setBackground(new Color(255,200,200));
            System.out.println("error cedula");
        }
               
        if(ru.getjTextFieldNombre().getText().equals("")){
            error = 1;
            ru.getjTextFieldNombre().setBackground(new Color(255,200,200));
            System.out.println("error nombre");
        }
        
        if(ru.getjTextFieldPassword().getText().equals(ru.getjTextFieldCedula().getText())){
            error = 1;
            ru.getjTextFieldPassword().setBackground(new Color(255,200,200));
            ru.getjTextFieldCedula().setBackground(new Color(255,200,200));
            System.out.println("error nombre x cedula");
        }
        
        if(ru.getjTextFieldApellido().getText().equals("")){
            error = 1;
            ru.getjTextFieldApellido().setBackground(new Color(255,200,200));
            System.out.println("error apellido");
        }
        if(ru.getjTextFieldEmail().getText().equals("")){
            error = 1;
            ru.getjTextFieldEmail().setBackground(new Color(255,200,200));
            System.out.println("error mail");
        }
        if(ru.getjTextFieldPhone().getText().equals("")){
            error = 1;
            ru.getjTextFieldPhone().setBackground(new Color(255,200,200));
            System.out.println("error phone");
        }
        if(ru.getjTextFieldAddress().getText().equals("")){
            error = 1;
            ru.getjTextFieldAddress().setBackground(new Color(255,200,200));
            System.out.println("error address");
        }
        if(ru.getjTextFieldLatitud().getText().equals("") || !isNumeric(ru.getjTextFieldLatitud().getText())){
            error = 1;
            ru.getjTextFieldLatitud().setBackground(new Color(255,200,200));
            System.out.println("error latitude");
        }
        if(ru.getjTextFieldLongitud().getText().equals("") || !isNumeric(ru.getjTextFieldLongitud().getText())){
            error = 1;
            ru.getjTextFieldLongitud().setBackground(new Color(255,200,200));
            System.out.println("error longitude");
        }
        return error;
    }
    
    public void reset_bg(RegisterUser ru){
        ru.getjTextFieldCedula().setBackground(new Color(255,255,255));
        ru.getjTextFieldNombre().setBackground(new Color(255,255,255));
        ru.getjTextFieldApellido().setBackground(new Color(255,255,255));
        ru.getjTextFieldEmail().setBackground(new Color(255,255,255));
        ru.getjTextFieldPhone().setBackground(new Color(255,255,255));
        ru.getjTextFieldAddress().setBackground(new Color(255,255,255));
        ru.getjTextFieldLatitud().setBackground(new Color(255,255,255));
        ru.getjTextFieldLongitud().setBackground(new Color(255,255,255));
        ru.getjTextFieldPassword().setBackground(new Color(255,255,255));        
    }
    
    public void reset_text(RegisterUser ru){
        ru.getjTextFieldCedula().setText("");
        ru.getjTextFieldNombre().setText("");
        ru.getjTextFieldApellido().setText("");
        ru.getjTextFieldEmail().setText("");
        ru.getjTextFieldPhone().setText("");
        ru.getjTextFieldAddress().setText("");
        ru.getjTextFieldLatitud().setText("");
        ru.getjTextFieldLongitud().setText("");     
        ru.getjTextFieldPassword().setText("");
    }
}
