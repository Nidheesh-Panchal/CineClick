/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author nilu1
 */
public class mainpage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     */
    String username;
    public static Connection connecrDb() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println("Connection failure");
        }
        return null;
    }
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public mainpage(String use) {
        initComponents();
        username=use;
        conn=connecrDb();
    }

    private mainpage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        profile_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mail_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fname_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lname_txt = new javax.swing.JTextField();
        updateprofile_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username_txt1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        repass_txt = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        fname_txt1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lname_txt1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mail_txt1 = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });
        jTabbedPane2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPane2ComponentShown(evt);
            }
        });

        profile_panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                profile_panelComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Username");

        username_txt.setEditable(false);
        username_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                username_txtKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Email Id");

        mail_txt.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("First Name");

        fname_txt.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Last Name");

        lname_txt.setEditable(false);

        javax.swing.GroupLayout profile_panelLayout = new javax.swing.GroupLayout(profile_panel);
        profile_panel.setLayout(profile_panelLayout);
        profile_panelLayout.setHorizontalGroup(
            profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profile_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(username_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                    .addGroup(profile_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)
                        .addComponent(mail_txt))
                    .addGroup(profile_panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(profile_panelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(49, 49, 49)
                        .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname_txt)
                            .addComponent(lname_txt))))
                .addGap(21, 21, 21))
        );
        profile_panelLayout.setVerticalGroup(
            profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Profile", profile_panel);

        updateprofile_panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateprofile_panelComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Username");

        username_txt1.setEditable(false);
        username_txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                username_txt1KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("New Password");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Retype Password");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("First Name");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Last Name");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Email Id");

        mail_txt1.setEditable(false);

        update_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateprofile_panelLayout = new javax.swing.GroupLayout(updateprofile_panel);
        updateprofile_panel.setLayout(updateprofile_panelLayout);
        updateprofile_panelLayout.setHorizontalGroup(
            updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateprofile_panelLayout.createSequentialGroup()
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateprofile_panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lname_txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(fname_txt1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_txt1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(repass_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mail_txt1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(updateprofile_panelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(update_button)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        updateprofile_panelLayout.setVerticalGroup(
            updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateprofile_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(repass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(mail_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fname_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lname_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update_button)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Update Profile", updateprofile_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void username_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_username_txtKeyTyped

    private void username_txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txt1KeyTyped
        // TODO add your handling code here:
        if(' '==evt.getKeyChar())
        {
            evt.consume();
        }
    }//GEN-LAST:event_username_txt1KeyTyped

    private void jTabbedPane2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2ComponentShown

    private void updateprofile_panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateprofile_panelComponentShown
        // TODO add your handling code here:
//        username_txt1.setText("Nidheesh");
//        fname_txt1.setText("Nidheesh");
//        lname_txt1.setText("Panchal");
//        mail_txt1.setText("nidheeshpanchal@gmail.com");

String sql = "select * from customer where username=?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,username);
            //pst.setString(2,password_txt.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                username_txt1.setText(rs.getNString("username"));
                fname_txt1.setText(rs.getNString("firstname"));
                lname_txt1.setText(rs.getNString("lastname"));
                mail_txt1.setText(rs.getNString("emailid"));
                //JOptionPane.showMessageDialog(null, "username and password are correct");
//                String pass=password_txt.getText();
//                if (rs.getNString("password").equals(pass))
//                {
//                    JOptionPane.showMessageDialog(null, "username and password are correct");
//                    String username=username_txt.getText();
//                    mainpage mainp=new mainpage(username);
//                    mainp.setVisible(true);
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "Either username or password is incorrect");
//                }
                
            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "no username");
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_updateprofile_panelComponentShown

    private void profile_panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_profile_panelComponentShown
        // TODO add your handling code here:
//        username_txt.setText("username");
//        mail_txt.setText("nidheeshpancahl@gmail.com");
//        fname_txt.setText("Nidheesh");
//        lname_txt.setText("Panchal");
String sql = "select * from customer where username=?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,username);
            //pst.setString(2,password_txt.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                username_txt.setText(rs.getNString("username"));
                mail_txt.setText(rs.getNString("emailid"));
                fname_txt.setText(rs.getNString("firstname"));
                lname_txt.setText(rs.getNString("lastname"));
                //JOptionPane.showMessageDialog(null, "username and password are correct");
//                String pass=password_txt.getText();
//                if (rs.getNString("password").equals(pass))
//                {
//                    JOptionPane.showMessageDialog(null, "username and password are correct");
//                    String username=username_txt.getText();
//                    mainpage mainp=new mainpage(username);
//                    mainp.setVisible(true);
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "Either username or password is incorrect");
//                }
                
            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "no username");
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_profile_panelComponentShown

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        // TODO add your handling code here:        
        if(password_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter password in the password field");
            return;
        }
        if(username_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid username");
            return;
        }
        String sql = "select * from customer where username=?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,username_txt.getText());
            //pst.setString(2,password_txt.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                //JOptionPane.showMessageDialog(null, "username and password are correct");
                String pass=password_txt.getText();
                if (rs.getNString("password").equals(pass))
                {
                    JOptionPane.showMessageDialog(null, "username and password are correct");
                    String username=username_txt.getText();
                    mainpage mainp=new mainpage(username);
                    mainp.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Either username or password is incorrect");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "no username");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fname_txt;
    private javax.swing.JTextField fname_txt1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JTextField lname_txt1;
    private javax.swing.JTextField mail_txt;
    private javax.swing.JTextField mail_txt1;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JPanel profile_panel;
    private javax.swing.JPasswordField repass_txt;
    private javax.swing.JButton update_button;
    private javax.swing.JPanel updateprofile_panel;
    private javax.swing.JTextField username_txt;
    private javax.swing.JTextField username_txt1;
    // End of variables declaration//GEN-END:variables
}