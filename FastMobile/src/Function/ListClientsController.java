/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.ClientController;
import Models.Client;
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
    
    public void nextPage(JTable table){
        clients = controladorCliente.getClients(cantidadAMostrar, firstElement);
    }
}
