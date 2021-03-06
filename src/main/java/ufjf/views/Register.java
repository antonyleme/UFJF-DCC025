/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.views;

import ufjf.aplicacao.App;
import ufjf.controllers.RegisterController;

/**
 *
 * @author Antony Leme Novais Ferreira - 202065009A
 */
public class Register extends javax.swing.JFrame {
    
    private RegisterController controller;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        controller = new RegisterController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordLabel1 = new javax.swing.JLabel();
        submitRegisterButton = new javax.swing.JButton();
        cancelRegisterButton = new javax.swing.JButton();
        registerPasswordInput = new javax.swing.JPasswordField();
        title1 = new javax.swing.JLabel();
        subtitle1 = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        registerNameInput = new javax.swing.JTextField();
        emailLabel2 = new javax.swing.JLabel();
        registerEmailInput = new javax.swing.JTextField();
        cpfEmailInput = new javax.swing.JTextField();
        emailLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        passwordLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        passwordLabel1.setText("Senha");

        submitRegisterButton.setBackground(new java.awt.Color(51, 153, 255));
        submitRegisterButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        submitRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        submitRegisterButton.setText("Registrar");
        submitRegisterButton.setBorderPainted(false);
        submitRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRegisterButtonActionPerformed(evt);
            }
        });

        cancelRegisterButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelRegisterButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cancelRegisterButton.setText("Cancelar");
        cancelRegisterButton.setBorderPainted(false);
        cancelRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegisterButtonActionPerformed(evt);
            }
        });

        registerPasswordInput.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        registerPasswordInput.setBorder(null);

        title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title1.setText("Simuvac");

        subtitle1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        subtitle1.setText("Sistema Municipal de Vacina????o");

        emailLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        emailLabel1.setText("Nome");

        registerNameInput.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        registerNameInput.setBorder(null);

        emailLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        emailLabel2.setText("Email");

        registerEmailInput.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        registerEmailInput.setBorder(null);

        cpfEmailInput.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cpfEmailInput.setBorder(null);

        emailLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        emailLabel3.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(emailLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(registerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(title1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(subtitle1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cancelRegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitRegisterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(passwordLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailLabel2)
                                .addComponent(registerEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailLabel3)
                                .addComponent(cpfEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle1)
                .addGap(18, 18, 18)
                .addComponent(emailLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(passwordLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(submitRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelRegisterButton)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRegisterButtonActionPerformed
        controller.register();
    }//GEN-LAST:event_submitRegisterButtonActionPerformed

    private void cancelRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegisterButtonActionPerformed
        App.router.navigate("login");
    }//GEN-LAST:event_cancelRegisterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelRegisterButton;
    private javax.swing.JTextField cpfEmailInput;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JLabel emailLabel3;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTextField registerEmailInput;
    private javax.swing.JTextField registerNameInput;
    private javax.swing.JPasswordField registerPasswordInput;
    private javax.swing.JButton submitRegisterButton;
    private javax.swing.JLabel subtitle1;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
