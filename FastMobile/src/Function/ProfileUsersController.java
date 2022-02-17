/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.PersonController;
import Controllers.UserController;
import Interface.ListUsers;
import Models.User;
import Interface.Login;
import Interface.Menu;
import Interface.ProfileUsers;

/**
 *
 * @author Sara Maradiago
 */
public class ProfileUsersController {
    
    UserController userControl = new UserController();
    PersonController personControl = new PersonController();
    
    public void logOut(ProfileUsers profileUser){
            new Login().setVisible(true);
            profileUser.dispose();
    }     
    
    public void goToMenu(ProfileUsers profileUser, User usuario){
            new Menu(usuario).setVisible(true);
            profileUser.dispose();
    }
    
    public void actualizarUsuario(ProfileUsers pU, User usuario){
        User upDateUser;
        if(pU.getUserPerfil()== null){
            upDateUser = usuario;
        } else {
            upDateUser = pU.getUserPerfil();
        }
        
        upDateUser.getPerson().setAddress(pU.getDireccionJ().getText());
        upDateUser.getPerson().setLastName(pU.getApellidosT().getText());
        upDateUser.getPerson().setLatitude(Double.parseDouble(pU.getLatitud().getText()));
        upDateUser.getPerson().setLongitude(Double.parseDouble(pU.getLogitud().getText()));
        upDateUser.getPerson().setName(pU.getNombresT().getText());
        upDateUser.getPerson().setPhone(pU.getTelefono().getText());
        upDateUser.getPerson().seteMail(pU.getEmail().getText());
        upDateUser.setPassword(pU.getContrasena().getText());
        upDateUser.setActive(pU.getActivo().isSelected());
        upDateUser.setRol(pU.getControladorUser().rolSeleccionado(pU.getRol().getSelectedIndex()));
        userControl.upDateUser(upDateUser);
        personControl.upDatePerson(upDateUser.getPerson());
        new ListUsers(usuario).setVisible(true);
        pU.dispose();
    }
}
