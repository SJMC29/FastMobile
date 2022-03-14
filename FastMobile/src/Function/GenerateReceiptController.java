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
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
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
        PdfWriter pdfWriter = PdfWriter.getInstance(documento, ficheroPDF);
        documento.open();
        
        //if you would have a chapter indentation
        int indentation = 0;
        Image logo = Image.getInstance("src\\Images\\Menu\\FastMobileBlue.png");
        float scaler = ((documento.getPageSize().getWidth() - documento.leftMargin()
               - documento.rightMargin() - indentation) / logo.getWidth()) * 100;
        logo.scalePercent(scaler);
        
        documento.add(logo);
        Paragraph titulo = new Paragraph("Fast Mobile: La mayor cobertura en el menor tiempo.\n",FontFactory.getFont("arial",14,Font.BOLD,new BaseColor(41, 135, 217)));        
        documento.add(titulo);
        
        documento.add(new Phrase("\nCliente ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase("-----"));
        documento.add(new Phrase("\nDirección ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase("-----"));
        documento.add(new Phrase("\nCédula ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase("-----"));
        documento.add(new Phrase("\nTeléfono ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase("-----"));
        documento.add(new Phrase("\nFecha de expedición ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase("-----"));
        documento.add(new Phrase("\nFactura de venta No ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase("-----"));
        
        PdfPTable tabla = new PdfPTable(2);
        PdfPCell cell = new PdfPCell(new Phrase ("Periodo de facturación",FontFactory.getFont("arial",11,Font.BOLD)));
        cell.setBackgroundColor(new BaseColor(41, 135, 217));
        cell.setPaddingBottom(5);
        tabla.addCell(cell);
        tabla.addCell("-----");
        cell.setPhrase(new Phrase ("Fecha límite de pago",FontFactory.getFont("arial",11,Font.BOLD)));
        tabla.addCell(cell);
        tabla.addCell("-----");
        cell.setPhrase(new Phrase ("Total a pagar",FontFactory.getFont("arial",11,Font.BOLD)));
        tabla.addCell(cell);
        tabla.addCell("-----");
        documento.add(tabla);
        
        documento.add(new Phrase(" "));
        tabla = new PdfPTable(1);
        //cell.setPhrase(new Phrase ("Estimado cliente, pague oportunamente y evite la suspensión del servicio, cobro de reconexión por producto e intereses de mora: El incumplimiento en los pagos genera reportes a Centrales de Riesgo. Si ya realizó el pago, haga caso omiso.",FontFactory.getFont("arial",12,Font.BOLD)));
        cell.setPhrase(new Phrase ("Estimado cliente, pague oportunamente y evite la suspensión del servicio, cobro de reconexión por producto e intereses de mora: El incumplimiento en los pagos genera reportes a Centrales de Riesgo como moroso. Si ya realizó el pago, haga caso omiso.",FontFactory.getFont("arial",11)));
        cell.setPaddingBottom(20);
        cell.setPaddingLeft(10);
        cell.setPaddingRight(10);
        cell.setPaddingTop(10);
        cell.setBackgroundColor(new BaseColor(242, 229, 46));
        tabla.addCell(cell);
        documento.add(tabla);

        documento.add(new Phrase(" "));
        tabla = new PdfPTable(3);  
        cell.setPhrase(new Phrase ("LINEA ASOCIADA",FontFactory.getFont("arial",11,Font.BOLD)));
        cell.setPaddingBottom(5);
        cell.setPaddingLeft(5);
        cell.setPaddingRight(5);
        cell.setPaddingTop(5);
        cell.setBackgroundColor(new BaseColor(41, 135, 217));
        tabla.addCell(cell);
        cell.setPhrase(new Phrase ("PLAN",FontFactory.getFont("arial",11,Font.BOLD)));
        tabla.addCell(cell);
        cell.setPhrase(new Phrase ("MINUTOS",FontFactory.getFont("arial",11,Font.BOLD)));
        tabla.addCell(cell);
        //Espacio para el for    
        tabla.addCell("31454312");
        tabla.addCell("Ilimitado");
        tabla.addCell("72");
        tabla.addCell("31454312");
        tabla.addCell("Ilimitado");
        tabla.addCell("72");
        tabla.addCell("31454312");
        tabla.addCell("Ilimitado");
        tabla.addCell("72");
        documento.add(tabla);
                
        documento.add(new Phrase("\n"));
        Barcode128 barcode128 = new Barcode128();
        barcode128.setCode("hola");//(415)7707247180153(8021)ID(3902)VALOR(96)PERIODO
        barcode128.setCodeType(Barcode128.CODE128);
        PdfContentByte pdfContentByte = pdfWriter.getDirectContent();
        Image code128Image = barcode128.createImageWithBarcode(pdfContentByte, null, null);
        //code128Image.setAbsolutePosition(10, 700);
        code128Image.scalePercent(100);
        code128Image.setAlignment(Image.MIDDLE);
        documento.add(code128Image);
        //PdfPTable table = PdfPTable();
        
        documento.close();
        
    }
    
    public void goToMenu(GenerateReceipt generateReceiptM, User usuario){
            new Menu(usuario).setVisible(true);
            generateReceiptM.dispose();
    }
}
