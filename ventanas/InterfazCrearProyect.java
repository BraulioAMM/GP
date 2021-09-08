package ventanas;

/**
 *
 * @author braul
 */
public class InterfazCrearProyect extends javax.swing.JFrame {

    public InterfazCrearProyect() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombreProyecto = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNotas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButtonCrearProyecto = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del proyecto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de inicio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jTextFieldNombreProyecto.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldNombreProyecto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 400, -1));

        jTextFieldFecha.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldFecha.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 400, -1));

        jTextAreaNotas.setBackground(new java.awt.Color(51, 51, 51));
        jTextAreaNotas.setColumns(20);
        jTextAreaNotas.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextAreaNotas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 580, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Notas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jButtonCrearProyecto.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCrearProyecto.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonCrearProyecto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrearProyecto.setText("Crear");
        jButtonCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearProyectoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jButtonClose.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClose.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonClose.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClose.setText("x");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 665, 366));

        pack();
    }
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        dispose();
        InterfazSelecProyect abrir = new InterfazSelecProyect();
        abrir.setVisible(true);
    }

    private void jButtonCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearProyectoActionPerformed
        InterfazInicial abrir = new InterfazInicial();
        abrir.setVisible(true);
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCrearProyect().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonCrearProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaNotas;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombreProyecto;
}
