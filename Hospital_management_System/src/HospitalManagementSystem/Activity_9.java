/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HospitalManagementSystem;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Adarsh Maurya
 */
public class Activity_9 extends javax.swing.JFrame {
int f=0;
    /**
     * Creates new form Activity_9
     */
    public Activity_9() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_patientage = new javax.swing.JTextField();
        txt_patientaddress = new javax.swing.JTextField();
        txt_patientno = new javax.swing.JTextField();
        txt_patientname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_medicdetails = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        txt_bedno = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        optnotadmit = new javax.swing.JRadioButton();
        optadmit = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txt_remaining = new javax.swing.JTextField();
        txt_debit = new javax.swing.JTextField();
        txt_credit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_patientdoctor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblsearch = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        txtcontacts = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnclear = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        txtyyyy = new javax.swing.JTextField();
        txtdd = new javax.swing.JTextField();
        txtmm = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtadmsndate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Details");
        setMinimumSize(new java.awt.Dimension(1534, 934));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Patient No.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 110, 110, 39);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 360, 80, 39);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Charged Under Doctor");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 410, 210, 39);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 260, 53, 39);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 310, 40, 39);

        txt_patientage.setEditable(false);
        txt_patientage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_patientage.setDragEnabled(true);
        getContentPane().add(txt_patientage);
        txt_patientage.setBounds(500, 310, 90, 39);

        txt_patientaddress.setEditable(false);
        txt_patientaddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_patientaddress.setDragEnabled(true);
        txt_patientaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_patientaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_patientaddress);
        txt_patientaddress.setBounds(500, 360, 425, 39);

        txt_patientno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_patientno);
        txt_patientno.setBounds(500, 110, 161, 39);

        txt_patientname.setEditable(false);
        txt_patientname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_patientname);
        txt_patientname.setBounds(500, 260, 425, 39);

        txtarea_medicdetails.setEditable(false);
        txtarea_medicdetails.setColumns(20);
        txtarea_medicdetails.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtarea_medicdetails.setRows(5);
        jScrollPane1.setViewportView(txtarea_medicdetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1060, 470, 380, 227);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Admission Date");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(1040, 240, 106, 17);

        txt_bedno.setEditable(false);
        txt_bedno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_bedno);
        txt_bedno.setBounds(1170, 300, 100, 43);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Bed no.");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(1040, 310, 53, 17);

        buttonGroup1.add(optnotadmit);
        optnotadmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optnotadmit.setText("Not Admitted");
        optnotadmit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optnotadmitItemStateChanged(evt);
            }
        });
        optnotadmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optnotadmitActionPerformed(evt);
            }
        });
        getContentPane().add(optnotadmit);
        optnotadmit.setBounds(1040, 130, 123, 25);

        buttonGroup1.add(optadmit);
        optadmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optadmit.setText("Admitted");
        optadmit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optadmitItemStateChanged(evt);
            }
        });
        getContentPane().add(optadmit);
        optadmit.setBounds(1040, 100, 93, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 190, 50, 47);

        txt_remaining.setEditable(false);
        txt_remaining.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_remaining.setDragEnabled(true);
        txt_remaining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_remainingActionPerformed(evt);
            }
        });
        getContentPane().add(txt_remaining);
        txt_remaining.setBounds(500, 570, 156, 50);

        txt_debit.setEditable(false);
        txt_debit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_debit.setDragEnabled(true);
        getContentPane().add(txt_debit);
        txt_debit.setBounds(500, 520, 156, 50);

        txt_credit.setEditable(false);
        txt_credit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_credit.setDragEnabled(true);
        getContentPane().add(txt_credit);
        txt_credit.setBounds(500, 460, 156, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Remaining Bal.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 570, 140, 33);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Debit Amount");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 520, 130, 32);

        txt_patientdoctor.setEditable(false);
        txt_patientdoctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_patientdoctor.setDragEnabled(true);
        getContentPane().add(txt_patientdoctor);
        txt_patientdoctor.setBounds(500, 410, 305, 39);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Credit Amount");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 470, 130, 32);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        lblsearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsearch.setText("Enter Patient No. and Date of Registration");

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

        btnedit.setBackground(new java.awt.Color(0, 0, 0));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setText("Edit");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnback)
                .addGap(312, 312, 312)
                .addComponent(lblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(btnedit)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1586, 88);

        txtcontacts.setEditable(false);
        txtcontacts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtcontacts);
        txtcontacts.setBounds(500, 630, 248, 43);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Contact Details");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 630, 140, 43);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(0, 0, 0));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnclearStateChanged(evt);
            }
        });
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(0, 0, 0));
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
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

        btnsave.setVisible(false);
        btnsave.setBackground(new java.awt.Color(0, 0, 0));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText(" Save");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(533, 533, 533)
                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnsave)
                .addGap(69, 69, 69)
                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(647, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 720, 1590, 110);

        txtyyyy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtyyyy);
        txtyyyy.setBounds(620, 210, 90, 30);

        txtdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtdd);
        txtdd.setBounds(500, 210, 50, 30);

        txtmm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtmm);
        txtmm.setBounds(560, 210, 50, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("MM");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(560, 170, 40, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("YYYY");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(620, 170, 80, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("DD");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(500, 170, 40, 30);

        txtadmsndate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtadmsndate.setEnabled(false);
        getContentPane().add(txtadmsndate);
        txtadmsndate.setBounds(1170, 230, 150, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_patientaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patientaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patientaddressActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
       
        
         txt_patientno.setText("");
         txt_patientname.setText("");
          txt_patientaddress.setText("");
           txt_patientdoctor.setText("");
            txtadmsndate.setText("");
             txt_credit.setText("");
              txt_debit.setText("");
               txt_remaining.setText("");
                txtmm.setText("");
                txtdd.setText("");
                txtyyyy.setText("");
                txt_patientage.setText("");
                txt_bedno.setText("");
                 txtarea_medicdetails.setText("");
                 txtcontacts.setText("");
                optadmit.setSelected(false);
                optnotadmit.setSelected(false);
        btnsave.setVisible(false);
    }//GEN-LAST:event_btnclearActionPerformed

    private void optnotadmitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optnotadmitItemStateChanged
        // TODO add your handling code here:
        txtadmsndate.setEnabled(false);
        txt_bedno.setEnabled(false);
    }//GEN-LAST:event_optnotadmitItemStateChanged

    private void optadmitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optadmitItemStateChanged
        // TODO add your handling code here:
        txtadmsndate.setEnabled(true);
        txt_bedno.setEnabled(true);
    }//GEN-LAST:event_optadmitItemStateChanged

    private void optnotadmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optnotadmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optnotadmitActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
          
        int mm,dd,yyyy;String date="";int pno=0;
      
                 pno=Integer.parseInt(txt_patientno.getText());
        if(pno<=0)
            JOptionPane.showMessageDialog(null,"please enter the correct Patient no");
        
          mm=Integer.parseInt(txtmm.getText());
        dd=Integer.parseInt(txtdd.getText());
        yyyy=Integer.parseInt(txtyyyy.getText());
        
              date=yyyy+"-"+mm+"-"+dd;
              while(true){
        if(dd<=0||mm<=0||yyyy<=0||dd>31||mm>12||yyyy>9999){
            JOptionPane.showMessageDialog(null,"Incorrect date");
        txtdd.setText("");
     txtmm.setText("");
     txtyyyy.setText("");
     break;}
        else
            break;
        }
        establishconnection ob=new establishconnection();
        String code="select * from patient where patientno="+Integer.parseInt(txt_patientno.getText())+";";
        ob.execute(code);
        try{
        while(ob.rs.next()){
            txt_patientno.setText(""+ob.rs.getInt("patientno"));
            txt_patientname.setText(""+ob.rs.getString("name"));
            txt_patientage.setText(""+ob.rs.getInt("age"));
           txt_patientaddress.setText(""+ob.rs.getString("address"));
           txt_patientdoctor.setText(""+ob.rs.getString("doctor"));
           txt_credit.setText(""+ob.rs.getDouble("credit"));
           txt_debit.setText(""+ob.rs.getDouble("debit"));
           txt_remaining.setText(""+ob.rs.getDouble("remaining"));
           if(ob.rs.getString("admitted").equals("N")){
              optnotadmit.setSelected(true);
           }
           else
           {
               optadmit.setSelected(true);
               txtadmsndate.setText(""+ob.rs.getDate("admsndate"));
               txt_bedno.setText(""+ob.rs.getString("bedno"));
           }
           txtcontacts.setText(""+ob.rs.getString("contacts"));
           txtarea_medicdetails.setText(""+ob.rs.getString("medicdetails"));
        }}catch(Exception e){
                
                }
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
          new Activity_4().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        
        btnsave.setVisible(true);
         txt_patientno.setEditable(true);
         txt_patientname.setEditable(true);
          txt_patientaddress.setEditable(true);
           txt_patientdoctor.setEditable(true);
            txtadmsndate.setEditable(true);
             txt_credit.setEditable(true);
              txt_debit.setEditable(true);
               txt_remaining.setEditable(true);
                
                txt_patientage.setEditable(true);
                txt_bedno.setEditable(true);
                 txtarea_medicdetails.setEditable(true);
                 txtcontacts.setEditable(true);
                 
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
         String code="";int count=0;double credit=0,debit=0;
         int mm,dd,yyyy;String date="";int pno=0;
      
                 pno=Integer.parseInt(txt_patientno.getText());
        if(pno<=0)
            JOptionPane.showMessageDialog(null,"please enter the correct Patient no");
        
          mm=Integer.parseInt(txtmm.getText());
        dd=Integer.parseInt(txtdd.getText());
        yyyy=Integer.parseInt(txtyyyy.getText());
        
              date=yyyy+"-"+mm+"-"+dd;
              while(true){
        if(dd<=0||mm<=0||yyyy<=0||dd>31||mm>12||yyyy>9999){
            JOptionPane.showMessageDialog(null,"Incorrect date");
        txtdd.setText("");
     txtmm.setText("");
     txtyyyy.setText("");
     break;}
        else
            break;
        }
         if(!txt_credit.getText().equals(""))
             credit=Double.parseDouble(txt_credit.getText());
         if(!txt_debit.getText().equals(""))
             debit=Double.parseDouble(txt_debit.getText());
         double remaining=credit-debit;
        establishconnection ob=new establishconnection();
       if(txt_patientno.getText().equals("")||txt_patientname.getText().equals("")||txt_patientage.getText().equals("")||txt_patientaddress.getText().equals("")||txt_patientdoctor.getText().equals(""))
            JOptionPane.showMessageDialog(null,"please enter the details");
        if(optadmit.isSelected()==true)
       code="Update patient set patientno="+Integer.parseInt(txt_patientno.getText())+",name='"+txt_patientname.getText()+"',age="+Integer.parseInt(txt_patientage.getText())+",address='"+txt_patientaddress.getText()+"',doctor='"+txt_patientdoctor.getText()+"',checkup='"+date+"',credit="+credit+",debit="+debit+",remaining="+remaining+",admitted='Y',admsndate='"+txtadmsndate.getText()+"',bedno='"+txt_bedno.getText()+"',contacts='"+txtcontacts.getText()+"',medicdetails='"+txtarea_medicdetails.getText()+"' where patientno="+Integer.parseInt(txt_patientno.getText())+"&& checkup='"+date+"';";
        else if(optnotadmit.isSelected()==true)
            code="Update patient set patientno="+Integer.parseInt(txt_patientno.getText())+",name='"+txt_patientname.getText()+"',age="+Integer.parseInt(txt_patientage.getText())+",address='"+txt_patientaddress.getText()+"',doctor='"+txt_patientdoctor.getText()+"',checkup='"+date+"',credit="+credit+",debit="+debit+",remaining="+remaining+",admitted='N',admsndate=null,bedno=null,contacts='"+txtcontacts.getText()+"',medicdetails='"+txtarea_medicdetails.getText()+"'where patientno="+Integer.parseInt(txt_patientno.getText())+"&& checkup='"+date+"';";
       System.out.println(code);
        int flag=ob.update(code);
        
        if(flag==1){
            JOptionPane.showMessageDialog(null,"Edited successfully");
         }
        else if(flag==0)
                JOptionPane.showMessageDialog(null,"Editing failed");
       
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txt_remainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_remainingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_remainingActionPerformed

    private void btnbackStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnbackStateChanged
        // TODO add your handling code here:
          // TODO add your handling code here:
        btnclear.setBackground(Color.black);
        btnclear.setForeground(Color.white);
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
         btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
         btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnback.setBackground(Color.white);
        btnback.setForeground(Color.black);
    }//GEN-LAST:event_btnbackStateChanged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
         btnclear.setBackground(Color.black);
        btnclear.setForeground(Color.white);
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
         btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
         btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void btneditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btneditStateChanged
        // TODO add your handling code here:
         btnclear.setBackground(Color.black);
        btnclear.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
         btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
         btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnedit.setBackground(Color.white);
        btnedit.setForeground(Color.black);
    }//GEN-LAST:event_btneditStateChanged

    private void btnclearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnclearStateChanged
        // TODO add your handling code here:
          btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
         btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
         btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnclear.setBackground(Color.white);
        btnclear.setForeground(Color.black);
    }//GEN-LAST:event_btnclearStateChanged

    private void btnsaveStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnsaveStateChanged
        // TODO add your handling code here:
           btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
         btnclear.setBackground(Color.black);
        btnclear.setForeground(Color.white);
         btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnsave.setBackground(Color.white);
        btnsave.setForeground(Color.black);
    }//GEN-LAST:event_btnsaveStateChanged

    private void btnsearchStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnsearchStateChanged
        // TODO add your handling code here:
            btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
         btnclear.setBackground(Color.black);
        btnclear.setForeground(Color.white);
         btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
        btnsearch.setBackground(Color.white);
        btnsearch.setForeground(Color.black);
    }//GEN-LAST:event_btnsearchStateChanged

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        // TODO add your handling code here:
         btnclear.setBackground(Color.black);
        btnclear.setForeground(Color.white);
        btnedit.setBackground(Color.black);
        btnedit.setForeground(Color.white);
         btnsave.setBackground(Color.black);
        btnsave.setForeground(Color.white);
         btnsearch.setBackground(Color.black);
        btnsearch.setForeground(Color.white);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
    }//GEN-LAST:event_jPanel2MouseMoved

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
            java.util.logging.Logger.getLogger(Activity_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activity_9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JRadioButton optadmit;
    private javax.swing.JRadioButton optnotadmit;
    private javax.swing.JTextField txt_bedno;
    private javax.swing.JTextField txt_credit;
    private javax.swing.JTextField txt_debit;
    private javax.swing.JTextField txt_patientaddress;
    private javax.swing.JTextField txt_patientage;
    private javax.swing.JTextField txt_patientdoctor;
    private javax.swing.JTextField txt_patientname;
    private javax.swing.JTextField txt_patientno;
    private javax.swing.JTextField txt_remaining;
    private javax.swing.JTextField txtadmsndate;
    private javax.swing.JTextArea txtarea_medicdetails;
    private javax.swing.JTextField txtcontacts;
    private javax.swing.JTextField txtdd;
    private javax.swing.JTextField txtmm;
    private javax.swing.JTextField txtyyyy;
    // End of variables declaration//GEN-END:variables
}
