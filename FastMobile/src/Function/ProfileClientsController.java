/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.ClientController;
import Controllers.Client_PhoneController;
import Controllers.PersonController;
import Interface.ListClients;
import Interface.Login;
import Interface.Menu;
import Interface.ProfileClients;
import Interface.ProfileUsers;
import Models.Client;
import Models.Client_Phone;
import Models.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Sara Maradiago
 */
public class ProfileClientsController {
    
    Client_PhoneController clientPhoneController = new Client_PhoneController();
    ClientController clientController = new ClientController();
    PersonController personController = new PersonController();
    List<Client_Phone> telefonos;
    
    public void cargarTelefonos(JTable tabla, Client client){
        telefonos = client.getPhones();
        String matriz[][] = new String[telefonos.size()][2];
        for (int i = 0; i < telefonos.size(); i++) {
            matriz[i][0] = telefonos.get(i).getPhone_Number();
            matriz[i][1] = telefonos.get(i).getPlan().getName();
        }    
        tabla.setModel(new javax.swing.table.DefaultTableModel (
                matriz,
                new String[]{
                    "Number", "Plan"
                }        
        ));
    }
    
    public void actualizarDatos(ProfileClients pC, User u){
         SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");  
        Client clienteAct = pC.getClient();
        
        //System.out.println(clienteAct.getPerson().getName());
        
        clienteAct.getPerson().setName(pC.getNombresT().getText());
        
        //System.out.println(clienteAct.getPerson().getName());
        
        clienteAct.getPerson().setLastName(pC.getApellidosT().getText());
        // clienteAct.getPerson().setId_Person(pC.getIdentificacionT().getText());
        clienteAct.getPerson().seteMail(pC.getEmail().getText());
        clienteAct.getPerson().setPhone(pC.getTelefono().getText());
        clienteAct.getPerson().setAddress(pC.getDirection().getText());
        clienteAct.getPerson().setLatitude(Double.parseDouble(pC.getLatitudT().getText()));
        clienteAct.getPerson().setLongitude(Double.parseDouble(pC.getLogitudT().getText()));
        clienteAct.setSuspended(pC.getSuspendido().isSelected());
        try {
            clienteAct.setLastPayment(formatter4.parse(pC.getUltimoPago().getText()));
        } catch (ParseException ex) {
            Logger.getLogger(ProfileClientsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        clienteAct.setClien_Type(pC.getControladorClient().tipoSeleccionado(pC.getTipo().getSelectedIndex()));
        
        clientController.upDateClient(clienteAct);
        personController.upDatePerson(clienteAct.getPerson());
        
        new ListClients(u).setVisible(true);
        pC.dispose();
    }
    
    public void logOut(ProfileClients profileClient){
            new Login().setVisible(true);
            profileClient.dispose();
    }     
    
    public void goToMenu(ProfileClients profileClient, User usuario){
            new Menu(usuario).setVisible(true);
            profileClient.dispose();
    }
}
