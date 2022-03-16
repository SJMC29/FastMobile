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
import Interface.RegisterUser;
import java.awt.Color;

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
            reset_bg(pU);
            if(validation(pU) == 0){
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
                System.out.println("aodlkasda");
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
    
    public Integer validation(ProfileUsers ru){
        Integer error = 0;      
                      
        if(ru.getNombresT().getText().equals("")){
            error = 1;
            ru.getNombresT().setBackground(new Color(255,200,200));
            System.out.println("error nombre");
        }
        
        if(ru.getContrasena().getText().equals(ru.getIdentificacionT().getText())){
            error = 1;
            ru.getContrasena().setBackground(new Color(255,200,200));
            ru.getIdentificacionT().setBackground(new Color(255,200,200));
            System.out.println("error nombre x cedula");
        }
                
        if(ru.getApellidosT().getText().equals("")){
            error = 1;
            ru.getApellidosT().setBackground(new Color(255,200,200));
            System.out.println("error apellido");
        }
        
        if(ru.getEmail().getText().equals("")){
            error = 1;
            ru.getEmail().setBackground(new Color(255,200,200));
            System.out.println("error mail");
        }
        if(ru.getTelefono().getText().equals("")){
            error = 1;
            ru.getTelefono().setBackground(new Color(255,200,200));
            System.out.println("error phone");
        }
        if(ru.getDireccionJ().getText().equals("")){
            error = 1;
            ru.getDireccionJ().setBackground(new Color(255,200,200));
            System.out.println("error address");
        }
        if(ru.getLatitud().getText().equals("") || !isNumeric(ru.getLatitud().getText())){
            error = 1;
            ru.getLatitud().setBackground(new Color(255,200,200));
            System.out.println("error latitude");
        }
        if(ru.getLogitud().getText().equals("") || !isNumeric(ru.getLogitud().getText())){
            error = 1;
            ru.getLogitud().setBackground(new Color(255,200,200));
            System.out.println("error longitude");
        }
        
        if(ru.getContrasena().getText().equals("")){
            error = 1;
            ru.getContrasena().setBackground(new Color(255,200,200));
            System.out.println("error identificacion");
        }        
        return error;
    }
    
    public void reset_bg(ProfileUsers pu){
        pu.getNombresT().setBackground(new Color(255,255,255));
        pu.getApellidosT().setBackground(new Color(255,255,255));
        pu.getEmail().setBackground(new Color(255,255,255));
        pu.getTelefono().setBackground(new Color(255,255,255));
        pu.getDireccionJ().setBackground(new Color(255,255,255));
        pu.getLatitud().setBackground(new Color(255,255,255));
        pu.getLogitud().setBackground(new Color(255,255,255));
        pu.getIdentificacionT().setBackground(new Color(255,255,255));    
        pu.getContrasena().setBackground(new Color(255,255,255));        
    }
}
