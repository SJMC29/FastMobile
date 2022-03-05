/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.ClientController;
import Controllers.UserController;
import Interface.ListUsers;
import Interface.ListUsers;
import Interface.Login;
import Interface.Menu;
import Interface.ProfileUsers;
import Interface.ProfileUsers;
import Interface.RegisterUser;
import Models.Client;
import Models.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Sara Maradiago
 */
public class ListUsersController {
    UserController controladorUser = new UserController();
    List<User> users;
    int cantidadAMostrar = 16;
    int firstElement = 0;
    int maxUsers = controladorUser.getCounterUsers();
    
    public void nextPage(JTable table){
        
        if (firstElement >= maxUsers){
            System.out.println("No hay más clientes para mostrar.");
        }
        else{
            users = controladorUser.getUsers(cantidadAMostrar, firstElement);        
            String matriz[][] = new String[users.size()][7];

            for (int i = 0; i < users.size(); i++){
                matriz[i][0] = users.get(i).getPerson().getId_Person();
                matriz[i][1] = users.get(i).getPerson().getName();
                matriz[i][2] = users.get(i).getPerson().getLastName();
                matriz[i][3] = users.get(i).getPerson().geteMail();
                matriz[i][4] = users.get(i).getPerson().getAddress();
                matriz[i][5] = users.get(i).getPerson().getPhone();
                if (users.get(i).isActive() == true){
                    matriz[i][6] = "Sí";
                    } 
                else{
                    matriz[i][6] = "No";
                }
            }

            table.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String [] {
                    "Identificación", "Nombres", "Apellidos", "e-mail", "Dirección ", "Teléfono ", "Activo"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            firstElement+=cantidadAMostrar;
        }
    }
    
    public void logOut(ListUsers listUsers){
            new Login().setVisible(true);
            listUsers.dispose();
    }
    
    public void goToClientProfile(ListUsers listUsers, int i, User usuario){
        new ProfileUsers(users.get(i), usuario).setVisible(true);
        listUsers.dispose();   
    }
    
    public void goToMenu(ListUsers listUsers, User usuario){
            new Menu(usuario).setVisible(true);
            listUsers.dispose();
    }
}
