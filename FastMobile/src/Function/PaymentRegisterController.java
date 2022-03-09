/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.ClientController;
import Interface.Menu;
import Interface.PaymentRegister;
import Models.Client;
import Models.Client_Phone;
import Models.User;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Sara Maradiago
 */
public class PaymentRegisterController {
    SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");
    ClientController clientController = new ClientController();
           
    public void cargarTelefonosYFecha(JTable tabla, Client client){             
        List<Client_Phone> telefonos = client.getPhones();
        String matriz[][] = new String[telefonos.size()][2];
        for (int i = 0; i < telefonos.size(); i++) {
            matriz[i][0] = telefonos.get(i).getPhone_Number();
            matriz[i][1] = formatter4.format(client.getLastPayment());
        }    
        tabla.setModel(new javax.swing.table.DefaultTableModel (
                matriz,
                new String[]{
                    "Línea", "Último pago"
                }        
        ));
    }

    public void actualizarFecha(JTable tabla, Client client){
        List<Client_Phone> telefonos = client.getPhones();
        Date hoy = new Date();
        
        System.out.println(client.getLastPayment());
        
        for (int i = 0; i < telefonos.size(); i++) {
            tabla.setValueAt(hoy, i, 1);
        }
        client.setLastPayment(hoy);
        clientController.upDateClient(client);
        //System.out.println(client.getLastPayment());
    }
    
    public void goToMenu(PaymentRegister paymentRegisterM, User usuario){
            new Menu(usuario).setVisible(true);
            paymentRegisterM.dispose();
    }
}
