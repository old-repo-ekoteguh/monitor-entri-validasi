/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.bps.lampung.monitorentri.ui;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ekoteguh
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    
    MainFrame mainFrame;
    
    public LoginPanel(MainFrame frame) {
        this.mainFrame = frame;
        initComponents();
        
        LoginPanel.this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 200));
    }
    
    private void resetForm(){
        this.tUsername.setText("");
        this.tPassword.setText("");
        this.cmbSurvei.setSelectedIndex(0);
        this.tUsername.requestFocus();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tUsername = new javax.swing.JTextField();
        tPassword = new javax.swing.JPasswordField();
        cmbSurvei = new javax.swing.JComboBox<>();
        bLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1024, 670));

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sensus/Survei");

        tUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 1, true));
        tUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tUsernameKeyPressed(evt);
            }
        });

        tPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 1, true));
        tPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tPasswordKeyPressed(evt);
            }
        });

        cmbSurvei.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbSurvei.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Sensus/Survei -", "SE2016 UMK UMB" }));
        cmbSurvei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 1, true));

        bLogin.setBackground(new java.awt.Color(255, 153, 0));
        bLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bLogin.setForeground(new java.awt.Color(255, 255, 255));
        bLogin.setText("Login");
        bLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        bLogin.setBorderPainted(false);
        bLogin.setOpaque(true);
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbSurvei, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tPassword)
                        .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbSurvei, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        // TODO add your handling code here:
        String username = tUsername.getText();
        String password = tPassword.getText();
        int sensusSurvei = cmbSurvei.getSelectedIndex();
        
        if(username.equals("") || password.equals("") || sensusSurvei == 0){
            JOptionPane.showMessageDialog(this, "Isian masih ada yang kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            resetForm();
        }
        else{
            if(username.equals("admin") && password.equals("admin") && sensusSurvei == 1){
                JOptionPane.showMessageDialog(this, "Selamat datang, Admin!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                this.mainFrame.setLogged(true, 1, cmbSurvei.getSelectedItem().toString());
            }else if(username.equals("operator") && password.equals("operator") && sensusSurvei == 1){
                JOptionPane.showMessageDialog(this, "Selamat datang, Operator!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                this.mainFrame.setLogged(true, 3, cmbSurvei.getSelectedItem().toString());
            }else if(username.equals("supervisor") && password.equals("supervisor") && sensusSurvei == 1){
                this.mainFrame.setLogged(true, 2, cmbSurvei.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this, "Selamat datang, Supervisor!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }else{
                this.mainFrame.setLogged(false, 0, "");
                JOptionPane.showMessageDialog(this, "Username/Password/pilihan Sensus/Survei masih salah!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            resetForm();
        }
    }//GEN-LAST:event_bLoginActionPerformed

    private void tUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tUsernameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            if(tUsername.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Isian username kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                tUsername.requestFocus();
            }else{
                tPassword.requestFocus();
            }
        }
    }//GEN-LAST:event_tUsernameKeyPressed

    private void tPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            if(tPassword.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Isian password kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                tPassword.requestFocus();
            }else{
                cmbSurvei.requestFocus();
            }
        }
    }//GEN-LAST:event_tPasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JComboBox<String> cmbSurvei;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tUsername;
    // End of variables declaration//GEN-END:variables
}
