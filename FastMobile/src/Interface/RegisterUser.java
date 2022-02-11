/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Controllers.PersonController;
import Controllers.RolController;
import Controllers.UserController;
import Models.Person;
import Models.Rol;
import Models.User;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Fanfo
 */
public class RegisterUser extends javax.swing.JFrame {
    
    RolController rolControl = new RolController();
    PersonController personControl = new PersonController();
    UserController userControl = new UserController();
    List<Rol> roles;
    boolean active = false;
    /**
     * Creates new form RegisterUser
     */
    public RegisterUser() {
        initComponents();
        scaleImage();
        cargarRoles();
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

        TOP = new javax.swing.JPanel();
        fastMobileWhite = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        Separador = new javax.swing.JPanel();
        CENTER = new javax.swing.JPanel();
        centroAdmin = new javax.swing.JLabel();
        crearUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollPanel = new javax.swing.JPanel();
        ingreseDatos = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldLatitud = new javax.swing.JTextField();
        jTextFieldLongitud = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jRadioButtonActive = new javax.swing.JRadioButton();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 576));
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
        TOP.add(menu);
        menu.setBounds(850, 40, 50, 20);

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

        CENTER.setBackground(new java.awt.Color(255, 255, 255));
        CENTER.setLayout(null);

        centroAdmin.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        centroAdmin.setText("Centro de administración Fast Mobile. ");
        CENTER.add(centroAdmin);
        centroAdmin.setBounds(100, 20, 287, 19);

        crearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        crearUsuario.setForeground(new java.awt.Color(41, 135, 217));
        crearUsuario.setText("CREAR USUSARIO");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        CENTER.add(crearUsuario);
        crearUsuario.setBounds(70, 350, 208, 42);

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        ingreseDatos.setText("Por favor, ingrese los datos.");

        jTextFieldCedula.setText("Cedula");
        jTextFieldCedula.setToolTipText("Cedula de Ciudadania");

        jTextFieldNombre.setText("Nombre");
        jTextFieldNombre.setToolTipText("nombre");

        jTextFieldApellido.setText("Apellido");

        jTextFieldEmail.setText("Correo Electronico");

        jTextFieldPhone.setText("Phone");

        jTextFieldAddress.setText("Direccion de residencia");

        jTextFieldLatitud.setText("Latitud");
        jTextFieldLatitud.setToolTipText("Cedula de Ciudadania");

        jTextFieldLongitud.setText("Longitud");
        jTextFieldLongitud.setToolTipText("Cedula de Ciudadania");

        jTextFieldPassword.setText("jTextField9");

        jRadioButtonActive.setText("Activo");
        jRadioButtonActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonActiveActionPerformed(evt);
            }
        });

        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout scrollPanelLayout = new javax.swing.GroupLayout(scrollPanel);
        scrollPanel.setLayout(scrollPanelLayout);
        scrollPanelLayout.setHorizontalGroup(
            scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingreseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(scrollPanelLayout.createSequentialGroup()
                        .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scrollPanelLayout.createSequentialGroup()
                                .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxRol, javax.swing.GroupLayout.Alignment.TRAILING, 0, 257, Short.MAX_VALUE)
                                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(scrollPanelLayout.createSequentialGroup()
                        .addComponent(jTextFieldLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jTextFieldLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(scrollPanelLayout.createSequentialGroup()
                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jRadioButtonActive)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        scrollPanelLayout.setVerticalGroup(
            scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ingreseDatos)
                .addGap(18, 18, 18)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonActive))
                .addContainerGap(418, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(scrollPanel);

        CENTER.add(jScrollPane1);
        jScrollPane1.setBounds(70, 50, 900, 280);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Se Agrego el Usuario exitosamente");
        CENTER.add(jLabel1);
        jLabel1.setBounds(340, 360, 360, 30);

        getContentPane().add(CENTER);
        CENTER.setBounds(0, 110, 1030, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        // TODO add your handling code here:
        Person p = new Person(jTextFieldCedula.getText(), 
                                jTextFieldNombre.getText(), 
                                jTextFieldApellido.getText(),
                                jTextFieldEmail.getText(),
                                jTextFieldPhone.getText(),
                                jTextFieldAddress.getText(),
                                Double.parseDouble(jTextFieldLatitud.getText()),
                                Double.parseDouble(jTextFieldLongitud.getText()));
        // System.out.println("p = " + p);
        Rol r = roles.get(jComboBoxRol.getSelectedIndex());
        User u = new User(p, jTextFieldPassword.getText(), this.active, r);
        personControl.createPerson(p);
        userControl.createUser(u);
        
        jTextFieldAddress.setText("");
        jTextFieldApellido.setText("");
        jTextFieldCedula.setText("");
        jTextFieldEmail.setText("");
        jTextFieldLatitud.setText("");
        jTextFieldLongitud.setText("");
        jTextFieldNombre.setText("");
        jTextFieldPassword.setText("");
        jTextFieldPhone.setText("");
        
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void jRadioButtonActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonActiveActionPerformed
        // TODO add your handling code here:
        this.active = !this.active;
        System.out.println(this.active);
    }//GEN-LAST:event_jRadioButtonActiveActionPerformed
    
    public void cargarRoles(){
        roles = rolControl.getRols();
        jComboBoxRol.removeAllItems();
        for(int i=0;i<roles.size();i++){
            jComboBoxRol.addItem(roles.get(i).getName());
        }
    }
    
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
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CENTER;
    private javax.swing.JPanel Separador;
    private javax.swing.JPanel TOP;
    private javax.swing.JLabel centroAdmin;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JLabel fastMobileWhite;
    private javax.swing.JLabel ingreseDatos;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonActive;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLatitud;
    private javax.swing.JTextField jTextFieldLongitud;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel scrollPanel;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
