/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Sara Maradiago
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        menuWhite.setBackground(new Color(255,255,255,150));
        LOGIN.setBackground(new Color(255,255,255,0));
        scaleImage();
    }
    
    public void scaleImage(){
        
        ImageIcon icon = new ImageIcon("src\\Images\\Login\\background.jpg");
        //Escalando para que se acomoden
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(background.getWidth(),background.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        background.setIcon(scaledIcon);
        
        icon = new ImageIcon("src\\Images\\Login\\FastMobileWhite.png");
        //Escalando para que se acomoden
        img = icon.getImage();
        imgScale = img.getScaledInstance(fastMobileWhite.getWidth(),fastMobileWhite.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        fastMobileWhite.setIcon(scaledIcon);
        
        icon = new ImageIcon("src\\Images\\Login\\userIcon.png");
        //Escalando para que se acomoden
        img = icon.getImage();
        imgScale = img.getScaledInstance(userIcon.getWidth(),userIcon.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        userIcon.setIcon(scaledIcon);
        
        icon = new ImageIcon("src\\Images\\Login\\userPassword.png");
        //Escalando para que se acomoden
        img = icon.getImage();
        imgScale = img.getScaledInstance(userPassword.getWidth(),userPassword.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        userPassword.setIcon(scaledIcon);
        
                icon = new ImageIcon("src\\Images\\Login\\FastMobileIcon.png");
        //Escalando para que se acomoden
        img = icon.getImage();
        imgScale = img.getScaledInstance(fastMobileIcon.getWidth(),fastMobileIcon.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        fastMobileIcon.setIcon(scaledIcon);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuWhite = new javax.swing.JPanel();
        bienvenido = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        passwordUsuario = new javax.swing.JTextField();
        userIcon = new javax.swing.JLabel();
        userPassword = new javax.swing.JLabel();
        rememberMe = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();
        fastMobileIcon = new javax.swing.JLabel();
        TOP = new javax.swing.JPanel();
        fastMobileWhite = new javax.swing.JLabel();
        CENTER = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        getContentPane().setLayout(null);

        menuWhite.setBackground(new java.awt.Color(255, 255, 255));
        menuWhite.setLayout(null);

        bienvenido.setText("BIENVENIDO");
        menuWhite.add(bienvenido);
        bienvenido.setBounds(140, 50, 80, 20);

        nombreUsuario.setText("Contraseña");
        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });
        menuWhite.add(nombreUsuario);
        nombreUsuario.setBounds(90, 120, 180, 22);

        passwordUsuario.setText("Nombre de usuario");
        passwordUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordUsuarioActionPerformed(evt);
            }
        });
        menuWhite.add(passwordUsuario);
        passwordUsuario.setBounds(90, 90, 180, 22);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/userIcon.png"))); // NOI18N
        menuWhite.add(userIcon);
        userIcon.setBounds(70, 90, 20, 20);

        userPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/userPassword.png"))); // NOI18N
        menuWhite.add(userPassword);
        userPassword.setBounds(70, 120, 20, 20);

        rememberMe.setText("Recuérdame");
        rememberMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberMeActionPerformed(evt);
            }
        });
        menuWhite.add(rememberMe);
        rememberMe.setBounds(40, 160, 100, 25);

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Olvidé mi contraseña");
        menuWhite.add(jLabel1);
        jLabel1.setBounds(180, 160, 130, 20);

        LOGIN.setForeground(new java.awt.Color(41, 135, 217));
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        menuWhite.add(LOGIN);
        LOGIN.setBounds(120, 190, 110, 30);

        fastMobileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/fastMobileIcon.png"))); // NOI18N
        fastMobileIcon.setPreferredSize(new java.awt.Dimension(10, 10));
        menuWhite.add(fastMobileIcon);
        fastMobileIcon.setBounds(90, 0, 160, 60);

        getContentPane().add(menuWhite);
        menuWhite.setBounds(360, 190, 340, 230);

        TOP.setBackground(new java.awt.Color(255, 255, 255));
        TOP.setPreferredSize(new java.awt.Dimension(1024, 100));
        TOP.setLayout(null);

        fastMobileWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/fastMobileWhite.png"))); // NOI18N
        TOP.add(fastMobileWhite);
        fastMobileWhite.setBounds(20, 20, 140, 60);

        getContentPane().add(TOP);
        TOP.setBounds(0, 0, 1030, 100);

        CENTER.setPreferredSize(new java.awt.Dimension(1024, 476));
        CENTER.setLayout(null);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/background.jpg"))); // NOI18N
        CENTER.add(background);
        background.setBounds(0, 0, 1040, 720);

        getContentPane().add(CENTER);
        CENTER.setBounds(-6, -4, 1050, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void passwordUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordUsuarioActionPerformed

    private void rememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberMeActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CENTER;
    private javax.swing.JButton LOGIN;
    private javax.swing.JPanel TOP;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel fastMobileIcon;
    private javax.swing.JLabel fastMobileWhite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuWhite;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTextField passwordUsuario;
    private javax.swing.JCheckBox rememberMe;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel userPassword;
    // End of variables declaration//GEN-END:variables
}
