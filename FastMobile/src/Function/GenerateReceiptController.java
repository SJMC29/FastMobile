/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.ClientController;
import Controllers.PaymentConroller;
import Interface.GenerateReceipt;
import Interface.Menu;
import Interface.PaymentRegister;
import Models.Client;
import Models.Client_Phone;
import Models.Payment;
import Models.User;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;



import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author Sara Maradiago
 */
public class GenerateReceiptController {
    SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");
    ClientController clientController = new ClientController();
    PaymentConroller paymentController = new PaymentConroller();
           
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
        int amount = 0;
        System.out.println(client.getLastPayment());
        
        for (int i = 0; i < telefonos.size(); i++) {
            tabla.setValueAt(hoy, i, 1);
            amount += telefonos.get(i).getPlan().getPrice();
        }
        //System.out.println(amount);
        client.setLastPayment(hoy);
        clientController.upDateClient(client);
        Payment payment = new Payment(client, amount, hoy);
        paymentController.createPayment(payment);
        //System.out.println(client.getLastPayment());
        
    }
    
    public void createPdf() throws FileNotFoundException, DocumentException, BadElementException, IOException{
        
        
        
//Image logo = "src\\Images\\Login\\FastMobileWhite.png";
        Document documento = new Document();
        FileOutputStream ficheroPDF = new FileOutputStream("src\\Pdf\\hello_world.pdf");
        PdfWriter.getInstance(documento, ficheroPDF);
        documento.open();
        
        Image logo = Image.getInstance("src\\Images\\Menu\\FastMobileBlue.png");
        documento.add(logo);
        Paragraph titulo = new Paragraph("lista de personas \n\n",FontFactory.getFont("arial",22,Font.BOLD,BaseColor.BLUE));        
        documento.add(titulo);
        
        PdfPTable tabla = new PdfPTable(3);
        
        tabla.addCell("ID");
        tabla.addCell("NOMBRE");
        tabla.addCell("TELEFONO");
        
        documento.add(tabla);
        
        
        //PdfPTable table = PdfPTable();
        
        documento.close();
        
    }
    
    public void goToMenu(GenerateReceipt generateReceiptM, User usuario){
            new Menu(usuario).setVisible(true);
            generateReceiptM.dispose();
    }
}
