/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

//import Controllers.ClientController;
import Controllers.PersonController;
import Controllers.RolController;
import Controllers.UserController;
import Function.RegisterClientController;
import Models.Person;
import Models.Rol;
import Models.User;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fanfo
 */
public class RegisterClient extends javax.swing.JFrame {    
    RegisterClientController clientControl = new RegisterClientController();
    //ClientController clientControl = new ClientController();
    RolController rolControl = new RolController();
    PersonController personControl = new PersonController();
    UserController userControl = new UserController();
    List<Rol> roles;
    User usuario;
    boolean active = false;

    public RegisterClient(User u) {
        usuario = u;
        initComponents();
        seAgrego.setVisible(false);
        scaleImage();
        clientControl.loadTypes(jComboBoxType);
        clientControl.loadPlans(jComboBoxPlan);
        clientControl.loadTable(jTable);
    }
    
    public RegisterClient() {
        initComponents();
        seAgrego.setVisible(false);
        scaleImage();
        clientControl.loadTypes(jComboBoxType);
        clientControl.loadPlans(jComboBoxPlan);
        clientControl.loadTable(jTable);
    }
    
    public JComboBox<String> getjComboBoxType() {
        return jComboBoxType;
    }

    public JTextField getjTextFieldAddress() {
        return jTextFieldAddress;
    }

    public JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }

    public JTextField getjTextFieldCedula() {
        return jTextFieldCedula;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public JTextField getjTextFieldLatitud() {
        return jTextFieldLatitud;
    }

    public JTextField getjTextFieldLongitud() {
        return jTextFieldLongitud;
    }

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public JTextField getjTextFieldPhone() {
        return jTextFieldPhone;
    }

    public boolean getjRadioButtonSuspended() {
        return active;
    }

    public JComboBox<String> getjComboBoxPlan() {
        return jComboBoxPlan;
    }

    public JTextField getjTextFieldClient_Phone() {
        return jTextFieldClient_Phone;
    }

    public JTable getjTable() {
        return jTable;
    }
    
    //public JLabel getjLabelErrorLinea() {
        //return jLabelErrorLinea;
    //}
       
    /**
     * Creates new form RegisterUser
     */
    
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
        centroAdmin = new javax.swing.JLabel();
        Separador = new javax.swing.JPanel();
        CENTER = new javax.swing.JPanel();
        crearCliente = new javax.swing.JButton();
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
        jRadioButtonSuspended = new javax.swing.JRadioButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jTextFieldClient_Phone = new javax.swing.JTextField();
        jComboBoxPlan = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonInsert = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        ingreseDatos1 = new javax.swing.JLabel();
        ingreseDatos2 = new javax.swing.JLabel();
        ingreseDatos3 = new javax.swing.JLabel();
        ingreseDatos4 = new javax.swing.JLabel();
        ingreseDatos5 = new javax.swing.JLabel();
        ingreseDatos6 = new javax.swing.JLabel();
        ingreseDatos7 = new javax.swing.JLabel();
        ingreseDatos8 = new javax.swing.JLabel();
        ingreseDatos9 = new javax.swing.JLabel();
        seAgrego = new javax.swing.JLabel();
        centroAdmin1 = new javax.swing.JLabel();

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

        centroAdmin.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        centroAdmin.setText("CENTRO DE ADMINISTRACIÓN FAST MOBILE");
        TOP.add(centroAdmin);
        centroAdmin.setBounds(350, 40, 316, 19);

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

        crearCliente.setBackground(new java.awt.Color(255, 255, 255));
        crearCliente.setForeground(new java.awt.Color(41, 135, 217));
        crearCliente.setText("CREAR CLIENTE");
        crearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteActionPerformed(evt);
            }
        });
        CENTER.add(crearCliente);
        crearCliente.setBounds(70, 350, 208, 42);

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ingreseDatos.setText("Por favor, ingrese los datos.");

        jTextFieldCedula.setText("Cédula");
        jTextFieldCedula.setToolTipText("Cedula de Ciudadania");

        jTextFieldNombre.setText("Nombre");
        jTextFieldNombre.setToolTipText("nombre");

        jTextFieldApellido.setText("Apellido");

        jTextFieldEmail.setText("Correo electrónico");

        jTextFieldPhone.setText("Teléfono");
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });

        jTextFieldAddress.setText("Dirección de residencia");

        jTextFieldLatitud.setText("Latitud");
        jTextFieldLatitud.setToolTipText("Cedula de Ciudadania");

        jTextFieldLongitud.setText("Longitud");
        jTextFieldLongitud.setToolTipText("Cedula de Ciudadania");

        jRadioButtonSuspended.setText("Suspendida/o");
        jRadioButtonSuspended.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSuspendedActionPerformed(evt);
            }
        });

        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextFieldClient_Phone.setText("Telefono");
        jTextFieldClient_Phone.setToolTipText("Cedula de Ciudadania");

        jComboBoxPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlanActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        jButtonInsert.setText("Insertar");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonRemove.setText("Remover");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        ingreseDatos1.setText("Cédula:");

        ingreseDatos2.setText("Nombre:");

        ingreseDatos3.setText("Apellido:");

        ingreseDatos4.setText("Correo electrónico:");

        ingreseDatos5.setText("Teléfono:");

        ingreseDatos6.setText("Dirección de residencia:");

        ingreseDatos7.setText("Latitud:");

        ingreseDatos8.setText("Longitud:");

        ingreseDatos9.setText("Escoger plan de datos:");

        javax.swing.GroupLayout scrollPanelLayout = new javax.swing.GroupLayout(scrollPanel);
        scrollPanel.setLayout(scrollPanelLayout);
        scrollPanelLayout.setHorizontalGroup(
            scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingreseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(scrollPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(scrollPanelLayout.createSequentialGroup()
                                    .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ingreseDatos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldNombre)
                                        .addComponent(ingreseDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(ingreseDatos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(scrollPanelLayout.createSequentialGroup()
                                    .addComponent(ingreseDatos6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(399, 399, 399))
                                .addGroup(scrollPanelLayout.createSequentialGroup()
                                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButtonSuspended)
                                        .addComponent(ingreseDatos5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ingreseDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(scrollPanelLayout.createSequentialGroup()
                                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldLatitud)
                                    .addComponent(ingreseDatos7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldLongitud)
                                    .addComponent(ingreseDatos8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ingreseDatos9, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(scrollPanelLayout.createSequentialGroup()
                                .addComponent(jTextFieldClient_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemove))
                            .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        scrollPanelLayout.setVerticalGroup(
            scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ingreseDatos)
                .addGap(25, 25, 25)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreseDatos1)
                    .addComponent(ingreseDatos2)
                    .addComponent(ingreseDatos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreseDatos4)
                    .addComponent(ingreseDatos5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingreseDatos6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonSuspended))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreseDatos7)
                    .addComponent(ingreseDatos8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ingreseDatos9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClient_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonRemove))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jScrollPane1.setViewportView(scrollPanel);

        CENTER.add(jScrollPane1);
        jScrollPane1.setBounds(70, 50, 900, 280);

        seAgrego.setBackground(new java.awt.Color(204, 255, 204));
        seAgrego.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        seAgrego.setForeground(new java.awt.Color(0, 102, 51));
        seAgrego.setText("Se agregó al cliente exitosamente.");
        CENTER.add(seAgrego);
        seAgrego.setBounds(340, 360, 360, 30);

        centroAdmin1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        centroAdmin1.setText("Registro de usuarios. ");
        CENTER.add(centroAdmin1);
        centroAdmin1.setBounds(100, 20, 287, 19);

        getContentPane().add(CENTER);
        CENTER.setBounds(0, 110, 1030, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteActionPerformed
        clientControl.sendForm(this);
        if(clientControl.validation(this)==0){
            seAgrego.setVisible(true);
        }else{
            seAgrego.setText("Datos inválidos, intente de nuevo.");
            seAgrego.setForeground(Color.red);
            seAgrego.setVisible(true);
        }
    }//GEN-LAST:event_crearClienteActionPerformed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        clientControl.goToMenu(this, usuario);
    }//GEN-LAST:event_menuMouseClicked

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        clientControl.removePhone(this);
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        clientControl.insertTable(this);
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jComboBoxPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPlanActionPerformed

    private void jRadioButtonSuspendedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSuspendedActionPerformed
        // TODO add your handling code here:
        this.active= !this.active;
        System.out.println(this.active);
    }//GEN-LAST:event_jRadioButtonSuspendedActionPerformed

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        menu.setForeground(new Color(242,229,46));
        menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        menu.setForeground(new Color(41,135,217));
    }//GEN-LAST:event_menuMouseExited

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(RegisterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CENTER;
    private javax.swing.JPanel Separador;
    private javax.swing.JPanel TOP;
    private javax.swing.JLabel centroAdmin;
    private javax.swing.JLabel centroAdmin1;
    private javax.swing.JButton crearCliente;
    private javax.swing.JLabel fastMobileWhite;
    private javax.swing.JLabel ingreseDatos;
    private javax.swing.JLabel ingreseDatos1;
    private javax.swing.JLabel ingreseDatos2;
    private javax.swing.JLabel ingreseDatos3;
    private javax.swing.JLabel ingreseDatos4;
    private javax.swing.JLabel ingreseDatos5;
    private javax.swing.JLabel ingreseDatos6;
    private javax.swing.JLabel ingreseDatos7;
    private javax.swing.JLabel ingreseDatos8;
    private javax.swing.JLabel ingreseDatos9;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JComboBox<String> jComboBoxPlan;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JRadioButton jRadioButtonSuspended;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldClient_Phone;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLatitud;
    private javax.swing.JTextField jTextFieldLongitud;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel scrollPanel;
    private javax.swing.JLabel seAgrego;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
