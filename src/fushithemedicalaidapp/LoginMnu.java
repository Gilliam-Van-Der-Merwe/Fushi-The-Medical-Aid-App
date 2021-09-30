/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fushithemedicalaidapp;

import static fushithemedicalaidapp.Controller.appMain;
import static fushithemedicalaidapp.Controller.db;
import static fushithemedicalaidapp.Controller.reg;
import static fushithemedicalaidapp.PortfolioMnu.arr2;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author gvdme17
 */
public class LoginMnu extends javax.swing.JFrame {
    static String username = "";
    static FushiTheMedicalAidArray arr = new FushiTheMedicalAidArray();
    private BasicPlayer player = new BasicPlayer();// Created object of BasicPlayer class in order to use object as music player.
    /**
     * Creates new form LoginMnu
     */ 
    public LoginMnu() {
        ////////////////////////////////////////////////////////////////////////
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:\\Users\\gilli\\OneDrive\\Documents\\NetBeansProjects\\FusiTHeMedicalAidApp\\LoginMnu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(699, 515, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        setContentPane(new JLabel(imageIcon));
        ////////////////////////////////////////////////////////////////////////
        initComponents();
        ////////////////////////////////////////////////////////////////////////
        this.setLocationRelativeTo(null);
        ////////////////////////////////////////////////////////////////////////
        music();
        ////////////////////////////////////////////////////////////////////////
    }
    ////////////////////////////////////////////////////////////////////////////
    public void loginMet()
    {
        try {
            String u = "", rU, rP, temp;
            
            player.stop();
            
            u = userField.getText();// gets username input
            char[] p = passField.getPassword(); // creates char array for password input
            String newP = new String(p);
            temp = db.loginInfo("SELECT * FROM tblUserLoginData WHERE Password = '" + newP + "';");//Get information from tblClientInfo in database
            username = u;
            
            if(u.equals("") || newP.equals(""))// If no user input.
            {
                JOptionPane.showMessageDialog(null, "Invalid Password or Username\nPlease Try Again");
            }   
            String[] parts = temp.split("(\\s)");// Split String into String array
            rU = parts[0];
            rP = parts[1];
            
            if(!u.equals(rU) && !newP.equals(rP))// If no user input.
            {
                JOptionPane.showMessageDialog(null, "Invalid Password or Username\nPlease Try Again");
            } 
            
            if(u.equals(rU) && newP.equals(rP)) // match credentials - check to see whether there is a match 
            {
                System.out.println("CHECK CHECK");
                userField.setText("");// reset username field
                passField.setText("");//reset password field
                setVisible(false);// set LoginMnu invisible
                appMain.setLocationRelativeTo(null);
                appMain.setVisible(true);// set AppMnu visible
                
                try {
                    player.open(new URL("file:///" + System.getProperty("user.dir") +"/"+ "rain.mp3"));// using path as new URL.
                }
                catch (MalformedURLException ex) {
                    ex.printStackTrace();
                }
                player.play();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Password or Username\nPlease Try Again");
            }
            
        }
        catch (BasicPlayerException ex) {
            ex.printStackTrace();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void music()// method utilizes BasicPlayer library to play music from a file.
    {
        String sN1 = "med.mp3"; // song name
        String p1 = System.getProperty("user.dir") +"/"+ sN1; // song file path
        
        try//exception hanlding
        {
            player.open(new URL("file:///" + p1));// using path as new URL.
            player.play();//Executing song specified.
        }
        catch(BasicPlayerException | MalformedURLException e)//
        {
            e.printStackTrace();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginHeaderTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        RegMnuBtn = new javax.swing.JButton();
        ExtBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        LoginHeaderTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LoginHeaderTxt.setForeground(new java.awt.Color(0, 0, 204));
        LoginHeaderTxt.setText("FushiTheMedicalAidApp");
        LoginHeaderTxt.setDoubleBuffered(true);

        jLabel1.setText("USERNAME:");

        jLabel2.setText("PASSWORD:");

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        LoginBtn.setText("LOGIN");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        RegMnuBtn.setText("REGISTER");
        RegMnuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegMnuBtnActionPerformed(evt);
            }
        });

        ExtBtn.setText("EXIT");
        ExtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("WeWantYou!");

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegMnuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 208, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginHeaderTxt)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(userField))))
                        .addGap(209, 209, 209))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(LoginHeaderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(ExtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegMnuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        loginMet();
        arr.FushiTheMedicalAidArray();
        arr2.FushiTheMedicalAidArray();
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void ExtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExtBtnActionPerformed

    private void RegMnuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegMnuBtnActionPerformed
        setVisible(false);// set LoginMnu invisible
        reg.setLocationRelativeTo(null);
        reg.setVisible(true);
        
    }//GEN-LAST:event_RegMnuBtnActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginMnu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMnu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMnu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMnu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMnu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExtBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel LoginHeaderTxt;
    private javax.swing.JButton RegMnuBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
