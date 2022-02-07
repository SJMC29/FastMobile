package Ejemplo;

// RECUERDA QUE DEBES USAR 1024X576 EN PREFERED SIZE
// Properties > PrefferedSize = [1024,576]
// Properties > Resizable = Uncheck
// Code > Designer Size = [1024,576]

// Otro consejo, si te queda espacio entre los paneles y los quieres quitar,
//doble click y le pones un 0 al xxx fixed gap
public class Interfaz_911 extends javax.swing.JFrame {
    //Como este es un ejemplo de como llamar clases desde la interfaz te
    //hice esta y pues estoy creando el objeto
    Llamado_de_emergencia llamada = new Llamado_de_emergencia();
    
    public Interfaz_911() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Guruguru");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jButton1)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Si le das dos veces click a un elemento (boton, panel, etc) te lleva a donde
    //puede hacer algo, si quieres hacer algo en especifico como un hover si toca investigar (Creo)
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(llamada.DaleGoku());    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   
//Aqui se declaran los botones, paneles etc, no se tiene que tocar nada
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
