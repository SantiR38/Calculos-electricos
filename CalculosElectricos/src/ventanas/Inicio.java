/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author santi_000
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonDpms = new javax.swing.JButton();
        botonCaidaTension = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        botonExit = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonDpms.setText("DPMS");
        botonDpms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDpmsActionPerformed(evt);
            }
        });
        getContentPane().add(botonDpms, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 130, -1));

        botonCaidaTension.setText("Caída de Tensión");
        botonCaidaTension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCaidaTensionActionPerformed(evt);
            }
        });
        getContentPane().add(botonCaidaTension, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Cálculos Eléctricos");
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 260, 90));

        botonExit.setText("Salir");
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });
        getContentPane().add(botonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 487, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonExitActionPerformed

    private void botonDpmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDpmsActionPerformed
        Dpms dpmsVentana = new Dpms();
        dpmsVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonDpmsActionPerformed

    private void botonCaidaTensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCaidaTensionActionPerformed
        CaidaTension caidaTensionVentana = new CaidaTension();
        caidaTensionVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCaidaTensionActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCaidaTension;
    private javax.swing.JButton botonDpms;
    private javax.swing.JButton botonExit;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
