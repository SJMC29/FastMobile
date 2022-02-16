/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Function.MenuController;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Fanfo
 */
public class ProfileClients extends javax.swing.JFrame {

    MenuController menu_controller = new MenuController();
    /**
     * Creates new form Menu
     */
    public ProfileClients() {
        initComponents();
        scaleImage();
        seAgrego.setVisible(false);
    }

    public void scaleImage(){
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Blue = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        White = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        formulario = new javax.swing.JPanel();
        nombresL = new javax.swing.JLabel();
        apellidosL = new javax.swing.JLabel();
        tipoCliente = new javax.swing.JLabel();
        numeroIdentificacion = new javax.swing.JLabel();
        nombresT = new javax.swing.JTextField();
        apellidosT = new javax.swing.JTextField();
        identificacionT = new javax.swing.JTextField();
        rol = new javax.swing.JComboBox<>();
        latitudJ = new javax.swing.JLabel();
        longitudJ = new javax.swing.JLabel();
        latitudT = new javax.swing.JTextField();
        logitud = new javax.swing.JTextField();
        emailJ = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        telefonoJ = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        telefono1 = new javax.swing.JTextField();
        suspendido = new javax.swing.JRadioButton();
        ultimoPagoJ = new javax.swing.JLabel();
        ultimoPago = new javax.swing.JTextField();
        telefonosPlanJ = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        seAgrego = new javax.swing.JLabel();
        crearUsuario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        getContentPane().setLayout(null);

        Blue.setBackground(new java.awt.Color(41, 135, 217));
        Blue.setPreferredSize(new java.awt.Dimension(0, 100));
        Blue.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Perfil de cliente");
        Blue.add(jLabel1);
        jLabel1.setBounds(30, 20, 310, 43);

        Menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menú");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToMenu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
        });
        Blue.add(Menu);
        Menu.setBounds(30, 70, 60, 16);

        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Cerrar sesión");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        Blue.add(logout);
        logout.setBounds(70, 70, 72, 16);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu/Back.png"))); // NOI18N
        back.setMaximumSize(new java.awt.Dimension(65, 65));
        back.setMinimumSize(new java.awt.Dimension(65, 65));
        back.setPreferredSize(new java.awt.Dimension(65, 65));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
        });
        Blue.add(back);
        back.setBounds(940, 30, 50, 50);

        getContentPane().add(Blue);
        Blue.setBounds(0, 0, 1024, 100);

        White.setBackground(new java.awt.Color(255, 255, 255));

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

        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        latitudJ.setText("Latitud:");

        longitudJ.setText("Longitud:");

        latitudT.setText("Latitud");

        logitud.setText("Longitud");

        emailJ.setText("Correo electrónico:");

        email.setText("Correo electrónico");

        telefonoJ.setText("Teléfono:");

        telefono.setText("Teléfono");

        direccion.setText("Dirección de residencia:");

        telefono1.setText("Dirección de residencia");

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
                        .addComponent(telefono1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(identificacionT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                        .addComponent(rol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(logitud, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitudJ)
                    .addComponent(longitudJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitudT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        seAgrego.setBackground(new java.awt.Color(204, 255, 204));
        seAgrego.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        seAgrego.setForeground(new java.awt.Color(0, 102, 51));
        seAgrego.setText("Se actualizó al cliente exitosamente.");

        crearUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        crearUsuario1.setForeground(new java.awt.Color(41, 135, 217));
        crearUsuario1.setText("CREAR USUSARIO");
        crearUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seAgrego(evt);
            }
        });

        javax.swing.GroupLayout WhiteLayout = new javax.swing.GroupLayout(White);
        White.setLayout(WhiteLayout);
        WhiteLayout.setHorizontalGroup(
            WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(WhiteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(crearUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(seAgrego)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        WhiteLayout.setVerticalGroup(
            WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seAgrego)
                    .addComponent(crearUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        getContentPane().add(White);
        White.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        Menu.setForeground(new Color(242,229,46));
        Menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        Menu.setForeground(Color.white);
    }//GEN-LAST:event_MenuMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setForeground(new Color(242,229,46));
        logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(Color.white);
    }//GEN-LAST:event_logoutMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_backMouseEntered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        //menu_controller.logOut(this);
    }//GEN-LAST:event_logoutMouseClicked

    private void goToMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToMenu
        // TODO add your handling code here:
    }//GEN-LAST:event_goToMenu

    private void seAgrego(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seAgrego
        seAgrego.setVisible(true);
    }//GEN-LAST:event_seAgrego

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
    private javax.swing.JPanel Blue;
    private javax.swing.JLabel Menu;
    private javax.swing.JPanel White;
    private javax.swing.JLabel apellidosL;
    private javax.swing.JTextField apellidosT;
    private javax.swing.JLabel back;
    private javax.swing.JButton crearUsuario1;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailJ;
    private javax.swing.JPanel formulario;
    private javax.swing.JTextField identificacionT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel latitudJ;
    private javax.swing.JTextField latitudT;
    private javax.swing.JTextField logitud;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel longitudJ;
    private javax.swing.JLabel nombresL;
    private javax.swing.JTextField nombresT;
    private javax.swing.JLabel numeroIdentificacion;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JLabel seAgrego;
    private javax.swing.JRadioButton suspendido;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefono1;
    private javax.swing.JLabel telefonoJ;
    private javax.swing.JLabel telefonosPlanJ;
    private javax.swing.JLabel tipoCliente;
    private javax.swing.JTextField ultimoPago;
    private javax.swing.JLabel ultimoPagoJ;
    // End of variables declaration//GEN-END:variables
}
