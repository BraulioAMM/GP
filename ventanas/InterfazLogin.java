/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import javax.swing.JOptionPane;
import clases.Conexion;

/**
 *
 * @author braul
 */
public class InterfazLogin extends javax.swing.JFrame {

        public static String user = "";
        String pass = "";
    /**
     * Creates new form InterfazLogin
     */
    public InterfazLogin() {
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

        jButtonCerrar = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonInicioSes = new javax.swing.JButton();
        jButtonRegistro = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCerrar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCerrar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrar.setText("Salir");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com_1.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabelUser.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("Usuario: ");
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contrase??a:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jTextFieldUser.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUser.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 330, -1));

        jPasswordField1.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 330, -1));

        jButtonInicioSes.setBackground(new java.awt.Color(51, 51, 51));
        jButtonInicioSes.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonInicioSes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicioSes.setText("Iniciar Sesi??n");
        jButtonInicioSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioSesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicioSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, -1));

        jButtonRegistro.setBackground(new java.awt.Color(51, 51, 51));
        jButtonRegistro.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistro.setText("Registrarse");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonInicioSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioSesActionPerformed
        // TODO add your handling code here:
        user = jTextFieldUser.getText().trim();
        pass = jPasswordField1.getText().trim();
        if(!user.equals("")|| !pass.equals("")){
            try{
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select nombre, contrase??a from usuario where nombre = '"+user 
                    + "' and contrase??a = '"+ pass + "'");
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    String usuario = rs.getString("nombre");
                    String contrase??a = rs.getString("contrase??a");
                    InterfazSelecProyect abrir = new InterfazSelecProyect();
                    abrir.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Datos incorrectos.");
                    jTextFieldUser.setText("");
                    jPasswordField1.setText("");
                }
            }catch(Exception e){
                System.err.println("Error en el boton acceder"+e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesi??n.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
//        try {
//            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sgp", "root", "");
//            PreparedStatement pst = cn.prepareStatement("select * from usuario where usuario = ?");
//            ResultSet rs = pst.executeQuery();
//            if (rs.next()) {
//                jTextFieldUser.setText(rs.getString("nombre"));
//                jPasswordField1.setText(rs.getString("contrase??a"));
//                InterfazSelecProyect abrir = new InterfazSelecProyect();
//                abrir.setVisible(true);
//                dispose();
//            } else {
//                JOptionPane.showMessageDialog(null, "Contrase??a o Usuario Incorrecto");
//            }
//        } catch (Exception e) {
//
//        }
//        InterfazSelecProyect abrir = new InterfazSelecProyect();
//        abrir.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButtonInicioSesActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        // TODO add your handling code here
        InterfazRegistro abrir = new InterfazRegistro();
        abrir.setVisible(true);
    }//GEN-LAST:event_jButtonRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonInicioSes;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
