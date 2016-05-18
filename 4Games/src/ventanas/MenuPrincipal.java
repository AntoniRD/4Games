/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;

/**
 *
 * @author Budha
 */
public class MenuPrincipal extends javax.swing.JDialog {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Menu Principal");
        this.getContentPane().setBackground(new Color (243,245,246));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButtonInsertarJuego = new javax.swing.JButton();
        jButtonConsultarListaJuegos = new javax.swing.JButton();
        jButtonCalificarJuegos = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonInsertarJuego.setText("Insertar juego");
        jButtonInsertarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarJuegoActionPerformed(evt);
            }
        });

        jButtonConsultarListaJuegos.setText("Consultar lista de juegos");
        jButtonConsultarListaJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarListaJuegosActionPerformed(evt);
            }
        });

        jButtonCalificarJuegos.setText("Calificar juegos");
        jButtonCalificarJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificarJuegosActionPerformed(evt);
            }
        });

        jButtonCerrarSesion.setText("Cerrar sesión");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConsultarListaJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInsertarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCalificarJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonInsertarJuego)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultarListaJuegos)
                .addGap(18, 18, 18)
                .addComponent(jButtonCalificarJuegos)
                .addGap(18, 18, 18)
                .addComponent(jButtonCerrarSesion)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarJuegoActionPerformed
        // TODO add your handling code here:
        InsertarJuego ij = new InsertarJuego(new javax.swing.JFrame(), true);
        ij.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInsertarJuegoActionPerformed

    private void jButtonConsultarListaJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarListaJuegosActionPerformed
        // TODO add your handling code here:
        ConsultarJuego coj = new ConsultarJuego(new javax.swing.JFrame(), true);
        coj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarListaJuegosActionPerformed

    private void jButtonCalificarJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificarJuegosActionPerformed
        // TODO add your handling code here:
        CalificarJuego caj = new CalificarJuego(new javax.swing.JFrame(), true);
        caj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCalificarJuegosActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal dialog = new MenuPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalificarJuegos;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonConsultarListaJuegos;
    private javax.swing.JButton jButtonInsertarJuego;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}