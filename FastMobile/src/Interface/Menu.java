/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Fanfo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        scaleImage();
    }

    public void scaleImage(){
        ImageIcon icon = new ImageIcon("src\\Images\\Menu\\CrearUsuario.jpg");
        //Escalando para que se acomoden
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(crearUsuario_img.getWidth(),crearUsuario_img.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        crearUsuario_img.setIcon(scaledIcon);
        
        icon = new ImageIcon("src\\Images\\Menu\\CrearCliente.jpg");
        //Escalando para que se acomoden
        img = icon.getImage();
        imgScale = img.getScaledInstance(crearCliente_img.getWidth(),crearCliente_img.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        crearCliente_img.setIcon(scaledIcon);
        
        icon = new ImageIcon("src\\Images\\Menu\\RegistroPagos.jpg");
        //Escalando para que se acomoden
        img = icon.getImage();
        imgScale = img.getScaledInstance(registroPagos_img.getWidth(),registroPagos_img.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        registroPagos_img.setIcon(scaledIcon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        perfil = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        crearUsuario = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        CrearUsuario_click = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        crearUsuario_img = new javax.swing.JLabel();
        crearCliente = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        CrearCliente_click = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crearCliente_img = new javax.swing.JLabel();
        registroPagos = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        RegistroPagos_click = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registroPagos_img = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(41, 135, 217));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/userIcon.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(65, 65));
        jLabel2.setMinimumSize(new java.awt.Dimension(65, 65));
        jLabel2.setPreferredSize(new java.awt.Dimension(65, 65));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 65, 65);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eren Jaeger");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 20, 173, 43);

        perfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        perfil.setForeground(new java.awt.Color(255, 255, 255));
        perfil.setText("Perfil");
        perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                perfilMouseExited(evt);
            }
        });
        jPanel1.add(perfil);
        perfil.setBounds(110, 70, 30, 16);

        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Cerrar sesión");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(150, 70, 72, 16);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu/Back.png"))); // NOI18N
        back.setMaximumSize(new java.awt.Dimension(65, 65));
        back.setMinimumSize(new java.awt.Dimension(65, 65));
        back.setPreferredSize(new java.awt.Dimension(65, 65));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(940, 30, 50, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 100);

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));

        crearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        crearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        crearUsuario.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        CrearUsuario_click.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CrearUsuario_click.setText("Crear Usuario");
        CrearUsuario_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrearUsuario_clickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearUsuario_clickMouseExited(evt);
            }
        });
        jPanel4.add(CrearUsuario_click);
        CrearUsuario_click.setBounds(20, 10, 120, 30);

        jLabel3.setText("<html>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut libero nec magna</html>");
        jLabel3.setPreferredSize(new java.awt.Dimension(180, 16));
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 40, 180, 45);

        crearUsuario.add(jPanel4);
        jPanel4.setBounds(0, 90, 220, 110);

        crearUsuario_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu/CrearUsuario.jpg"))); // NOI18N
        crearUsuario_img.setMaximumSize(new java.awt.Dimension(65, 65));
        crearUsuario_img.setMinimumSize(new java.awt.Dimension(65, 65));
        crearUsuario_img.setPreferredSize(new java.awt.Dimension(65, 65));
        crearUsuario.add(crearUsuario_img);
        crearUsuario_img.setBounds(0, 0, 216, 140);

        crearCliente.setBackground(new java.awt.Color(255, 255, 255));
        crearCliente.setForeground(new java.awt.Color(255, 255, 255));
        crearCliente.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        CrearCliente_click.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CrearCliente_click.setText("Crear Cliente");
        CrearCliente_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrearCliente_clickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearCliente_clickMouseExited(evt);
            }
        });
        jPanel5.add(CrearCliente_click);
        CrearCliente_click.setBounds(20, 10, 120, 30);

        jLabel4.setText("<html>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut libero nec magna</html>");
        jLabel4.setPreferredSize(new java.awt.Dimension(180, 16));
        jPanel5.add(jLabel4);
        jLabel4.setBounds(20, 40, 180, 45);

        crearCliente.add(jPanel5);
        jPanel5.setBounds(0, 90, 220, 110);

        crearCliente_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu/CrearUsuario.jpg"))); // NOI18N
        crearCliente_img.setMaximumSize(new java.awt.Dimension(65, 65));
        crearCliente_img.setMinimumSize(new java.awt.Dimension(65, 65));
        crearCliente_img.setPreferredSize(new java.awt.Dimension(65, 65));
        crearCliente.add(crearCliente_img);
        crearCliente_img.setBounds(0, 0, 216, 140);

        registroPagos.setBackground(new java.awt.Color(255, 255, 255));
        registroPagos.setForeground(new java.awt.Color(255, 255, 255));
        registroPagos.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        RegistroPagos_click.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegistroPagos_click.setText("Registro de Pagos");
        RegistroPagos_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistroPagos_clickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistroPagos_clickMouseExited(evt);
            }
        });
        jPanel6.add(RegistroPagos_click);
        RegistroPagos_click.setBounds(20, 10, 120, 30);

        jLabel5.setText("<html>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut libero nec magna</html>");
        jLabel5.setPreferredSize(new java.awt.Dimension(180, 16));
        jPanel6.add(jLabel5);
        jLabel5.setBounds(20, 40, 180, 45);

        registroPagos.add(jPanel6);
        jPanel6.setBounds(0, 90, 220, 110);

        registroPagos_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu/CrearUsuario.jpg"))); // NOI18N
        registroPagos_img.setMaximumSize(new java.awt.Dimension(65, 65));
        registroPagos_img.setMinimumSize(new java.awt.Dimension(65, 65));
        registroPagos_img.setPreferredSize(new java.awt.Dimension(65, 65));
        registroPagos.add(registroPagos_img);
        registroPagos_img.setBounds(0, 0, 216, 140);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(crearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(registroPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registroPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(580, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 802, 802);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(802, 101, 222, 801);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseEntered
        perfil.setForeground(new Color(242,229,46));
        perfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_perfilMouseEntered

    private void perfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseExited
        perfil.setForeground(Color.white);
    }//GEN-LAST:event_perfilMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setForeground(new Color(242,229,46));
        logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(Color.white);
    }//GEN-LAST:event_logoutMouseExited

    private void CrearUsuario_clickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearUsuario_clickMouseEntered
        CrearUsuario_click.setForeground(new Color(41,135,217));
        CrearUsuario_click.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_CrearUsuario_clickMouseEntered

    private void CrearUsuario_clickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearUsuario_clickMouseExited
        CrearUsuario_click.setForeground(Color.black);
    }//GEN-LAST:event_CrearUsuario_clickMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_backMouseEntered

    private void CrearCliente_clickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCliente_clickMouseEntered
        CrearCliente_click.setForeground(new Color(41,135,217));
        CrearCliente_click.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_CrearCliente_clickMouseEntered

    private void CrearCliente_clickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCliente_clickMouseExited
        CrearCliente_click.setForeground(Color.black);
    }//GEN-LAST:event_CrearCliente_clickMouseExited

    private void RegistroPagos_clickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroPagos_clickMouseEntered
        RegistroPagos_click.setForeground(new Color(41,135,217));
        RegistroPagos_click.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RegistroPagos_clickMouseEntered

    private void RegistroPagos_clickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroPagos_clickMouseExited
        RegistroPagos_click.setForeground(Color.black);
    }//GEN-LAST:event_RegistroPagos_clickMouseExited

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CrearCliente_click;
    private javax.swing.JLabel CrearUsuario_click;
    private javax.swing.JLabel RegistroPagos_click;
    private javax.swing.JLabel back;
    private javax.swing.JPanel crearCliente;
    private javax.swing.JLabel crearCliente_img;
    private javax.swing.JPanel crearUsuario;
    private javax.swing.JLabel crearUsuario_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel perfil;
    private javax.swing.JPanel registroPagos;
    private javax.swing.JLabel registroPagos_img;
    // End of variables declaration//GEN-END:variables
}
