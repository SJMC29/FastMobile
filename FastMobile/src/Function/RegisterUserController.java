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
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author EDITH
 */
public class RegisterUserController {
    
    //RegisterUser registerUser = new RegisterUser();
    RolController rolControl = new RolController();
    PersonController personControl = new PersonController();
    UserController userControl = new UserController();
    List<Rol> roles;
    
    public void goToMenu(RegisterUser registeruser, User usuario){
            new Menu(usuario).setVisible(true);
            registeruser.dispose();
    }    
    
    public void sendForm(RegisterUser ru){
<<<<<<< Updated upstream
        Person p = new Person(ru.getjTextFieldCedula().getText(), 
                                ru.getjTextFieldNombre().getText(), 
                                ru.getjTextFieldApellido().getText(),
                                ru.getjTextFieldEmail().getText(),
                                ru.getjTextFieldPhone().getText(),
                                ru.getjTextFieldAddress().getText(),
                                Double.parseDouble(ru.getjTextFieldLatitud().getText()),
                                Double.parseDouble(ru.getjTextFieldLongitud().getText()));
        // System.out.println("p = " + p);
        Rol r = roles.get(ru.getjComboBoxRol().getSelectedIndex());
        User u = new User(p, ru.getjTextFieldPassword().getText(), ru.isActive(), r);
        personControl.createPerson(p);
        userControl.createUser(u);
        
        ru.getjTextFieldAddress().setText("");
        ru.getjTextFieldApellido().setText("");
        ru.getjTextFieldCedula().setText("");
        ru.getjTextFieldEmail().setText("");
        ru.getjTextFieldLatitud().setText("");
        ru.getjTextFieldLongitud().setText("");
        ru.getjTextFieldNombre().setText("");
        ru.getjTextFieldPassword().setText("");
        ru.getjTextFieldPhone().setText("");
=======
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
>>>>>>> Stashed changes
    }
    
    public void cargarRoles(JComboBox<String> comboBoxRol){
        roles = rolControl.getRols();
        comboBoxRol.removeAllItems();
        for(int i=0;i<roles.size();i++){
            comboBoxRol.addItem(roles.get(i).getName());
        }
    }
    
}
