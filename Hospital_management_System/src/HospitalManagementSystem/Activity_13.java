/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HospitalManagementSystem;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Adarsh Maurya
 */
public class Activity_13 extends javax.swing.JFrame {
String path="";
    /**
     * Creates new form Activity_13
     */
    public Activity_13() {
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

        checkwed = new javax.swing.JCheckBox();
        checkmon = new javax.swing.JCheckBox();
        txt_salary = new javax.swing.JTextField();
        txt_dateofjoining = new javax.swing.JTextField();
        checksun = new javax.swing.JCheckBox();
        txtcontacts = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkfri = new javax.swing.JCheckBox();
        checkthu = new javax.swing.JCheckBox();
        checksat = new javax.swing.JCheckBox();
        checktue = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        fc = new javax.swing.JFileChooser();
        jLabel3 = new javax.swing.JLabel();
        txt_empID = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkwed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkwed.setText("Wednesday");
        checkwed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkwedActionPerformed(evt);
            }
        });
        getContentPane().add(checkwed, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 445, -1, -1));

        checkmon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkmon.setText("Monday");
        getContentPane().add(checkmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 445, -1, -1));

        txt_salary.setEditable(false);
        txt_salary.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 494, 189, 37));

        txt_dateofjoining.setEditable(false);
        txt_dateofjoining.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_dateofjoining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateofjoiningActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dateofjoining, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 383, 161, 37));

        checksun.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checksun.setText("Sunday");
        getContentPane().add(checksun, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 445, -1, -1));

        txtcontacts.setEditable(false);
        txtcontacts.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtcontacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactsActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 562, 304, 37));

        txt_name.setEditable(false);
        txt_name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 228, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 127, 37));

        lblimage.setText("img");
        lblimage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 170, 190, 230));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Date of joining");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 382, 157, 37));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 311, 127, 37));

        txt_address.setEditable(false);
        txt_address.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 307, 343, 37));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Contacts");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 561, 127, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 508, 127, 37));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Weekend dates");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 453, -1, 37));

        checkfri.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkfri.setText("Friday");
        getContentPane().add(checkfri, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 445, -1, -1));

        checkthu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkthu.setText("Thursday");
        getContentPane().add(checkthu, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 445, -1, -1));

        checksat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checksat.setText("Saturday");
        getContentPane().add(checksat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1095, 445, -1, -1));

        checktue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checktue.setText("Tuesday");
        getContentPane().add(checktue, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 445, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Gaurds Details");

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

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Search Details");
        jButton7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton7StateChanged(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(0, 0, 0));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setText("Edit Details");
        btnedit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btneditStateChanged(evt);
            }
        });
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add details");
        jButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton1StateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnback)
                .addGap(446, 446, 446)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(35, 35, 35)
                .addComponent(btnedit)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(btnedit)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1594, -1));

        jButton2.setVisible(false);
        jButton2.setText("uploadimage");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1334, 450, -1, -1));

        jInternalFrame1.setVisible(false);

        jScrollPane1.setViewportView(fc);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 606, -1, 328));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("EmployeeID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 120, 30));
        getContentPane().add(txt_empID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 110, 40));

        btnsave.setVisible(false);
        btnsave.setBackground(new java.awt.Color(0, 0, 0));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnsaveStateChanged(evt);
            }
        });
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 730, 100, 50));

        btnsearch.setBackground(new java.awt.Color(0, 0, 0));
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnsearchStateChanged(evt);
            }
        });
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 730, 110, 50));

        btnadd.setVisible(false);
        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnaddStateChanged(evt);
            }
        });
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 730, 100, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void clear(){
         checksun.setSelected(false);
              checkmon.setSelected(false);
              checktue.setSelected(false);
              checkwed.setSelected(false);
              checkthu.setSelected(false);
              checkfri.setSelected(false);
              checksat.setSelected(false);
                txt_name.setText("");
         txt_address.setText("");
          
           txt_salary.setText("");
            txt_dateofjoining.setText("");
            txtcontacts.setText("");
            path="";
}
    private void checkwedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkwedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkwedActionPerformed

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void txt_dateofjoiningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateofjoiningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateofjoiningActionPerformed

    private void txtcontactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactsActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       FileNameExtensionFilter filter= new FileNameExtensionFilter("JPEG file and PNG file","jpg","jpeg","png");
      fc.setFileFilter(filter);
      int response=fc.showOpenDialog(jInternalFrame1);
      if(response==fc.APPROVE_OPTION){
          path=fc.getSelectedFile().toString();
           ImageIcon img=new ImageIcon(path);
                  lblimage.setIcon(img);
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnbackStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnbackStateChanged
        // TODO add your handling code here:
        btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
        btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnback.setBackground(Color.white);
        btnback.setForeground(Color.black);
    }//GEN-LAST:event_btnbackStateChanged

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        new Activity_4().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void jButton7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton7StateChanged
        // TODO add your handling code here:
        btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
        btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
        jButton1.setBackground(Color.black);
        jButton1.setForeground(Color.white);
        jButton7.setBackground(Color.white);
        jButton7.setForeground(Color.black);
    }//GEN-LAST:event_jButton7StateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        clear();
        txt_name.setEditable(false);
        txt_address.setEditable(false);
        
        txt_salary.setEditable(false);
        txt_dateofjoining.setEditable(false);
        txtcontacts.setEditable(false);
        txt_empID.setEditable(true);
        jButton2.setVisible(false);
        btnadd.setVisible(false);
        btnsave.setVisible(false);
        btnsearch.setVisible(true);
        txt_empID.setText("");
        ImageIcon img=new ImageIcon("");
        lblimage.setIcon(img);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btneditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btneditStateChanged
        // TODO add your handling code here:
        btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
        btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
        btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnedit.setBackground(Color.white);
        btnedit.setForeground(Color.black);
    }//GEN-LAST:event_btneditStateChanged

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        jButton2.setVisible(true);
        btnsave.setVisible(true);
        txt_name.setEditable(true);
        txt_address.setEditable(true);
        
        txt_salary.setEditable(true);
        txt_dateofjoining.setEditable(true);
        txtcontacts.setEditable(true);
        txt_empID.setEditable(false);
    }//GEN-LAST:event_btneditActionPerformed

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton1StateChanged
        // TODO add your handling code here:
        btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
        btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
        jButton7.setBackground(Color.black);
        jButton7.setForeground(Color.white);
        jButton1.setBackground(Color.white);
        jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
        txt_empID.setEditable(true);
        txt_name.setEditable(true);
        txt_address.setEditable(true);
        
        txt_salary.setEditable(true);
        txt_dateofjoining.setEditable(true);
        txtcontacts.setEditable(true);
        jButton2.setVisible(true);
        btnadd.setVisible(true);
        btnsave.setVisible(false);
        btnsearch.setVisible(false);
        txt_empID.setText("");
        ImageIcon img=new ImageIcon("");
        lblimage.setIcon(img);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsaveStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnsaveStateChanged
        // TODO add your handling code here:
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
        btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnsave.setBackground(Color.white);
        btnsave.setForeground(Color.black);
    }//GEN-LAST:event_btnsaveStateChanged

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String code="",code1="",checkcode="";String sun="A",mon="A",tue="A",wed="A",thu="A",fri="A",sat="A";
        establishconnection ob=new establishconnection();
        checkcode= "select employeeID from employee;";
        if(txt_empID.getText().equals("")||txt_name.getText().equals("")||txt_address.getText().equals(""))
        JOptionPane.showMessageDialog(null,"please enter the details");
        if(checksun.isSelected()==true)
        sun="P";
        if(checkmon.isSelected()==true)
        mon="P";
        if(checktue.isSelected()==true)
        tue="P";
        if(checkwed.isSelected()==true)
        wed="P";
        if(checkthu.isSelected()==true)
        thu="P";
        if(checkfri.isSelected()==true)
        fri="P";
        if(checksat.isSelected()==true)
        sat="P";
        code1="delete from employee where employeeID='"+txt_empID.getText()+"';";
        code="insert into employee values('"+(txt_empID.getText())+"','"+txt_name.getText()+"','gaurding','"+txt_address.getText()+"','"+txt_dateofjoining.getText()+"','"+sun+"','"+mon+"','"+tue+"','"+wed+"','"+thu+"','"+fri+"','"+sat+"','"+txt_salary.getText()+"','"+txtcontacts.getText()+"','"+path+"','Gaurd');";
        System.out.println(code);
        int flag2=ob.update(code1);
        if(flag2==1){
            int flag=ob.update(code);
            if(flag==1){
                JOptionPane.showMessageDialog(null,"Edited successfully");
                clear();
            }
            else if(flag==0||flag2==0)
            JOptionPane.showMessageDialog(null,"process failed");
        }
        else
        JOptionPane.showMessageDialog(null,"Error");
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnsearchStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnsearchStateChanged
        // TODO add your handling code here:
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
        btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
        btnsearch.setBackground(Color.white);
        btnsearch.setForeground(Color.black);
    }//GEN-LAST:event_btnsearchStateChanged

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        clear();
        String code="";String designation="";
        establishconnection ob =new establishconnection();
        if(!(txt_empID.getText().equals(""))){
            code="select * from employee where designation='Gaurd' && employeeID='"+txt_empID.getText()+"';";
            System.out.println(code);
            ob.execute(code);
            try{
                while(ob.rs.next()){
                    txt_empID.setText(ob.rs.getString("employeeID"));
                    txt_name.setText(ob.rs.getString("Name"));
                   
                    txt_address.setText(ob.rs.getString("address"));
                    txt_dateofjoining.setText(""+ob.rs.getString("dateofjoin"));
                    if(ob.rs.getString("sunday").equals("P"))
                    checksun.setSelected(true);
                    if(ob.rs.getString("monday").equals("P"))
                    checkmon.setSelected(true);
                    if(ob.rs.getString("Tuesday").equals("P"))
                    checktue.setSelected(true);
                    if(ob.rs.getString("Wednesday").equals("P"))
                    checkwed.setSelected(true);
                    if(ob.rs.getString("Thursday").equals("P"))
                    checkthu.setSelected(true);
                    if(ob.rs.getString("friday").equals("P"))
                    checkfri.setSelected(true);
                    if(ob.rs.getString("Saturday").equals("P"))
                    checksat.setSelected(true);
                    txt_salary.setText(""+ob.rs.getString("salary"));
                    txtcontacts.setText(""+ob.rs.getString("contacts"));
                    ImageIcon img=new ImageIcon(ob.rs.getString("img"));
                    lblimage.setIcon(img);
                    designation=ob.rs.getString("designation");
                }
                if(txt_address.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Not available");
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnaddStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnaddStateChanged
        // TODO add your handling code here:
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
        btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
        btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnadd.setBackground(Color.white);
        btnadd.setForeground(Color.black);
    }//GEN-LAST:event_btnaddStateChanged

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:

        String code="",checkcode="";String sun="A",mon="A",tue="A",wed="A",thu="A",fri="A",sat="A";
        establishconnection ob=new establishconnection();
        checkcode= "select employeeID from employee;";
        try{
            ob.execute(checkcode);
            while(ob.rs.next()){
                if(txt_empID.getText().equalsIgnoreCase(ob.rs.getString("employeeID")))
                JOptionPane.showMessageDialog(null,"EmpID already in use");
            }}
            catch(Exception e){

            }
            if(txt_empID.getText().equals("")||txt_name.getText().equals("")||txt_address.getText().equals(""))
            JOptionPane.showMessageDialog(null,"please enter the details");
            if(checksun.isSelected()==true)
            sun="P";
            if(checkmon.isSelected()==true)
            mon="P";
            if(checktue.isSelected()==true)
            tue="P";
            if(checkwed.isSelected()==true)
            wed="P";
            if(checkthu.isSelected()==true)
            thu="P";
            if(checkfri.isSelected()==true)
            fri="P";
            if(checksat.isSelected()==true)
            sat="P";
            code="insert into employee values('"+(txt_empID.getText())+"','"+txt_name.getText()+"','gaurding','"+txt_address.getText()+"','"+txt_dateofjoining.getText()+"','"+sun+"','"+mon+"','"+tue+"','"+wed+"','"+thu+"','"+fri+"','"+sat+"','"+txt_salary.getText()+"','"+txtcontacts.getText()+"','"+path+"','gaurd');";
            System.out.println(code);
            int flag=ob.update(code);

            if(flag==1){
                JOptionPane.showMessageDialog(null,"added successfully");
                clear();
                txt_empID.setText("");
            }
            else if(flag==0)
            JOptionPane.showMessageDialog(null,"process failed");
    }//GEN-LAST:event_btnaddActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
         btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
         btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
         btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
          jButton7.setBackground(Color.black);
       jButton7.setForeground(Color.white);
        jButton1.setBackground(Color.black);
       jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
         btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
         btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
         btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
          jButton7.setBackground(Color.black);
       jButton7.setForeground(Color.white);
        jButton1.setBackground(Color.black);
       jButton1.setForeground(Color.white);
    }//GEN-LAST:event_formMouseMoved

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
            java.util.logging.Logger.getLogger(Activity_13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity_13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity_13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity_13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activity_13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JCheckBox checkfri;
    private javax.swing.JCheckBox checkmon;
    private javax.swing.JCheckBox checksat;
    private javax.swing.JCheckBox checksun;
    private javax.swing.JCheckBox checkthu;
    private javax.swing.JCheckBox checktue;
    private javax.swing.JCheckBox checkwed;
    private javax.swing.JFileChooser fc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_dateofjoining;
    private javax.swing.JTextField txt_empID;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txtcontacts;
    // End of variables declaration//GEN-END:variables
}