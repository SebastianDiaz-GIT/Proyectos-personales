/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amame;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Diaz
 */
public class doyouwant extends javax.swing.JFrame {

    /**
     * Creates new form doyouwant
     */
    public doyouwant() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonNo = new javax.swing.JButton();
        botonSi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonNo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonNo.setText("NO");
        botonNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonNoMouseEntered(evt);
            }
        });
        botonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNoActionPerformed(evt);
            }
        });

        botonSi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonSi.setText("SI");
        botonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("¿Quieres ser mi novia ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(botonNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSi)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNo)
                    .addComponent(botonSi))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonNoActionPerformed

    private void botonNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNoMouseEntered
        
        Random r = new Random();
        int low = 1;
        int high = 328;
        int result = r.nextInt(high - low) + low;
        
        int low2 = 1;
        int high2 = 250;
        int result2 = r.nextInt(high2 - low2) + low2;
        
        botonNo.setLocation(result, result2);
    }//GEN-LAST:event_botonNoMouseEntered

    private void botonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiActionPerformed
        JOptionPane.showMessageDialog(null, "Sabia que dirias que SI");
    }//GEN-LAST:event_botonSiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        doyouwant ventana = new doyouwant();
        ventana.setBounds(0, 0, 400, 300);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new doyouwant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNo;
    private javax.swing.JButton botonSi;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}