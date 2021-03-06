/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.views;

import ufjf.aplicacao.App;

/**
 *
 * @author Antony Leme Novais Ferreira - 202065009A
 */
public class Vaccine extends javax.swing.JFrame {

    /**
     * Creates new form Vaccine
     */
    public Vaccine() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        vaccineLabel = new javax.swing.JLabel();
        vaccineValueLabel = new javax.swing.JLabel();
        firstDateValueLabel = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        secondDoseLabel = new javax.swing.JLabel();
        secondDateValueLabel = new javax.swing.JLabel();
        dateLabel2 = new javax.swing.JLabel();
        firstDoseLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        inicioMenuItem = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        vaccineLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        vaccineLabel.setText("Vacina");

        vaccineValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vaccineValueLabel.setText("Astrazeneca");

        firstDateValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firstDateValueLabel.setForeground(new java.awt.Color(51, 204, 0));
        firstDateValueLabel.setText("20/04/2020");

        dateLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        dateLabel1.setText("Data");

        secondDoseLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        secondDoseLabel.setText("Segunda dose");

        secondDateValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        secondDateValueLabel.setText("20/04/2020");

        dateLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        dateLabel2.setText("Data");

        firstDoseLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstDoseLabel.setText("Primeira dose");

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inicioMenuItem.setText("In??cio");
        inicioMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioMenuItemActionPerformed(evt);
            }
        });
        menuBar.add(inicioMenuItem);

        jMenu2.setText("Op????es");
        jMenu2.setToolTipText("");

        logoutMenuItem.setText("Logout");
        logoutMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(logoutMenuItem);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vaccineValueLabel)
                    .addComponent(vaccineLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstDoseLabel)
                            .addComponent(firstDateValueLabel)
                            .addComponent(dateLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondDoseLabel)
                            .addComponent(secondDateValueLabel)
                            .addComponent(dateLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(vaccineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vaccineValueLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstDoseLabel)
                    .addComponent(secondDoseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondDateValueLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstDateValueLabel)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        App.router.navigate("login");
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void inicioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioMenuItemActionPerformed
        App.router.navigate("home");
    }//GEN-LAST:event_inicioMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Vaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vaccine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateLabel2;
    private javax.swing.JLabel firstDateValueLabel;
    private javax.swing.JLabel firstDoseLabel;
    private javax.swing.JMenu inicioMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel secondDateValueLabel;
    private javax.swing.JLabel secondDoseLabel;
    private javax.swing.JLabel vaccineLabel;
    private javax.swing.JLabel vaccineValueLabel;
    // End of variables declaration//GEN-END:variables
}
