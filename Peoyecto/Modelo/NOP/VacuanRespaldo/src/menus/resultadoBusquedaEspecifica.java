/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menus;

/**
 *
 * @author USER
 */
public class resultadoBusquedaEspecifica extends javax.swing.JFrame {
    String kitPasado;
    String lotePasado;
    String marcaPasado;
    String efectoAdversoPasado;
    /**
     * Creates new form resultadoBusquedaEspecifica
     */
    public resultadoBusquedaEspecifica() {
        initComponents();
    }

    public resultadoBusquedaEspecifica(String kitPasado,String lotePasado,String marcaPasado,String efectoAdversoPasado) {
        this.kitPasado=kitPasado;
        this.lotePasado=lotePasado;
        this.marcaPasado=marcaPasado;
        this.efectoAdversoPasado=efectoAdversoPasado;
        initComponents();
        txtKitPasado.setText(kitPasado);
        txtLotePasado.setText(lotePasado);
        txtMarcaPasado.setText(marcaPasado);
        txtEfectoAdversoPasado.setText(efectoAdversoPasado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKitPasado = new javax.swing.JTextField();
        txtLotePasado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMarcaPasado = new javax.swing.JTextField();
        txtEfectoAdversoPasado = new javax.swing.JTextField();
        btnMostrarVacunas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vacuna encontrada");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Lote:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Efecto adverso:");

        txtKitPasado.setEditable(false);
        txtKitPasado.setText("kit");
        txtKitPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKitPasadoActionPerformed(evt);
            }
        });

        txtLotePasado.setEditable(false);
        txtLotePasado.setText("lote");
        txtLotePasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLotePasadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Kit:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("La vacuna encontrada");

        txtMarcaPasado.setEditable(false);
        txtMarcaPasado.setText("marca");
        txtMarcaPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaPasadoActionPerformed(evt);
            }
        });

        txtEfectoAdversoPasado.setEditable(false);
        txtEfectoAdversoPasado.setText("efecto adverso");
        txtEfectoAdversoPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEfectoAdversoPasadoActionPerformed(evt);
            }
        });

        btnMostrarVacunas1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnMostrarVacunas1.setText("Volver");
        btnMostrarVacunas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVacunas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(138, 138, 138)
                                .addComponent(txtKitPasado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(127, 127, 127)
                                .addComponent(txtLotePasado, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(49, 49, 49)
                                .addComponent(txtEfectoAdversoPasado, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(113, 113, 113)
                                .addComponent(txtMarcaPasado, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(btnMostrarVacunas1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKitPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLotePasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarcaPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEfectoAdversoPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnMostrarVacunas1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtKitPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKitPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKitPasadoActionPerformed

    private void txtLotePasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLotePasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLotePasadoActionPerformed

    private void txtMarcaPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaPasadoActionPerformed

    private void txtEfectoAdversoPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEfectoAdversoPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEfectoAdversoPasadoActionPerformed

    private void btnMostrarVacunas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVacunas1ActionPerformed
        // TODO add your handling code here:
        menuVacuna menVac = new menuVacuna();
        menVac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarVacunas1ActionPerformed

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
            java.util.logging.Logger.getLogger(resultadoBusquedaEspecifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultadoBusquedaEspecifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultadoBusquedaEspecifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultadoBusquedaEspecifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultadoBusquedaEspecifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarVacunas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEfectoAdversoPasado;
    private javax.swing.JTextField txtKitPasado;
    private javax.swing.JTextField txtLotePasado;
    private javax.swing.JTextField txtMarcaPasado;
    // End of variables declaration//GEN-END:variables
}
