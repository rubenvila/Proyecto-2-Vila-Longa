/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;
import proyecto2ruben.MonticuloBinario;
import proyecto2ruben.TablaDeDispersion;


public class Usuario_Eliminar extends javax.swing.JFrame {
    public static TablaDeDispersion tablaDisp;
    public static MonticuloBinario monticulo;
    public static Reloj reloj; 
    /**
     * Creates new form Usuario_Eliminar
     */
    public Usuario_Eliminar(TablaDeDispersion t, MonticuloBinario bh) {
        initComponents();
        this.setVisible(true);
        this.monticulo = bh;
        this.tablaDisp = t;
        actualizar_usuarios();
    }
    public void actualizar_usuarios(){
        this.reg.setText(tablaDisp.imprimir_usuario(""));
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reg = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        username2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel2.setText("ELIMINAR USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel7.setText("Nombre de usuario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        reg.setColumns(20);
        reg.setRows(5);
        jScrollPane2.setViewportView(reg);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 240, 310));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Usuarios y documentos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        username2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel1.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 230, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 130, -1));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String usern = this.username2.getText().toLowerCase();
        if(tablaDisp.buscar_usuario(usern) != null && !tablaDisp.buscar_usuario(usern).nombre_usuario.equals("")){
            tablaDisp.eliminar_usuario(usern);
            JOptionPane.showMessageDialog(rootPane, "El usuario ha sido eliminado", "Eliminar Usuario", HEIGHT);
        }else{
            JOptionPane.showMessageDialog(rootPane, "No hay ningún usuario registrado con ese nombre", "Error", HEIGHT);
        }
        actualizar_usuarios();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MenuPrincipal m = new MenuPrincipal(monticulo, tablaDisp, reloj);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario_Eliminar(tablaDisp, monticulo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea reg;
    private javax.swing.JTextField username2;
    // End of variables declaration//GEN-END:variables
}