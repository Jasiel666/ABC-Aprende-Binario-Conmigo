/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ABC_aplicacion;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JPanel;
import static javax.swing.UIManager.get;

/**
 *
 * @author Jaasiel
 */
public class login extends javax.swing.JFrame  {
   
    
    public login() {
        initComponents();
        setLocationRelativeTo(null);
      
        }

    
  
    @SuppressWarnings("unchecked")
    
    public String confirmar;
    static String nombre;
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campo_nombre = new javax.swing.JTextField();
        mensaje2 = new javax.swing.JLabel();
        mensaje1 = new javax.swing.JLabel();
        baner = new javax.swing.JLabel();
        boton_ingresar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        animacion = new javax.swing.JLabel();
        fondo_gif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1370, 770));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campo_nombre.setFont(new java.awt.Font("HelveticaNeueLT Std", 0, 24)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(153, 153, 153));
        campo_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_nombre.setBorder(null);
        campo_nombre.setRequestFocusEnabled(false);
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(campo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 260, 40));

        mensaje2.setFont(new java.awt.Font("HelveticaNeueLT Std ExtBlk Cn", 0, 24)); // NOI18N
        mensaje2.setForeground(new java.awt.Color(171, 144, 229));
        mensaje2.setText("INGRESA TU NOMBRE");
        jPanel1.add(mensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 210, 30));

        mensaje1.setFont(new java.awt.Font("HelveticaNeueLT Std ExtBlk Cn", 0, 48)); // NOI18N
        mensaje1.setForeground(new java.awt.Color(80, 160, 222));
        mensaje1.setText("¡HOLA!");
        jPanel1.add(mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 150, 60));

        baner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/folder_imagenes/abc login baner.png"))); // NOI18N
        baner.setText("jLabel1");
        jPanel1.add(baner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 106));

        boton_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/folder_imagenes/BOTON_INGRESAR.png"))); // NOI18N
        boton_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_ingresarMouseExited(evt);
            }
        });
        jPanel1.add(boton_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 290, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/folder_imagenes/login_final.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1370, 670));

        animacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/folder_imagenes/animacion_colores_final.gif"))); // NOI18N
        jPanel1.add(animacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        fondo_gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc/folder_imagenes/base gif.png"))); // NOI18N
        fondo_gif.setToolTipText("");
        jPanel1.add(fondo_gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1370, 770));

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

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void boton_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_ingresarMouseClicked
        nombre=campo_nombre.getText();
        confirmar=campo_nombre.getText();
        if(confirmar.isEmpty()){
           new ABC_aplicacion.AlertaNombre(this, true).setVisible(true);
        }else{
        pagina_eleccion paginaE= new pagina_eleccion();
        paginaE.setVisible(true);
        this.dispose();
            
        }
       
        
        
    }//GEN-LAST:event_boton_ingresarMouseClicked

    private void boton_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_ingresarMouseEntered
        // TODO add your handling code here:
        // posicion en x, posicion en y, anchura, altura
       boton_ingresar.setBounds(555, 460, 295 , 150);
    }//GEN-LAST:event_boton_ingresarMouseEntered

    private void boton_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_ingresarMouseExited
        // TODO add your handling code here:
        boton_ingresar.setBounds(540, 460, 295, 150);
    }//GEN-LAST:event_boton_ingresarMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
                
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animacion;
    private javax.swing.JLabel baner;
    private javax.swing.JLabel boton_ingresar;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel fondo_gif;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje1;
    private javax.swing.JLabel mensaje2;
    // End of variables declaration//GEN-END:variables

    

    

    

   
        
    
}
