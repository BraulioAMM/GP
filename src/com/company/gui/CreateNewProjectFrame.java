package com.company.gui;

import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class CreateNewProjectFrame extends JFrame {
    private JButton jButtonClose;
    private JButton jButtonCrearProyecto;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaNotas;
    private JTextField jTextFieldFecha;
    private JTextField jTextFieldNombreProyecto;

    public CreateNewProjectFrame() {
        initComponents();
    }

    public void initComponents() {
        jButtonCrearProyecto = new JButton();
        jButtonClose = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextAreaNotas = new JTextArea();
        jTextFieldNombreProyecto = new JTextField();
        jTextFieldFecha = new JTextField();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout(5, 5));

    }

    private void jButtonCloseActionPerformed(ActionEvent evt) {
        dispose();
  //      InterfazSelecProyect abrir = new InterfazSelecProyect();
  //      abrir.setVisible(true);
    }

    private void jButtonCrearProyectoActionPerformed(ActionEvent evt) {
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewProjectFrame().setVisible(true);
            }
        });
    }
}