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
public class ProfileUsers extends javax.swing.JFrame {

    MenuController menu_controller = new MenuController();
    /**
     * Creates new form Menu
     */
    public ProfileUsers() {
        initComponents();
        scaleImage();
        seAgrego.setVisible(false);
    }

    public void scaleImage(){
        ImageIcon icon = new ImageIcon("src\\Images\\Login\\userIcon.png");
        //Escalando para que se acomoden
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(userImage.getWidth(),userImage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        userImage.setIcon(scaledIcon);

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
        userImage = new javax.swing.JLabel();
        White = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        formulario = new javax.swing.JPanel();
        nombresL = new javax.swing.JLabel();
        apellidosL = new javax.swing.JLabel();
        rolL = new javax.swing.JLabel();
        numeroIdentificacion = new javax.swing.JLabel();
        nombresT = new javax.swing.JTextField();
        apellidosT = new javax.swing.JTextField();
        identificacionT = new javax.swing.JTextField();
        rol = new javax.swing.JComboBox<>();
        numeroIdentificacion1 = new javax.swing.JLabel();
        numeroIdentificacion2 = new javax.swing.JLabel();
        latitudT = new javax.swing.JTextField();
        logitud = new javax.swing.JTextField();
        numeroIdentificacion3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        numeroIdentificacion4 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        telefono1 = new javax.swing.JTextField();
        direccion1 = new javax.swing.JLabel();
        contrasena = new javax.swing.JTextField();
        activo = new javax.swing.JRadioButton();
        crearUsuario = new javax.swing.JButton();
        seAgrego = new javax.swing.JLabel();

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
        jLabel1.setText("Perfil de usuario");
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

        userImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/userIcon.png"))); // NOI18N
        userImage.setMaximumSize(new java.awt.Dimension(65, 65));
        userImage.setMinimumSize(new java.awt.Dimension(65, 65));
        userImage.setPreferredSize(new java.awt.Dimension(65, 65));
        getContentPane().add(userImage);
        userImage.setBounds(60, 150, 190, 180);

        White.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        formulario.setPreferredSize(new java.awt.Dimension(781, 650));
        formulario.setRequestFocusEnabled(false);

        nombresL.setText("Nombres:");

        apellidosL.setText("Apellidos:");

        rolL.setText("Rol dentro de la empresa:");

        numeroIdentificacion.setText("Número de identificación:");

        nombresT.setText("Nombres");

        apellidosT.setText("Apellidos");

        identificacionT.setText("Número de identificación");

        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        numeroIdentificacion1.setText("Latitud:");

        numeroIdentificacion2.setText("Longitud:");

        latitudT.setText("Latitud");

        logitud.setText("Longitud");

        numeroIdentificacion3.setText("Correo electrónico:");

        email.setText("Correo electrónico");

        numeroIdentificacion4.setText("Teléfono:");

        telefono.setText("Teléfono");

        direccion.setText("Dirección de residencia:");

        telefono1.setText("Dirección de residencia");

        direccion1.setText("Contraseña:");

        contrasena.setText("Contraseña");

        activo.setText("Activo");

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activo)
                    .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(direccion1)
                        .addComponent(direccion)
                        .addComponent(numeroIdentificacion4)
                        .addComponent(numeroIdentificacion3)
                        .addComponent(identificacionT, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                        .addComponent(apellidosT, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                        .addComponent(numeroIdentificacion)
                        .addComponent(rolL)
                        .addComponent(apellidosL)
                        .addComponent(nombresL)
                        .addComponent(nombresT)
                        .addComponent(rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formularioLayout.createSequentialGroup()
                            .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numeroIdentificacion1)
                                .addComponent(latitudT, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numeroIdentificacion2)
                                .addComponent(logitud)))
                        .addComponent(email)
                        .addComponent(telefono)
                        .addComponent(telefono1)
                        .addComponent(contrasena)))
                .addContainerGap(166, Short.MAX_VALUE))
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
                .addComponent(rolL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(numeroIdentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(identificacionT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroIdentificacion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroIdentificacion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroIdentificacion1)
                    .addComponent(numeroIdentificacion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitudT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(direccion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(activo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(formulario);

        crearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        crearUsuario.setForeground(new java.awt.Color(41, 135, 217));
        crearUsuario.setText("CREAR USUSARIO");
        crearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seAgrego(evt);
            }
        });

        seAgrego.setBackground(new java.awt.Color(204, 255, 204));
        seAgrego.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        seAgrego.setForeground(new java.awt.Color(0, 102, 51));
        seAgrego.setText("Se actualizó al usuario exitosamente.");

        javax.swing.GroupLayout WhiteLayout = new javax.swing.GroupLayout(White);
        White.setLayout(WhiteLayout);
        WhiteLayout.setHorizontalGroup(
            WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteLayout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .addGroup(WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WhiteLayout.createSequentialGroup()
                        .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(seAgrego, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        WhiteLayout.setVerticalGroup(
            WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seAgrego, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
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
            java.util.logging.Logger.getLogger(ProfileUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Blue;
    private javax.swing.JLabel Menu;
    private javax.swing.JPanel White;
    private javax.swing.JRadioButton activo;
    private javax.swing.JLabel apellidosL;
    private javax.swing.JTextField apellidosT;
    private javax.swing.JLabel back;
    private javax.swing.JTextField contrasena;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel direccion1;
    private javax.swing.JTextField email;
    private javax.swing.JPanel formulario;
    private javax.swing.JTextField identificacionT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField latitudT;
    private javax.swing.JTextField logitud;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel nombresL;
    private javax.swing.JTextField nombresT;
    private javax.swing.JLabel numeroIdentificacion;
    private javax.swing.JLabel numeroIdentificacion1;
    private javax.swing.JLabel numeroIdentificacion2;
    private javax.swing.JLabel numeroIdentificacion3;
    private javax.swing.JLabel numeroIdentificacion4;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JLabel rolL;
    private javax.swing.JLabel seAgrego;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefono1;
    private javax.swing.JLabel userImage;
    // End of variables declaration//GEN-END:variables
}
