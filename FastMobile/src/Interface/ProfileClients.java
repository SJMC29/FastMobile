/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Function.MenuController;
import Function.ProfileClientsController;
import Function.RegisterClientController;
import Models.Client;
import Models.User;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Fanfo
 */
public class ProfileClients extends javax.swing.JFrame {

    Client client;
    MenuController menu_controller = new MenuController();
    RegisterClientController controladorClient = new RegisterClientController();
    ProfileClientsController controladorProfile = new ProfileClientsController();
    User usuario;
    /**
     * Creates new form Menu
     */
    public ProfileClients(Client c, User u) {
        usuario = u;
        client = c;
        initComponents();
        scaleImage();
        seAgrego.setVisible(false);
        nombresT.setText(c.getPerson().getName());
        apellidosT.setText(c.getPerson().getLastName());
        identificacionT.setText(c.getPerson().getId_Person());
        email.setText(c.getPerson().geteMail());
        telefono.setText(c.getPerson().getPhone());
        direction.setText(c.getPerson().getAddress());
        suspendido.setSelected(c.isSuspended());
        controladorClient.loadTypes(tipo);
        tipo.setSelectedIndex(c.getClien_Type().getId_type()-1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");             
        String strDate = dateFormat.format(c.getLastPayment());  
        ultimoPago.setText(strDate);
        controladorProfile.cargarTelefonos(tabla, c);
        latitudT.setText(String.valueOf(c.getPerson().getLatitude()));
        logitudT.setText(String.valueOf(c.getPerson().getLongitude()));
    }
    
    public ProfileClients() {
        initComponents();
        scaleImage();
        seAgrego.setVisible(false);
    }

    public JTextField getApellidosT() {
        return apellidosT;
    }

    public JTextField getDirection() {
        return direction;
    }

    public JTextField getEmail() {
        return email;
    }

    public JTextField getIdentificacionT() {
        return identificacionT;
    }

    public JTextField getLatitudT() {
        return latitudT;
    }

    public JTextField getLogitudT() {
        return logitudT;
    }

    public JTextField getNombresT() {
        return nombresT;
    }

    public JRadioButton getSuspendido() {
        return suspendido;
    }

    public JTable getTabla() {
        return tabla;
    }

    public JTextField getTelefono() {
        return telefono;
    }

    public JComboBox<String> getTipo() {
        return tipo;
    }

    public JTextField getUltimoPago() {
        return ultimoPago;
    }

    public Client getClient() {
        return client;
    }

    public RegisterClientController getControladorClient() {
        return controladorClient;
    }    
    

    public void scaleImage(){
        ImageIcon icon = new ImageIcon("src\\Images\\Login\\FastMobileWhite.png");
        //Escalando para que se acomoden
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(fastMobileWhite.getWidth(),fastMobileWhite.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        fastMobileWhite.setIcon(scaledIcon);   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TOP = new javax.swing.JPanel();
        fastMobileWhite = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        centroAdmin2 = new javax.swing.JLabel();
        Separador = new javax.swing.JPanel();
        White = new javax.swing.JPanel();
        seAgrego = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        formulario = new javax.swing.JPanel();
        nombresL = new javax.swing.JLabel();
        apellidosL = new javax.swing.JLabel();
        tipoCliente = new javax.swing.JLabel();
        numeroIdentificacion = new javax.swing.JLabel();
        nombresT = new javax.swing.JTextField();
        apellidosT = new javax.swing.JTextField();
        identificacionT = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        latitudJ = new javax.swing.JLabel();
        longitudJ = new javax.swing.JLabel();
        latitudT = new javax.swing.JTextField();
        logitudT = new javax.swing.JTextField();
        emailJ = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        telefonoJ = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        direction = new javax.swing.JTextField();
        suspendido = new javax.swing.JRadioButton();
        ultimoPagoJ = new javax.swing.JLabel();
        ultimoPago = new javax.swing.JTextField();
        telefonosPlanJ = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        actualizarCliente = new javax.swing.JButton();
        centroAdmin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        getContentPane().setLayout(null);

        TOP.setBackground(new java.awt.Color(255, 255, 255));
        TOP.setPreferredSize(new java.awt.Dimension(1024, 100));
        TOP.setLayout(null);

        fastMobileWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/FastMobileWhite.png"))); // NOI18N
        TOP.add(fastMobileWhite);
        fastMobileWhite.setBounds(20, 20, 140, 60);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/userIcon.png"))); // NOI18N
        TOP.add(userIcon);
        userIcon.setBounds(920, 20, 60, 60);

        menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(41, 135, 217));
        menu.setText("Menú");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        TOP.add(menu);
        menu.setBounds(850, 40, 50, 20);

        centroAdmin2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        centroAdmin2.setText("CENTRO DE ADMINISTRACIÓN FAST MOBILE");
        TOP.add(centroAdmin2);
        centroAdmin2.setBounds(350, 40, 316, 19);

        getContentPane().add(TOP);
        TOP.setBounds(0, 0, 1030, 100);

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
        seAgrego.setText("Se actualizó al cliente exitosamente.");
        White.add(seAgrego);
        seAgrego.setBounds(393, 452, 309, 25);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        formulario.setPreferredSize(new java.awt.Dimension(1086, 790));
        formulario.setRequestFocusEnabled(false);

        nombresL.setText("Nombres:");

        apellidosL.setText("Apellidos:");

        tipoCliente.setText("Tipo de cliente:");

        numeroIdentificacion.setText("Número de identificación:");

        nombresT.setText("Nombres");

        apellidosT.setText("Apellidos");

        identificacionT.setText("Número de identificación");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        latitudJ.setText("Latitud:");

        longitudJ.setText("Longitud:");

        latitudT.setText("Latitud");

        logitudT.setText("Longitud");

        emailJ.setText("Correo electrónico:");

        email.setText("Correo electrónico");

        telefonoJ.setText("Teléfono:");

        telefono.setText("Teléfono");

        direccion.setText("Dirección de residencia:");

        direction.setText("Dirección de residencia");

        suspendido.setText("Suspendido");

        ultimoPagoJ.setText("Última fecha de pago:");

        ultimoPago.setText("Última fecha de pago");

        telefonosPlanJ.setText("Teléfonos y respectivo plan:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Number", "Plan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonosPlanJ)
                    .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ultimoPago, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(direction, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(identificacionT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                        .addComponent(tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apellidosT, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ultimoPagoJ, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(suspendido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(direccion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefonoJ, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(emailJ, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numeroIdentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tipoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(apellidosL, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombresL, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioLayout.createSequentialGroup()
                            .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(latitudJ)
                                .addComponent(latitudT, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(longitudJ)
                                .addComponent(logitudT, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(nombresT, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nombresL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombresT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apellidosL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidosT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(tipoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(numeroIdentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(identificacionT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefonoJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitudJ)
                    .addComponent(longitudJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitudT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logitudT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suspendido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ultimoPagoJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ultimoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefonosPlanJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(formulario);

        White.add(jScrollPane1);
        jScrollPane1.setBounds(68, 166, 910, 250);

        actualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        actualizarCliente.setForeground(new java.awt.Color(41, 135, 217));
        actualizarCliente.setText("ACTUALIZAR CLIENTE");
        actualizarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seAgrego(evt);
            }
        });
        White.add(actualizarCliente);
        actualizarCliente.setBounds(66, 446, 208, 42);

        centroAdmin1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        centroAdmin1.setText("Actualización de clientes.");
        White.add(centroAdmin1);
        centroAdmin1.setBounds(100, 130, 287, 19);

        getContentPane().add(White);
        White.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seAgrego(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seAgrego
        controladorProfile.actualizarDatos(this);
        seAgrego.setVisible(true);
    }//GEN-LAST:event_seAgrego

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        controladorProfile.goToMenu(this, usuario);
    }//GEN-LAST:event_menuMouseClicked

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        menu.setForeground(new Color(242,229,46));
        menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        menu.setForeground(new Color(41,135,217));
    }//GEN-LAST:event_menuMouseExited

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
            java.util.logging.Logger.getLogger(ProfileClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ProfileClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Separador;
    private javax.swing.JPanel TOP;
    private javax.swing.JPanel White;
    private javax.swing.JButton actualizarCliente;
    private javax.swing.JLabel apellidosL;
    private javax.swing.JTextField apellidosT;
    private javax.swing.JLabel centroAdmin1;
    private javax.swing.JLabel centroAdmin2;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField direction;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailJ;
    private javax.swing.JLabel fastMobileWhite;
    private javax.swing.JPanel formulario;
    private javax.swing.JTextField identificacionT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel latitudJ;
    private javax.swing.JTextField latitudT;
    private javax.swing.JTextField logitudT;
    private javax.swing.JLabel longitudJ;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel nombresL;
    private javax.swing.JTextField nombresT;
    private javax.swing.JLabel numeroIdentificacion;
    private javax.swing.JLabel seAgrego;
    private javax.swing.JRadioButton suspendido;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefonoJ;
    private javax.swing.JLabel telefonosPlanJ;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JLabel tipoCliente;
    private javax.swing.JTextField ultimoPago;
    private javax.swing.JLabel ultimoPagoJ;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
