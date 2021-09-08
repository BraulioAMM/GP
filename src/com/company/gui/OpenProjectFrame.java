package com.company.gui;

import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class OpenProjectFrame extends JFrame {
    public OpenProjectFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        jButtonOpenProject = new JButton();
        jButtonCancel = new JButton();
        jComboBoxProjectList = new JComboBox<>();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(720, 640);

        jComboBoxProjectList.setModel(new DefaultComboBoxModel<>(
                new String[] { "Seleccione un projecto...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxProjectList);

        jButtonOpenProject.setText("Open");
        jButtonOpenProject.setSize(100, 100);
        jButtonOpenProject.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonOpenProjectActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOpenProject);

        jButtonCancel.setText("Cancel");
        jButtonCancel.setSize(100, 100);
        jButtonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel);

        // pack();
    }

    private void jButtonOpenProjectActionPerformed(ActionEvent evt) {
        dispose();
        OpenProjectFrame openProjectFrame = new OpenProjectFrame();
        openProjectFrame.setVisible(true);
    }

    private void jButtonCancelActionPerformed(ActionEvent evt) {
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenProjectFrame().setVisible(true);
            }
        });
    }

    private JButton jButtonOpenProject;
    private JButton jButtonCancel;
    private JComboBox<String> jComboBoxProjectList;
}
