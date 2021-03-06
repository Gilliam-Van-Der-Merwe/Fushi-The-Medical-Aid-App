/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fushithemedicalaidapp;

import static fushithemedicalaidapp.Controller.appMain;
import static fushithemedicalaidapp.Controller.db;
import static fushithemedicalaidapp.Controller.health;
import static fushithemedicalaidapp.Controller.rewards;
import static fushithemedicalaidapp.Controller.user;
import static fushithemedicalaidapp.HealthMnu.actFeedDisplay;
import static fushithemedicalaidapp.HealthMnu.headerDisplay;
import static fushithemedicalaidapp.HealthMnu.txtDisplay2;
import static fushithemedicalaidapp.HealthMnu.txtDisplay3;
import static fushithemedicalaidapp.HealthMnu.txtDisplay4;
import static fushithemedicalaidapp.LoginMnu.username;
import static fushithemedicalaidapp.RewardsMnu.jTextArea1;
import static fushithemedicalaidapp.RewardsMnu.rewardsTxtDisplay;
import static fushithemedicalaidapp.UserMnu.userTxtDisplay;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author gilli
 */
public class PortfolioMnu extends javax.swing.JFrame {
    static FushiTheMedicalAidArray arr2 = new FushiTheMedicalAidArray();
    /**
     * Creates new form PortfolioMnu
     */
    public PortfolioMnu() {
        ///////////////////////////////////////////////////////////////////////
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:\\Users\\gilli\\OneDrive\\Documents\\NetBeansProjects\\FusiTHeMedicalAidApp\\PortfolioMnu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(699, 515, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        setContentPane(new JLabel(imageIcon));
        ////////////////////////////////////////////////////////////////////////
        initComponents();
        ///////////////////////////////////////////////////////////////////////
        this.setLocationRelativeTo(null);
        ///////////////////////////////////////////////////////////////////////
        userMnuBtn.setContentAreaFilled(false);
        extBtn3.setContentAreaFilled(false);
        healthMnuBtn.setContentAreaFilled(false);
        rewardsMnuBtn.setContentAreaFilled(false);
        ///////////////////////////////////////////////////////////////////////
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        extBtn3 = new javax.swing.JButton();
        healthMnuBtn = new javax.swing.JButton();
        rewardsMnuBtn = new javax.swing.JButton();
        userMnuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(697, 521));

        extBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extBtn3ActionPerformed(evt);
            }
        });

        healthMnuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthMnuBtnActionPerformed(evt);
            }
        });

        rewardsMnuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewardsMnuBtnActionPerformed(evt);
            }
        });

        userMnuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMnuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(extBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userMnuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(healthMnuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rewardsMnuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 186, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(extBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(userMnuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(healthMnuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rewardsMnuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void extBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extBtn3ActionPerformed
        setVisible(false);// set PortfolioMnu invisible
        appMain.setLocationRelativeTo(null);
        appMain.setVisible(true);
    }//GEN-LAST:event_extBtn3ActionPerformed

    private void healthMnuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthMnuBtnActionPerformed
        setVisible(false);// set PortfolioMnu invisible
        health.setLocationRelativeTo(null);
        health.setVisible(true);
        headerDisplay.setText("IDNumber:" + "\t" + "Mass:" + "\t" + "BPM:" + "\t" + "Height:" + "\t" + "HoursSlept:" + "\t" + "CalorieIntake:" + "\t" + "WaterIntake:" + "\t" + "Steps:" + "\t" + "Goal:" + "\t" + "Gender:" + "\t" + "Age:" + "\t");
        txtDisplay2.setText(arr2.toString());
        txtDisplay3.setText(arr2.calcBMI() + "\tkg/m^2");
        txtDisplay4.setText(arr2.calcBMR() + "\tkcals per day");
        actFeedDisplay.setText(arr2.actFeed());
    }//GEN-LAST:event_healthMnuBtnActionPerformed

    private void userMnuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMnuBtnActionPerformed
        setVisible(false);// set PortfolioMnu invisible
        user.setLocationRelativeTo(null);
        user.setVisible(true);
        userTxtDisplay.setText(db.queryTblUserPersonalData("SELECT * FROM tblUserPersonalData, tblUserLoginData WHERE tblUserLoginData.IDNumber = tblUserPersonalData.IDNumber AND tblUserLoginData.Username = '" + username + "';"));
    }//GEN-LAST:event_userMnuBtnActionPerformed

    private void rewardsMnuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewardsMnuBtnActionPerformed
        setVisible(false);// set PortfolioMnu invisible
        rewards.setLocationRelativeTo(null);
        rewards.setVisible(true);
        jTextArea1.setText("IDNumber:" +"\t\t" + "Level:"+ "\t\t" + "Progress:"	+ "\t\t" +  "Score:");
        rewardsTxtDisplay.setText(db.queryTblLevels("SELECT * FROM tblLevels, tblUserLoginData WHERE tblUserLoginData.IDNumber = tblLevels.IDNumber AND tblUserLoginData.Username = '" + username + "';") + (db.queryTblUserProfile("SELECT * FROM tblUserProfile, tblUserLoginData WHERE tblUserLoginData.IDNumber = tblUserProfile.IDNumber AND tblUserLoginData.Username = '" + username + "';")));
    }//GEN-LAST:event_rewardsMnuBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PortfolioMnu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PortfolioMnu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PortfolioMnu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PortfolioMnu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PortfolioMnu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton extBtn3;
    private javax.swing.JButton healthMnuBtn;
    private javax.swing.JButton rewardsMnuBtn;
    private javax.swing.JButton userMnuBtn;
    // End of variables declaration//GEN-END:variables
}
