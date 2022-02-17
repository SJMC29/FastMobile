/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.ClientController;
import Interface.ListClients;
import Interface.Login;
import Interface.Menu;
import Interface.ProfileClients;
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
public class ListClientsController {
    ClientController controladorCliente = new ClientController();
    List<Client> clients;
    int cantidadAMostrar = 16;
    int firstElement = 0;
    int maxClientes = controladorCliente.getCounterClientes();
    
    public void nextPage(JTable table){
        
        if (firstElement >= maxClientes){
            System.out.println("No hay más clientes para mostrar.");
        }
        else{
            clients = controladorCliente.getClients(cantidadAMostrar, firstElement);        
            String matriz[][] = new String[clients.size()][7];

            for (int i = 0; i < clients.size(); i++){
                matriz[i][0] = clients.get(i).getPerson().getId_Person();
                matriz[i][1] = clients.get(i).getPerson().getName();
                matriz[i][2] = clients.get(i).getPerson().getLastName();
                matriz[i][3] = clients.get(i).getPerson().geteMail();
                matriz[i][4] = clients.get(i).getPerson().getAddress();
                matriz[i][5] = clients.get(i).getPerson().getPhone();
                if (clients.get(i).isSuspended() == true){
                    matriz[i][6] = "Sí";
                    } 
                else{
                    matriz[i][6] = "No";
                }
            }

            table.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String [] {
                    "Identificación", "Nombres", "Apellidos", "e-mail", "Dirección ", "Teléfono ", "Suspendido"
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
    
    public void logOut(ListClients listClients){
            new Login().setVisible(true);
            listClients.dispose();
    }
    
    public void goToClientProfile(ListClients listClients, int i, User usuario){
        new ProfileClients(clients.get(i), usuario).setVisible(true);
        listClients.dispose();   
    }
    
    public void goToMenu(ListClients listClients, User usuario){
            new Menu(usuario).setVisible(true);
            listClients.dispose();
    }
}
