/*
 *i To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabbed;
import Very_Easy.Calculator;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Mizanur Rahman
 */
public class TabTest extends javax.swing.JFrame {

    /**
     * Creates new form TabTest
     */
    public TabTest() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        txtcoun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Country");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(35, 74, 90, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("City");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 134, 80, 30);
        jPanel2.add(txtcity);
        txtcity.setBounds(140, 140, 170, 30);
        jPanel2.add(txtcoun);
        txtcoun.setBounds(140, 80, 170, 30);

        jTree1.setBackground(new java.awt.Color(153, 153, 255));
        jTree1.setForeground(new java.awt.Color(51, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("World");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Bangladesh");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Dhaka");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Chittagong");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Comilla");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("India");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Mumbai");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Delhi");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Joypur");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Japan");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tokyo");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Osaka");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(500, 60, 350, 322);

        jButton1.setText("Add Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(320, 250, 130, 30);

        jButton2.setText("Add Country");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(73, 250, 110, 30);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(160, 330, 120, 30);

        jButton5.setText("Add City");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(200, 250, 110, 30);

        jButton6.setText("Add Database by select");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(290, 330, 170, 30);

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(40, 330, 73, 23);

        jTabbedPane2.addTab("First Tab", jPanel2);
        jTabbedPane2.addTab("tab2", jTabbedPane3);
        jTabbedPane2.addTab("tab3", jTabbedPane4);

        jTabbedPane5.setBackground(new java.awt.Color(102, 102, 255));
        jTabbedPane2.addTab("tab4", jTabbedPane5);
        jTabbedPane2.addTab("tab5", jLabel1);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("School");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Class");
        treeNode1.add(treeNode2);
        jTree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree2);

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton3)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab6", jPanel1);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 0, 1050, 480);

        setSize(new java.awt.Dimension(1066, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    void Mycon(){
         try {
                con=DriverManager.getConnection("jdbc:mysql://localhost/javaproject","root","");
            } catch (SQLException ex) {
                Logger.getLogger(TabTest.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

       addCountry();
    }//GEN-LAST:event_jButton2ActionPerformed

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    void addData(){
        String p="";
       
        try {
           Mycon();
            String m="SELECT  *FROM `school`";
            pst=con.prepareCall(m);
            rs=pst.executeQuery();
            while(rs.next()){
                p=rs.getString(1);
                 DefaultTreeModel dtm=(DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode dmt=( DefaultMutableTreeNode)dtm.getRoot();
        dmt.add(new DefaultMutableTreeNode(p));
      dtm.reload();
            }
           
                
            
        } catch (SQLException ex) {
            Logger.getLogger(TabTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTreeModel dtm=(DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode dtc=(DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        dtm.removeNodeFromParent(dtc);
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p=txtcity.getText();
          DefaultTreeModel dtm=(DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode dtc=(DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode rr=new DefaultMutableTreeNode(p);
        dtm.insertNodeInto(rr, dtc, rr.getChildCount());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         String p=txtcity.getText();
          DefaultTreeModel dtm=(DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode dtc=(DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode rr=new DefaultMutableTreeNode(p);
        dtm.insertNodeInto(rr, dtc, rr.getChildCount());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
          String p="";
       
        try {
           Mycon();
            String m="SELECT  *FROM `school`";
            pst=con.prepareCall(m);
            rs=pst.executeQuery();
            while(rs.next()){
                p=rs.getString(2);
//                rs.gets
                 DefaultTreeModel dtm=(DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode dtc=(DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode rr=new DefaultMutableTreeNode(p);
        dtm.insertNodeInto(rr, dtc, rr.getChildCount());
            }
           
                
            
        } catch (SQLException ex) {
            Logger.getLogger(TabTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new Calculator().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    void addCountry(){
        addData();
    }
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
            java.util.logging.Logger.getLogger(TabTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTree jTree1;
    private javax.swing.JTree jTree2;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcoun;
    // End of variables declaration//GEN-END:variables
}
