/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.views.Manager;

import ufjf.aplicacao.App;

/**
 *
 * @author anton
 */
public class Nurses extends javax.swing.JFrame {

    /**
     * Creates new form Nurses
     */
    public Nurses() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addRegisterButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        inicioMenuItem = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        addRegisterButton.setBackground(new java.awt.Color(51, 153, 255));
        addRegisterButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        addRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        addRegisterButton.setText("Novo enfermeiro");
        addRegisterButton.setBorderPainted(false);
        addRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRegisterButtonActionPerformed(evt);
            }
        });

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inicioMenuItem.setText("Início");
        inicioMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioMenuItemActionPerformed(evt);
            }
        });
        menuBar.add(inicioMenuItem);

        jMenu2.setText("Opções");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addRegisterButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioMenuItemActionPerformed
        App.router.navigate("home");
    }//GEN-LAST:event_inicioMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        App.router.navigate("login");
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void addRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRegisterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRegisterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Nurses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nurses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nurses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nurses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nurses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRegisterButton;
    private javax.swing.JMenu inicioMenuItem;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
