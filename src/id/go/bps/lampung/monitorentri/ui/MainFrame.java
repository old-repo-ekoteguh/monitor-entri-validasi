/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.bps.lampung.monitorentri.ui;

import id.go.bps.lampung.monitorentri.assets.ResourceImage;
import id.go.bps.lampung.monitorentri.assets.StringImage;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author ekoteguh
 */
public class MainFrame extends javax.swing.JFrame {

    int status = 0;
    String sensusSurveiId;
    boolean isLoggedIn = false;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        MainFrame.this.setSize(1024, 720);
        MainFrame.this.setLocationRelativeTo(null);
        MainFrame.this.setResizable(false);
        MainFrame.this.setLogged(this.isLoggedIn, 0, "");
    }
    
    public void setLogged(boolean isLoggedIn, int status, String sensusSurvei){
        this.isLoggedIn = isLoggedIn;
        this.status = status;
        this.sensusSurveiId = sensusSurvei;
        
        checkLogin(this.isLoggedIn);
        this.setMenuEnable(isLoggedIn, status);
    }
    
    public void checkLogin(boolean b){
        if(b){
            this.mainPanel.removeAll();
            this.mainPanel.add(new HomePanel(this));
            this.mainPanel.repaint();
            this.mainPanel.revalidate();
        }else{
            this.mainPanel.removeAll();
            this.mainPanel.add(new LoginPanel(this));
            this.mainPanel.repaint();
            this.mainPanel.revalidate();
        }
    }
    
    // sementara diaktifkan semua menu
    private void setMenuEnable(boolean b, int status){
        switch (status) {
            case 1:
                //admin
                this.btnMenuHome.setVisible(b);
                this.btnMenuEntriMitra.setVisible(b);
                this.btnMenuValidasiPegawai.setVisible(b);
                this.btnMenuValidasiMitra.setVisible(b);
                this.btnMenuProgress.setVisible(b);
                this.btnMenuLogout.setVisible(b);
                break;
            case 2:
                //supervisor
                this.btnMenuHome.setVisible(b);
                this.btnMenuEntriMitra.setVisible(!b);
                this.btnMenuValidasiPegawai.setVisible(!b);
                this.btnMenuValidasiMitra.setVisible(!b);
                this.btnMenuProgress.setVisible(b);
                this.btnMenuLogout.setVisible(b);
                break;
            case 3:
                //operator
                this.btnMenuHome.setVisible(b);
                this.btnMenuEntriMitra.setVisible(b);
                this.btnMenuValidasiPegawai.setVisible(b);
                this.btnMenuValidasiMitra.setVisible(b);
                this.btnMenuProgress.setVisible(!b);
                this.btnMenuLogout.setVisible(b);
                break;
            case 0:
                this.btnMenuHome.setVisible(b);
                this.btnMenuEntriMitra.setVisible(b);
                this.btnMenuValidasiPegawai.setVisible(b);
                this.btnMenuValidasiMitra.setVisible(b);
                this.btnMenuProgress.setVisible(b);
                this.btnMenuLogout.setVisible(b);
                break;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(new ImageIcon(ResourceImage.getResource(StringImage.BACKGROUND_IMG)).getImage(),0,0,null);
            }
        };
        headerPanel = new javax.swing.JPanel();
        btnMenuEntriMitra = new javax.swing.JButton();
        btnMenuValidasiPegawai = new javax.swing.JButton();
        btnMenuValidasiMitra = new javax.swing.JButton();
        btnMenuLogout = new javax.swing.JButton();
        btnMenuHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMenuProgress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(1024, 670));
        mainPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        headerPanel.setBackground(new java.awt.Color(0, 102, 102));
        headerPanel.setPreferredSize(new java.awt.Dimension(1024, 54));

        btnMenuEntriMitra.setBackground(new java.awt.Color(102, 102, 255));
        btnMenuEntriMitra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuEntriMitra.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuEntriMitra.setText("Entri Mitra");
        btnMenuEntriMitra.setBorderPainted(false);
        btnMenuEntriMitra.setOpaque(true);
        btnMenuEntriMitra.setSize(new java.awt.Dimension(97, 35));
        btnMenuEntriMitra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuEntriMitraActionPerformed(evt);
            }
        });

        btnMenuValidasiPegawai.setBackground(new java.awt.Color(102, 102, 255));
        btnMenuValidasiPegawai.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuValidasiPegawai.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuValidasiPegawai.setText("Validasi Pegawai");
        btnMenuValidasiPegawai.setBorderPainted(false);
        btnMenuValidasiPegawai.setOpaque(true);
        btnMenuValidasiPegawai.setSize(new java.awt.Dimension(97, 35));
        btnMenuValidasiPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuValidasiPegawaiActionPerformed(evt);
            }
        });

        btnMenuValidasiMitra.setBackground(new java.awt.Color(102, 102, 255));
        btnMenuValidasiMitra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuValidasiMitra.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuValidasiMitra.setText("Validasi Mitra");
        btnMenuValidasiMitra.setBorderPainted(false);
        btnMenuValidasiMitra.setOpaque(true);
        btnMenuValidasiMitra.setSize(new java.awt.Dimension(97, 35));
        btnMenuValidasiMitra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuValidasiMitraActionPerformed(evt);
            }
        });

        btnMenuLogout.setBackground(new java.awt.Color(255, 102, 102));
        btnMenuLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuLogout.setText("Log Out");
        btnMenuLogout.setBorderPainted(false);
        btnMenuLogout.setOpaque(true);
        btnMenuLogout.setSize(new java.awt.Dimension(97, 35));
        btnMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuLogoutActionPerformed(evt);
            }
        });

        btnMenuHome.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuHome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuHome.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/go/bps/lampung/monitorentri/assets/home.png"))); // NOI18N
        btnMenuHome.setText("Home");
        btnMenuHome.setAlignmentY(0.0F);
        btnMenuHome.setBorderPainted(false);
        btnMenuHome.setContentAreaFilled(false);
        btnMenuHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenuHome.setPreferredSize(new java.awt.Dimension(35, 35));
        btnMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kendali Pengolahan versi 1.0.4");

        btnMenuProgress.setBackground(new java.awt.Color(102, 102, 255));
        btnMenuProgress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuProgress.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuProgress.setText("Progress Report");
        btnMenuProgress.setBorderPainted(false);
        btnMenuProgress.setOpaque(true);
        btnMenuProgress.setSize(new java.awt.Dimension(97, 35));
        btnMenuProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProgressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnMenuEntriMitra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuValidasiMitra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuValidasiPegawai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuProgress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenuEntriMitra)
                    .addComponent(btnMenuValidasiPegawai)
                    .addComponent(btnMenuValidasiMitra)
                    .addComponent(btnMenuLogout)
                    .addComponent(btnMenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnMenuProgress))
                .addGap(13, 13, 13))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuEntriMitraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuEntriMitraActionPerformed
        // TODO add your handling code here:
        this.mainPanel.removeAll();
        this.mainPanel.add(new EntrianPanel(this));
        this.mainPanel.repaint();
        this.mainPanel.revalidate();
    }//GEN-LAST:event_btnMenuEntriMitraActionPerformed

    private void btnMenuValidasiPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuValidasiPegawaiActionPerformed
        // TODO add your handling code here:
        this.mainPanel.removeAll();
        this.mainPanel.add(new ValidasiPanel(this));
        this.mainPanel.repaint();
        this.mainPanel.revalidate();
    }//GEN-LAST:event_btnMenuValidasiPegawaiActionPerformed

    private void btnMenuValidasiMitraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuValidasiMitraActionPerformed
        // TODO add your handling code here:
        this.mainPanel.removeAll();
        this.mainPanel.add(new ValidasiMitraPanel(this));
        this.mainPanel.repaint();
        this.mainPanel.revalidate();
        this.setMenuEnable(true, this.status);
    }//GEN-LAST:event_btnMenuValidasiMitraActionPerformed

    private void btnMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuLogoutActionPerformed
        // TODO add your handling code here:
        this.mainPanel.removeAll();
        this.mainPanel.add(new LoginPanel(this));
        this.mainPanel.repaint();
        this.mainPanel.revalidate();
        this.setMenuEnable(false, 0);
    }//GEN-LAST:event_btnMenuLogoutActionPerformed

    private void btnMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuHomeActionPerformed
        // TODO add your handling code here:
        this.mainPanel.removeAll();
        this.mainPanel.add(new HomePanel(this));
        this.mainPanel.repaint();
        this.mainPanel.revalidate();
        this.setMenuEnable(true, this.status);
    }//GEN-LAST:event_btnMenuHomeActionPerformed

    private void btnMenuProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProgressActionPerformed
        // TODO add your handling code here:
        this.mainPanel.removeAll();
        this.mainPanel.add(new ProgressPanel(this));
        this.mainPanel.repaint();
        this.mainPanel.revalidate();
        this.setMenuEnable(true, this.status);
    }//GEN-LAST:event_btnMenuProgressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuEntriMitra;
    private javax.swing.JButton btnMenuHome;
    private javax.swing.JButton btnMenuLogout;
    private javax.swing.JButton btnMenuProgress;
    private javax.swing.JButton btnMenuValidasiMitra;
    private javax.swing.JButton btnMenuValidasiPegawai;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
