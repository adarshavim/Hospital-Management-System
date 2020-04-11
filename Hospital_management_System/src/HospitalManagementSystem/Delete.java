/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HospitalManagementSystem;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Adarsh Maurya
 */
public class Delete extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    public Delete() {
        initComponents();
        getContentPane().setBackground(new Color(153,153,255));
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
        btnback = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnemp = new javax.swing.JButton();
        lblp = new javax.swing.JLabel();
        lble = new javax.swing.JLabel();
        txtpatientno = new javax.swing.JTextField();
        txtemp = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        txtyyyy = new javax.swing.JTextField();
        txtdd = new javax.swing.JTextField();
        txtmm = new javax.swing.JTextField();
        lblmm = new javax.swing.JLabel();
        lblyyyy = new javax.swing.JLabel();
        lbldd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Delete Details");

        btnback.setBackground(new java.awt.Color(0, 0, 0));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnbackStateChanged(evt);
            }
        });
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnback)
                .addGap(454, 454, 454)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(731, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnback)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnemp.setBackground(new java.awt.Color(0, 0, 0));
        btnemp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnemp.setForeground(new java.awt.Color(255, 255, 255));
        btnemp.setText("Employee");
        btnemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempActionPerformed(evt);
            }
        });

        lblp.setVisible(false);
        lblp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblp.setText("Enter the patient no");

        lble.setVisible(false);
        lble.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lble.setText("Enter the Employee");

        txtpatientno.setVisible(false);
        txtpatientno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtemp.setVisible(false);
        txtemp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setVisible(false);
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btndel.setBackground(new java.awt.Color(0, 0, 0));
        btndel.setVisible(false);
        btndel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 255, 255));
        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        lbldate.setVisible(false);
        lbldate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldate.setText("Date");

        txtyyyy.setVisible(false);
        txtyyyy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtdd.setVisible(false);
        txtdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtmm.setVisible(false);
        txtmm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblmm.setVisible(false);
        lblmm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmm.setText("MM");

        lblyyyy.setVisible(false);
        lblyyyy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblyyyy.setText("YYYY");

        lbldd.setVisible(false);
        lbldd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldd.setText("DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnemp, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtemp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtpatientno, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndelete)
                        .addGap(275, 275, 275))
                    .addComponent(btndel)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpatientno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndelete))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbldd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblmm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtmm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnemp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lble, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtemp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndel)))
                .addGap(0, 383, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnbackStateChanged
        // TODO add your handling code here:
        btnback.setBackground(Color.white);
        btnback.setForeground(Color.black);
    }//GEN-LAST:event_btnbackStateChanged

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        new Activity_4().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lbldate.setVisible(true);
        lbldd.setVisible(true);
        lblmm.setVisible(true);
        lblyyyy.setVisible(true);
        txtdd.setVisible(true);
        txtmm.setVisible(true);
        txtyyyy.setVisible(true);
        btndelete.setVisible(true);
        txtpatientno.setVisible(true);
       lblp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempActionPerformed
        // TODO add your handling code here:
        btndel.setVisible(true);
        txtemp.setVisible(true);
         lble.setVisible(true);
    }//GEN-LAST:event_btnempActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
      int mm=0,dd=0,yyyy=0;String date="";int flag=0;
        if(!txtmm.getText().equals(""))
          mm=Integer.parseInt(txtmm.getText());
        if(!txtdd.getText().equals(""))
        dd=Integer.parseInt(txtdd.getText());
        if(!txtyyyy.getText().equals(""))
        yyyy=Integer.parseInt(txtyyyy.getText());
        
              date=yyyy+"-"+mm+"-"+dd;
              while(true){
        if(dd<=0||mm<=0||yyyy<=0||dd>31||mm>12||yyyy>9999){
            JOptionPane.showMessageDialog(null,"Incorrect date");
        txtdd.setText("");
     txtmm.setText("");
     txtyyyy.setText("");
     break;}
        else{
         establishconnection ob=new establishconnection();
           String code="Delete from patient where patientno="+Integer.parseInt(txtpatientno.getText())+"&& checkup='"+date+"';";
           System.out.print(code);
          flag=ob.update(code);
          if(flag==1){
            JOptionPane.showMessageDialog(null,"Deleted successfully");
            txtpatientno.setText("");
            txtmm.setText("");
                txtdd.setText("");
                txtyyyy.setText("");
         }
          else
              JOptionPane.showMessageDialog(null,"Deletion failed");
        }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
         establishconnection ob=new establishconnection();
           String code="Delete  from employee where employeeID="+Integer.parseInt(txtemp.getText())+";";
          int flag= ob.update(code);
          if(flag==1){
            JOptionPane.showMessageDialog(null,"Deleted successfully");
            txtpatientno.setText("");
         }
          else
              JOptionPane.showMessageDialog(null,"Deletion failed");
    }//GEN-LAST:event_btndelActionPerformed

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnemp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldd;
    private javax.swing.JLabel lble;
    private javax.swing.JLabel lblmm;
    private javax.swing.JLabel lblp;
    private javax.swing.JLabel lblyyyy;
    private javax.swing.JTextField txtdd;
    private javax.swing.JTextField txtemp;
    private javax.swing.JTextField txtmm;
    private javax.swing.JTextField txtpatientno;
    private javax.swing.JTextField txtyyyy;
    // End of variables declaration//GEN-END:variables
}
