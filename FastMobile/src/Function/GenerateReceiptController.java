/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.ClientController;
import Controllers.ConsumeController;
import Controllers.CounterController;
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
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;


/**
 *
 * @author Sara Maradiago
 */
public class GenerateReceiptController {
    SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");
    ClientController clientController = new ClientController();
    PaymentConroller paymentController = new PaymentConroller();
    ConsumeController cons = new ConsumeController();
    CounterController counterController = new CounterController();
    Client global_client;
    
    
    List<Client_Phone> telefonos = new ArrayList<Client_Phone>();
    String matriz[][];
           
    public void cargarTelefonosYFecha(JTable tabla, Client client){      
        global_client = client;
        telefonos = client.getPhones();
        matriz = new String[telefonos.size()][4];
        for (int i = 0; i < telefonos.size(); i++) {
            matriz[i][0] = telefonos.get(i).getPhone_Number();
            
            List<String> consumes = cons.getMonthlyConsumes(Month(), telefonos.get(i));
            matriz[i][1] = consumes.get(0);
            matriz[i][2] = consumes.get(1);
        }    
        tabla.setModel(new javax.swing.table.DefaultTableModel (
                matriz,
                new String[]{
                    "Número de línea", "Consumo Minutos","Consumo Datos"
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
        FileOutputStream ficheroPDF = new FileOutputStream("src\\Pdf\\"+global_client.getPerson().getId_Person()+".pdf");
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
        documento.add(new Phrase(global_client.getPerson().getName()+" "+global_client.getPerson().getLastName()));
        documento.add(new Phrase("\nDirección ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase(global_client.getPerson().getAddress()));
        documento.add(new Phrase("\nCédula ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase(global_client.getPerson().getId_Person()));
        documento.add(new Phrase("\nTeléfono ",FontFactory.getFont("arial",11,Font.BOLD)));
        documento.add(new Phrase(global_client.getPerson().getPhone()));
        documento.add(new Phrase("\nFecha de expedición ",FontFactory.getFont("arial",11,Font.BOLD)));
        java.util.Date date = new Date();
        documento.add(new Phrase(formatter4.format(date)));
        documento.add(new Phrase("\nFactura de venta No ",FontFactory.getFont("arial",11,Font.BOLD)));
        counterController.upDate();
        int counter = counterController.getCounter();
        documento.add(new Phrase(counter+""));
        
        float total = 0;
        
        PdfPCell cell = new PdfPCell(new Phrase ("Periodo de facturación",FontFactory.getFont("arial",11,Font.BOLD)));
                
        PdfPTable warning = new PdfPTable(1);
        cell.setPhrase(new Phrase ("Estimado cliente, pague oportunamente y evite la suspensión del servicio, cobro de reconexión por producto e intereses de mora: El incumplimiento en los pagos genera reportes a Centrales de Riesgo como moroso. Si ya realizó el pago, haga caso omiso.",FontFactory.getFont("arial",11)));
        cell.setPaddingBottom(20);
        cell.setPaddingLeft(10);
        cell.setPaddingRight(10);
        cell.setPaddingTop(10);
        cell.setBackgroundColor(new BaseColor(242, 229, 46));
        warning.addCell(cell);
        
        //warning
        PdfPTable basics = new PdfPTable(5);
        cell.setPhrase(new Phrase ("Teléfono",FontFactory.getFont("arial",11,Font.BOLD)));
        cell.setPaddingBottom(5);
        cell.setPaddingLeft(5);
        cell.setPaddingRight(5);
        cell.setPaddingTop(5);
        cell.setBackgroundColor(new BaseColor(41, 135, 217));
        basics.addCell(cell);
        cell.setPhrase(new Phrase ("Plan",FontFactory.getFont("arial",11,Font.BOLD)));
        basics.addCell(cell);
        cell.setPhrase(new Phrase ("Minutos",FontFactory.getFont("arial",11,Font.BOLD)));
        basics.addCell(cell);
        cell.setPhrase(new Phrase ("Datos",FontFactory.getFont("arial",11,Font.BOLD)));
        basics.addCell(cell);
        cell.setPhrase(new Phrase ("Precio (sin recargo)",FontFactory.getFont("arial",11,Font.BOLD)));
        basics.addCell(cell);
        //Espacio para el for    
        for(Client_Phone t: telefonos){
         basics.addCell(t.getPhone_Number());
         basics.addCell(t.getPlan().getName());
         basics.addCell(t.getPlan().getMinutes()+"");
         basics.addCell(t.getPlan().getInternet()+" GB");
         basics.addCell(parseToColombian(t.getPlan().getPrice()));   
         total += t.getPlan().getPrice();
        }         
        
        //basics
        PdfPTable min_extra = new PdfPTable(4);
        cell.setPhrase(new Phrase ("Teléfono",FontFactory.getFont("arial",11,Font.BOLD)));
        cell.setPaddingBottom(5);
        cell.setPaddingLeft(5);
        cell.setPaddingRight(5);
        cell.setPaddingTop(5);
        cell.setBackgroundColor(new BaseColor(41, 135, 217));
        min_extra.addCell(cell);
        cell.setPhrase(new Phrase ("Valor minuto extra",FontFactory.getFont("arial",11,Font.BOLD)));
        min_extra.addCell(cell);
        cell.setPhrase(new Phrase ("Minutos extra",FontFactory.getFont("arial",11,Font.BOLD)));
        min_extra.addCell(cell);
        cell.setPhrase(new Phrase ("Cobro",FontFactory.getFont("arial",11,Font.BOLD)));
        min_extra.addCell(cell);
        //Espacio para el for    
        int i = 0;
        for(Client_Phone t: telefonos){
         min_extra.addCell(t.getPhone_Number());
         float valorMinExtra;
         if(t.getPlan().getMinutes()>1000){
            valorMinExtra = 0;
         }else{
             valorMinExtra = t.getPlan().getPrice() / t.getPlan().getMinutes();
         }
         min_extra.addCell(parseToColombian(Math.round(valorMinExtra)));
         float minExtra = Integer.parseInt(matriz[i][1]) - t.getPlan().getMinutes();
         if(minExtra < 0){
            minExtra = 0;
         }
         min_extra.addCell(""+minExtra);
         min_extra.addCell(parseToColombian(Math.round(minExtra*valorMinExtra)));
         total += minExtra*valorMinExtra;
         i++;
        }
        
        //dat extra
        PdfPTable dat_extra = new PdfPTable(4);
        cell.setPhrase(new Phrase ("Teléfono",FontFactory.getFont("arial",11,Font.BOLD)));
        cell.setPaddingBottom(5);
        cell.setPaddingLeft(5);
        cell.setPaddingRight(5);
        cell.setPaddingTop(5);
        cell.setBackgroundColor(new BaseColor(41, 135, 217));
        dat_extra.addCell(cell);
        cell.setPhrase(new Phrase ("Valor recargo",FontFactory.getFont("arial",11,Font.BOLD)));
        dat_extra.addCell(cell);
        cell.setPhrase(new Phrase ("Datos extra",FontFactory.getFont("arial",11,Font.BOLD)));
        dat_extra.addCell(cell);
        cell.setPhrase(new Phrase ("Cobro",FontFactory.getFont("arial",11,Font.BOLD)));
        dat_extra.addCell(cell);
        //Espacio para el for    
        i = 0;
        for(Client_Phone t: telefonos){
         dat_extra.addCell(t.getPhone_Number());
         dat_extra.addCell(parseToColombian(Math.round(t.getPlan().getPrice()/2)));
         
         float datosExtra = Integer.parseInt(matriz[i][2])/1024 - t.getPlan().getInternet();
         float finale;
         if(datosExtra > 0){//si se gasto datos extra
             finale = t.getPlan().getPrice() + t.getPlan().getPrice()/2;
         }else{
             datosExtra = 0;
             finale = 0;
         }
         dat_extra.addCell(""+datosExtra+" GB");
         dat_extra.addCell(parseToColombian(Math.round(finale)));
         total += finale;
         i++;
        }
        
        //total
        PdfPTable tabla = new PdfPTable(2);        
        cell.setPhrase(new Phrase ("Periodo de facturación",FontFactory.getFont("arial",11,Font.BOLD)));
        cell.setBackgroundColor(new BaseColor(41, 135, 217));
        cell.setPaddingBottom(5);
        tabla.addCell(cell);
        String[] actualMonth = Month();
        tabla.addCell(actualMonth[0]+" hasta "+actualMonth[1]);
        cell.setPhrase(new Phrase ("Fecha límite de pago",FontFactory.getFont("arial",11,Font.BOLD)));
        tabla.addCell(cell);
        tabla.addCell(actualMonth[1]);
        cell.setPhrase(new Phrase ("Total a pagar",FontFactory.getFont("arial",11,Font.BOLD)));
        tabla.addCell(cell);
        tabla.addCell(parseToColombian(Math.round(total)));
        
        documento.add(new Phrase("\n"));
        documento.add(tabla);
        documento.add(new Phrase("\n"));
        documento.add(warning);
        documento.add(new Phrase("\n"));
        documento.add(basics);        
        documento.add(new Phrase("\n"));
        documento.add(min_extra);
        documento.add(new Phrase("\n"));
        documento.add(dat_extra);
        
        documento.add(new Phrase("\n"));
        Barcode128 barcode128 = new Barcode128();
        barcode128.setCode("(415)"+counter+"(8021)"+global_client.getPerson().getId_Person()+"(3902)"+total+"(96)"+actualMonth[1]);//(415)7707247180153(8021)ID(3902)VALOR(96)PERIODO
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
    
    public String[] Month(){
        //Getting the current date value
        String[] lastDay = {"31","28","31","30","31","30","31","31","30","31","30","31"};
        java.util.Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        
        String[] dates = {year+"-"+(month+1)+"-01",year+"-"+(month+1)+"-"+lastDay[month]};
        //System.out.println(month);
        System.out.println(dates[0]+" "+dates[1]);
        return dates;
    }
    
    public String parseToColombian(int num){
        String full = String.valueOf(num);
        String colombian = "";
        int size = full.length();
        
        int punto = 0;
        for(int i = size-1; i>=0;i--){
            punto++;
            if(punto % 3 == 1 && punto != 1){
                colombian = full.charAt(i) + "." + colombian;
            }else{
                colombian = full.charAt(i) + colombian;
            }
            
        }
        colombian = "$"+colombian;
        
        return colombian;
    }
    
    public void goToMenu(GenerateReceipt generateReceiptM, User usuario){
            new Menu(usuario).setVisible(true);
            generateReceiptM.dispose();
    }
}
