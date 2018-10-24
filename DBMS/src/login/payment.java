/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author vandi
 */
public class payment extends javax.swing.JFrame 
{

    /**
     * Creates new form payment
     */
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
    String time;
    String theatreid;
    ArrayList se1=new ArrayList();
    String cvvsql;
    java.util.Date expdatesqldate;
    String cnamesql;
    String expdatesql;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    java.util.Date expdat;
    java.util.Date dat=new Date(System.currentTimeMillis());
    
    public final mainpage mainp;
    public final seat seat1;
    public payment(mainpage m,seat s1,ArrayList se,String time1,String threat) {
        initComponents();
        mainp=m;
        seat1=s1;
        se1=se;
        time=time1;
        theatreid=threat;
        conn = connecrDb();
    }
    private payment() {
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

        jPanel1 = new javax.swing.JPanel();
        cardno = new javax.swing.JTextField();
        cvv = new javax.swing.JPasswordField();
        cardname = new javax.swing.JTextField();
        expirydate = new com.toedter.calendar.JDateChooser();
        pay_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancel_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cardno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cvv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cardname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cardname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnameActionPerformed(evt);
            }
        });

        expirydate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pay_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pay_button.setText("pay");
        pay_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Card Number:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("CVV:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Expiry Date:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Name On the Card:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Payment Gateway");

        cancel_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancel_button.setText("cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(pay_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel_button)
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(33, 33, 33)
                                        .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(expirydate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(41, 41, 41)
                                .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(expirydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pay_button)
                    .addComponent(cancel_button))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void cardnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnameActionPerformed

    private void pay_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_buttonActionPerformed
        // TODO add your handling code here:
        if(cvv.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter CVV in the CVV field");
            return;
        }
        if(cardno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid Card Number");
            return;
        }
        if(cardname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter the name given on the card you are using");
            return;
        }
         expdat=expirydate.getDate();
         String dd=Integer.toString(expdat.getDate());
         String mm=Integer.toString(expdat.getMonth()+1);
         String yy=Integer.toString(expdat.getYear()+1900);
         String expiry_date=yy+"-"+mm+"-"+dd;
         System.out.println(expiry_date);
         System.out.println(cardname.getText());
         System.out.println(cvv.getText());
         //String sql="select cvv,cardname,expirydate from payment where cardno=?";
         String sql="select cvv,cardname,expirydate from payment where cardno=?";
         try
         {
//            JOptionPane.showMessageDialog(null,cardno.getText()); 
            pst=conn.prepareStatement(sql);
           // JOptionPane.showMessageDialog(null,"hi1");
            pst.setString(1,cardno.getText());
            //JOptionPane.showMessageDialog(null,"hi");
            rs = pst.executeQuery();
           // JOptionPane.showMessageDialog(null,rs.next()); 
            if(rs.next())
            {
               cvvsql=Integer.toString(rs.getInt(1));
//               System.out.println(cvvsql);
               cnamesql=rs.getNString(2);
//               System.out.println(cnamesql);
               expdatesqldate=rs.getDate(3);
//               System.out.println(expdatesqldate);
               String ddexp=Integer.toString(expdatesqldate.getDate());
               String mmexp=Integer.toString(expdatesqldate.getMonth()+1);
               String yyexp=Integer.toString(expdatesqldate.getYear()+1900);
               String expdatesql=yyexp+"-"+mmexp+"-"+ddexp;
//               System.out.println(expdatesql);
               
               if(!cardname.getText().equals(cnamesql))
                {
                    JOptionPane.showMessageDialog(null,"Invalid name on card");
                    return;
                }
               else if(!cvv.getText().equals(cvvsql))
                {
                    JOptionPane.showMessageDialog(null,"Invalid cvv");
                    return;
                }
               else if(!expiry_date.equals(expdatesql))
                {
                    JOptionPane.showMessageDialog(null,"Invalid expiry date");
                    return;
                }
               else
               {
                   //get theatreid
                   String insert="insert into ticket values (?,?,?,?,?,?)";
                   pst=conn.prepareStatement(insert);
                   pst.setString(1,mainp.username);
                   pst.setString(2,theatreid);
                   pst.setString(3,Integer.toString(mainp.hallid));
                   pst.setString(4,time);
                   pst.setString(5,mainp.dat);
                   
                   for (int i=0;i<se1.size();i++)
                   {
                       try
                       {
                           pst.setString(6,(String)se1.get(i));
                           pst.execute();
                       }
                       catch(Exception ex)
                       {
                           JOptionPane.showMessageDialog(null,ex);
                       }
                   }
                  String abc="update screening set noseatbooked=noseatbooked+"+se1.size()+" where theatreid=? and challid=? and time=? and date=?";
                    try
                    {
                        pst = conn.prepareStatement(abc);
                        pst.setString(1,theatreid);
                        pst.setString(2,Integer.toString(mainp.hallid));
                        pst.setString(3,time);
                        pst.setString(4,mainp.dat);
                        pst.execute();
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
                    String seats="";
                    for(int i=0;i<se1.size();i++)
                    {
                        seats=seats+" "+se1.get(i);
                    }
                    SendEmail s=new SendEmail();
                    //System.out.println(seat1.receiver);
                    s.booking(seat1.receiver,mainp.username,mainp.dat,time,mainp.hall,theatreid, mainp.moviename,seats);
                   JOptionPane.showMessageDialog(null,"Transaction completed");
                    
                    mainp.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
               }
            }
            
         }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_pay_buttonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        expirydate.setDate(dat);
        expirydate.setMinSelectableDate(dat);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
//       String roll="rollback;";
//        try
//        {
//           pst = conn.prepareStatement(roll);
//           pst.execute();
//        }
//        catch(Exception e)
//        {
//           JOptionPane.showMessageDialog(null,"rollingback");
//           JOptionPane.showMessageDialog(null,e);
//        }
//        
//        String set="set autocommit=1;";
//        try
//        {
//           pst = conn.prepareStatement(set);
//           pst.execute();
//        }
//        catch(Exception e)
//        {
//           JOptionPane.showMessageDialog(null,"autocommit");
//           JOptionPane.showMessageDialog(null,e);
//        }
//        
        mainp.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
//        String roll="rollback;";
//        try
//        {
//           pst = conn.prepareStatement(roll);
//           pst.execute();
//        }
//        catch(Exception e)
//        {
//           JOptionPane.showMessageDialog(null,"rollingback");
//           JOptionPane.showMessageDialog(null,e);
//        }
//        
//        String set="set autocommit=1;";
//        try
//        {
//           pst = conn.prepareStatement(set);
//           pst.execute();
//        }
//        catch(Exception e)
//        {
//           JOptionPane.showMessageDialog(null,"autocommit");
//           JOptionPane.showMessageDialog(null,e);
//        }
//        
        mainp.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancel_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JTextField cardname;
    private javax.swing.JTextField cardno;
    private javax.swing.JPasswordField cvv;
    private com.toedter.calendar.JDateChooser expirydate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pay_button;
    // End of variables declaration//GEN-END:variables
}
