/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ABC_aplicacion;

/**
 *
 * @author Jaasiel
 */
public class pagina_que_explica extends javax.swing.JFrame {

    /**
     * Creates new form pagina_que_explica
     */
    public pagina_que_explica() {
        initComponents();
        setLocationRelativeTo(null);
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
        boton_tablaI = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        explicacion_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_tablaI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/folder_imagenes/boton_tabla_interactiva.png"))); // NOI18N
        boton_tablaI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_tablaIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_tablaIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_tablaIMouseExited(evt);
            }
        });
        jPanel1.add(boton_tablaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 690, 210, 60));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/folder_imagenes/boton_regresar_tabla.png"))); // NOI18N
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresarMouseExited(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 60));

        explicacion_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/folder_imagenes/explicacion.png"))); // NOI18N
        jPanel1.add(explicacion_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        // TODO add your handling code here:
        pagina_eleccion pagina1= new pagina_eleccion();
        pagina1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarMouseClicked

    private void regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseEntered
        // TODO add your handling code here:
        regresar.setBounds(7, 110, 150, 60);
    }//GEN-LAST:event_regresarMouseEntered

    private void regresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseExited
        // TODO add your handling code here:
         regresar.setBounds(10, 110, 150, 60);
    }//GEN-LAST:event_regresarMouseExited

    private void boton_tablaIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_tablaIMouseClicked
        // TODO add your handling code here:
        pagina_principal pagina2= new pagina_principal();
        pagina2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_tablaIMouseClicked

    private void boton_tablaIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_tablaIMouseEntered
        // TODO add your handling code here:
        boton_tablaI.setBounds(1113, 690, 210, 60);
    }//GEN-LAST:event_boton_tablaIMouseEntered

    private void boton_tablaIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_tablaIMouseExited
        // TODO add your handling code here:
         boton_tablaI.setBounds(1110, 690, 210, 60);
    }//GEN-LAST:event_boton_tablaIMouseExited

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
            java.util.logging.Logger.getLogger(pagina_que_explica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagina_que_explica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagina_que_explica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagina_que_explica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagina_que_explica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton_tablaI;
    private javax.swing.JLabel explicacion_1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
}