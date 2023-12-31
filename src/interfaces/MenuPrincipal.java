/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;
import proyecto2ruben.MonticuloBinario;
import proyecto2ruben.TablaDeDispersion;


public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public static MonticuloBinario bh;
    public static TablaDeDispersion td;
    public int segundos;
    public static Reloj crono; 
    public MenuPrincipal(MonticuloBinario bh, TablaDeDispersion td, Reloj c) {
        initComponents();
        this.setVisible(true);
        this.bh = bh;
        this.td = td;
        this.segundos = 0;
        this.crono = c;
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
        impresora = new javax.swing.JButton();
        visualizacion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        documento = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        impresora.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        impresora.setText("Ir");
        impresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impresoraActionPerformed(evt);
            }
        });
        jPanel1.add(impresora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 60, 40));

        visualizacion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        visualizacion.setText("Ir");
        visualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizacionActionPerformed(evt);
            }
        });
        jPanel1.add(visualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 60, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel8.setText("Ver cola de prioridad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        usuario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        usuario.setText("Ir");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 70, 40));

        documento.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        documento.setText("Ir");
        documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoActionPerformed(evt);
            }
        });
        jPanel1.add(documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 60, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel9.setText("Gestión de Documentos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel10.setText("Panel de Usuario");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel11.setText("Manejar Impresora");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void impresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impresoraActionPerformed
        // TODO add your handling code here:

        Impresora impresora = new Impresora(td, bh);
        this.dispose();
    }//GEN-LAST:event_impresoraActionPerformed

    private void visualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizacionActionPerformed
        // TODO add your handling code here:
        if (bh.monticulo[0] != null){
        GraficoArbol a = new GraficoArbol(bh);
        a.setVisible(true);}
        else{
            JOptionPane.showMessageDialog(rootPane, "No hay objetos en la lista de impresion");
        }
    }//GEN-LAST:event_visualizacionActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Usuarios user = new Usuarios(td,bh);
    }//GEN-LAST:event_usuarioActionPerformed

    private void documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoActionPerformed
        // TODO add your handling code here:
        Documentos doc = new Documentos(td, segundos, bh);
    }//GEN-LAST:event_documentoActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(bh, td, crono).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton documento;
    private javax.swing.JButton impresora;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton usuario;
    private javax.swing.JButton visualizacion;
    // End of variables declaration//GEN-END:variables
}
