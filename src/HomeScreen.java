/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rushikeshgadewar
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HomeScreen extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement ps;
    
    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
        this.setPreferredSize(new Dimension(1500, 1500));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Label_Logo_HS = new javax.swing.JLabel();
        Button_Emp_Login_HS = new javax.swing.JButton();
        Label_Emp_Login_HS = new javax.swing.JLabel();
        Button_Admin_Login_HS = new javax.swing.JButton();
        Label_Admin_Login_HS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        Label_Logo_HS.setFont(new java.awt.Font("Zapfino", 1, 36)); // NOI18N
        Label_Logo_HS.setText(" GRAND HYATT");

        Button_Emp_Login_HS.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Emp_Login_HS.setText("LOGIN");
        Button_Emp_Login_HS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Emp_Login_HSActionPerformed(evt);
            }
        });

        Label_Emp_Login_HS.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_Emp_Login_HS.setText("EMPLOYEE LOGIN");

        Button_Admin_Login_HS.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Admin_Login_HS.setText("LOGIN");
        Button_Admin_Login_HS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Admin_Login_HSActionPerformed(evt);
            }
        });

        Label_Admin_Login_HS.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_Admin_Login_HS.setText("ADMIN LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_Emp_Login_HS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_Admin_Login_HS))
                    .addComponent(Label_Logo_HS, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(Button_Emp_Login_HS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Admin_Login_HS)
                .addGap(265, 265, 265))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Label_Logo_HS)
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Emp_Login_HS)
                    .addComponent(Label_Admin_Login_HS))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Admin_Login_HS)
                    .addComponent(Button_Emp_Login_HS))
                .addContainerGap(636, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 110, 960, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Admin_Login_HSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Admin_Login_HSActionPerformed

        Admin ad = new Admin();
            ad.setVisible(true);
            ad.setLocationRelativeTo(null);
            this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Admin_Login_HSActionPerformed

    private void Button_Emp_Login_HSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Emp_Login_HSActionPerformed

        EmployeeLogin el = new EmployeeLogin();
            el.setVisible(true);
            el.setLocationRelativeTo(null);
            this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Emp_Login_HSActionPerformed

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Admin_Login_HS;
    private javax.swing.JButton Button_Emp_Login_HS;
    private javax.swing.JLabel Label_Admin_Login_HS;
    private javax.swing.JLabel Label_Emp_Login_HS;
    private javax.swing.JLabel Label_Logo_HS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
