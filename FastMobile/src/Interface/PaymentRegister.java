/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Controllers.ClientController;
import Function.MenuController;
import Function.PaymentRegisterController;
import Function.ProfileClientsController;
import Function.RegisterClientController;
import Models.Client;
import Models.User;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTextField;

 /*
 * @author Fanfo
 */
public class PaymentRegister extends javax.swing.JFrame {
    
    MenuController menu_controller = new MenuController();
    RegisterClientController controladorClient = new RegisterClientController();
    ProfileClientsController controladorProfile = new ProfileClientsController();
    PaymentRegisterController controladorPaymentRegister = new PaymentRegisterController();
    ClientController clientController = new ClientController();
    User usuario;
    Client cliente;
       
    
    public PaymentRegister(User u) {
        usuario = u;
        initComponents();
        scaleImage();
        seAgrego.setVisible(false);
        System.out.println("HOLA USUARIO");
    }
       
    public PaymentRegister() {
        initComponents();
        scaleImage();
        seAgrego.setVisible(false);
        System.out.println("HOLA VACÍO");
    }
 
     public Client identificacionClaveCliente(String idClientS){
        int idClientINT = Integer.parseInt(idClientS);      
        cliente = clientController.getClient(idClientINT);
        
        nombreCliente.setText(cliente.getPerson().getName());
        apellidoCliente.setText(cliente.getPerson().getLastName());
        identificacionCliente.setText(cliente.getPerson().getId_Person());
        
        return cliente;
    }

    public void scaleImage(){
        
        ImageIcon icon = new ImageIcon("src\\Images\\Login\\FastMobileWhite.png");
        //Escalando para que se acomoden
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(fastMobileWhite.getWidth(),fastMobileWhite.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        fastMobileWhite.setIcon(scaledIcon);   
        
        icon = new ImageIcon("src\\Images\\Login\\userIcon.png");
        //Escalando para que se acomoden
        img = icon.getImage();
        imgScale = img.getScaledInstance(userIcon.getWidth(),userIcon.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        userIcon.setIcon(scaledIcon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Separador = new javax.swing.JPanel();
        White = new javax.swing.JPanel();
        seAgrego = new javax.swing.JLabel();
        formulario = new javax.swing.JPanel();
        nombresL = new javax.swing.JLabel();
        identificacionClave = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lineasTelefonicas = new javax.swing.JTable();
        datosDeLaLinea = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        nombreCliente = new javax.swing.JLabel();
        apellidoCliente = new javax.swing.JLabel();
        identificacionCliente = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        identificacion = new javax.swing.JLabel();
        registrarPago = new javax.swing.JButton();
        fastMobileWhite = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        getContentPane().setLayout(null);

        Separador.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout SeparadorLayout = new javax.swing.GroupLayout(Separador);
        Separador.setLayout(SeparadorLayout);
        SeparadorLayout.setHorizontalGroup(
            SeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        SeparadorLayout.setVerticalGroup(
            SeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(Separador);
        Separador.setBounds(0, 100, 1030, 10);

        White.setBackground(new java.awt.Color(255, 255, 255));
        White.setLayout(null);

        seAgrego.setBackground(new java.awt.Color(204, 255, 204));
        seAgrego.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        seAgrego.setForeground(new java.awt.Color(0, 102, 51));
        seAgrego.setText("Se registró el pago exitosamente.");
        White.add(seAgrego);
        seAgrego.setBounds(393, 452, 280, 25);

        nombresL.setText("Identificación del cliente:");

        identificacionClave.setText("Identificación");

        lineasTelefonicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número de línea", "Último pago registrado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(lineasTelefonicas);
        if (lineasTelefonicas.getColumnModel().getColumnCount() > 0) {
            lineasTelefonicas.getColumnModel().getColumn(0).setResizable(false);
            lineasTelefonicas.getColumnModel().getColumn(1).setResizable(false);
        }

        datosDeLaLinea.setText("Datos de la línea:");

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarCliente(evt);
            }
        });

        nombreCliente.setText("-");

        apellidoCliente.setText("-");

        identificacionCliente.setText("-");

        nombres.setText("Nombres:");

        apellidos.setText("Apellidos:");

        identificacion.setText("N° de identificación:");

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombresL)
                    .addComponent(identificacionClave)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datosDeLaLinea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(nombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(identificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(identificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nombresL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(identificacionClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(nombres)
                    .addComponent(nombreCliente)
                    .addComponent(apellidos)
                    .addComponent(apellidoCliente)
                    .addComponent(identificacion)
                    .addComponent(identificacionCliente))
                .addGap(12, 12, 12)
                .addComponent(datosDeLaLinea)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        White.add(formulario);
        formulario.setBounds(70, 140, 900, 260);

        registrarPago.setBackground(new java.awt.Color(255, 255, 255));
        registrarPago.setForeground(new java.awt.Color(41, 135, 217));
        registrarPago.setText("REGISTRAR PAGO");
        registrarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarPago(evt);
            }
        });
        White.add(registrarPago);
        registrarPago.setBounds(66, 446, 208, 42);

        fastMobileWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/FastMobileWhite.png"))); // NOI18N
        White.add(fastMobileWhite);
        fastMobileWhite.setBounds(20, 20, 140, 60);

        menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(41, 135, 217));
        menu.setText("Menú");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        White.add(menu);
        menu.setBounds(850, 40, 50, 20);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/userIcon.png"))); // NOI18N
        White.add(userIcon);
        userIcon.setBounds(920, 20, 60, 60);

        getContentPane().add(White);
        White.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarCliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCliente
        System.out.println("Buscando cliente en DB.");
        //1100288113
        //12345678
        controladorPaymentRegister.cargarTelefonosYFecha(lineasTelefonicas, identificacionClaveCliente(identificacionClave.getText()));
        //ACTUALIZAR TABLA
    }//GEN-LAST:event_buscarCliente

    private void registrarPago(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarPago
        // TODO add your handling code here:
        controladorPaymentRegister.actualizarFecha(lineasTelefonicas, cliente);
        seAgrego.setVisible(true);
    }//GEN-LAST:event_registrarPago

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        controladorPaymentRegister.goToMenu(this, usuario);
    }//GEN-LAST:event_menuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaymentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Separador;
    private javax.swing.JPanel White;
    private javax.swing.JLabel apellidoCliente;
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel datosDeLaLinea;
    private javax.swing.JLabel fastMobileWhite;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel identificacion;
    private javax.swing.JTextField identificacionClave;
    private javax.swing.JLabel identificacionCliente;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable lineasTelefonicas;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel nombreCliente;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel nombresL;
    private javax.swing.JButton registrarPago;
    private javax.swing.JLabel seAgrego;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
