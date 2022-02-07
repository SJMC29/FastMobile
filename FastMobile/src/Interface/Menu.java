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
        jPanel2 = new javax.swing.JPanel();
        crearUsuario = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        CrearUsuario_click = new javax.swing.JLabel();
        crearUsuario_img = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(41, 135, 217));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image_2022-02-05_15-48-50.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(65, 65));
        jLabel2.setMinimumSize(new java.awt.Dimension(65, 65));
        jLabel2.setPreferredSize(new java.awt.Dimension(65, 65));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eren Jaeger");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(perfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logout)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(perfil)
                            .addComponent(logout))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 100);

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));

        crearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        crearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        crearUsuario.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CrearUsuario_click, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(CrearUsuario_click, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        crearUsuario.add(jPanel4);
        jPanel4.setBounds(0, 90, 220, 110);

        crearUsuario_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu/CrearUsuario.jpg"))); // NOI18N
        crearUsuario_img.setMaximumSize(new java.awt.Dimension(65, 65));
        crearUsuario_img.setMinimumSize(new java.awt.Dimension(65, 65));
        crearUsuario_img.setPreferredSize(new java.awt.Dimension(65, 65));
        crearUsuario.add(crearUsuario_img);
        crearUsuario_img.setBounds(0, 0, 216, 140);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(594, Short.MAX_VALUE))
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
    private javax.swing.JLabel CrearUsuario_click;
    private javax.swing.JPanel crearUsuario;
    private javax.swing.JLabel crearUsuario_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel perfil;
    // End of variables declaration//GEN-END:variables
}
