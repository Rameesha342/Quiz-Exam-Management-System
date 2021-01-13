import java.sql.*;
import javax.swing.*;
import Project.Connect;
import java.util.ArrayList;


public class QuizForm extends javax.swing.JFrame {
int w;
     public void answerset()
     {
         int a1=0,a2=0,a3=0,a4=0,a5=0;
         if(R_1.isSelected())
            a1++;
            if(R_5.isSelected())
            a2++ ;
            if(R_11.isSelected())
            a3++ ;
            if(R_14.isSelected())
            a4++ ;
            if(R_18.isSelected())
            a5++ ;
            
             w=a1+a2+a3+a4+a5;
             
     }
     public void submit()
     {
         String name=Txt_Name.getText();
         answerset();
         try
         {
             Connection con=Connect.getcon();
            Statement st=con.createStatement();
            st.executeUpdate("update log_tbl set Marks='"+w+"' where UserName='"+name+"'");
            String marks1=String.valueOf(w);
            //setVisible(false);
            JOptionPane.showMessageDialog(null,"You Get marks "+ marks1);
            //new submit(marks1).setVisible(true);
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     }

    

    public QuizForm() {
        initComponents();
   
     ButtonGroup();
    }
    private void  ButtonGroup()
{
    ButtonGroup q1=new ButtonGroup();
    q1.add(R_1);
     q1.add(R_2);
     q1.add(R_3);
       q1.add(R_4);
       ButtonGroup q2=new ButtonGroup();
   q2.add(R_5);
     q2.add(R_6);
      q2.add(R_7);
       q2.add(R_8);
       ButtonGroup q3=new ButtonGroup();
   q3.add(R_9);
     q3.add(R_10);
      q3.add(R_11);
       q3.add(R_12);
       ButtonGroup q4=new ButtonGroup();
   q4.add(R_13);
     q4.add(R_14);
      q4.add(R_15);
       q4.add(R_16);
       ButtonGroup q5=new ButtonGroup();
   q5.add(R_17);
     q5.add(R_18);
      q5.add(R_19);
       q5.add(R_20);
       
}
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        L_Count4 = new javax.swing.JLabel();
        Btn_Close2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        L_Question = new javax.swing.JLabel();
        Btn_Submit = new javax.swing.JButton();
        L_Count = new javax.swing.JLabel();
        R_1 = new javax.swing.JRadioButton();
        R_2 = new javax.swing.JRadioButton();
        R_3 = new javax.swing.JRadioButton();
        R_4 = new javax.swing.JRadioButton();
        L_Q = new javax.swing.JLabel();
        Btn_Close3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Crs_CB = new javax.swing.JComboBox<>();
        L_Question1 = new javax.swing.JLabel();
        R_5 = new javax.swing.JRadioButton();
        R_6 = new javax.swing.JRadioButton();
        R_7 = new javax.swing.JRadioButton();
        R_8 = new javax.swing.JRadioButton();
        L_Question2 = new javax.swing.JLabel();
        R_9 = new javax.swing.JRadioButton();
        R_10 = new javax.swing.JRadioButton();
        R_11 = new javax.swing.JRadioButton();
        R_12 = new javax.swing.JRadioButton();
        L_Question3 = new javax.swing.JLabel();
        R_13 = new javax.swing.JRadioButton();
        R_14 = new javax.swing.JRadioButton();
        R_15 = new javax.swing.JRadioButton();
        R_16 = new javax.swing.JRadioButton();
        L_Question4 = new javax.swing.JLabel();
        R_17 = new javax.swing.JRadioButton();
        R_18 = new javax.swing.JRadioButton();
        R_19 = new javax.swing.JRadioButton();
        R_20 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        L_Count1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        L_Count2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        L_Count3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        L_Count5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Txt_Name = new javax.swing.JTextField();

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel7.setText("Question ID:");

        L_Count4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_Count4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Count4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_Close2.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        Btn_Close2.setForeground(new java.awt.Color(204, 0, 0));
        Btn_Close2.setText("CLOSE");
        Btn_Close2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Close2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel2.setText("Question ID:");

        L_Question.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        L_Question.setText("Question:");

        Btn_Submit.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        Btn_Submit.setForeground(new java.awt.Color(0, 102, 102));
        Btn_Submit.setText("Submit");
        Btn_Submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SubmitActionPerformed(evt);
            }
        });

        L_Count.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        L_Count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Count.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        R_1.setText("jRadioButton1");

        R_2.setText("jRadioButton2");

        R_3.setText("jRadioButton3");

        R_4.setText("jRadioButton4");

        L_Q.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        L_Q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Q.setText("05");

        Btn_Close3.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        Btn_Close3.setForeground(new java.awt.Color(204, 0, 0));
        Btn_Close3.setText("Click here to Start Quiz");
        Btn_Close3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Close3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Close3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Total Question");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Select Course Name");

        Crs_CB.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Crs_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Science ", "English", "Maths" }));
        Crs_CB.setSelectedIndex(-1);
        Crs_CB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 255, 255), null, null));

        L_Question1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        L_Question1.setText("Question:");

        R_5.setText("jRadioButton1");

        R_6.setText("jRadioButton2");

        R_7.setText("jRadioButton3");

        R_8.setText("jRadioButton4");

        L_Question2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        L_Question2.setText("Question:");

        R_9.setText("jRadioButton1");

        R_10.setText("jRadioButton2");

        R_11.setText("jRadioButton3");

        R_12.setText("jRadioButton4");

        L_Question3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        L_Question3.setText("Question:");

        R_13.setText("jRadioButton1");

        R_14.setText("jRadioButton2");

        R_15.setText("jRadioButton3");

        R_16.setText("jRadioButton4");

        L_Question4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        L_Question4.setText("Question:");

        R_17.setText("jRadioButton1");

        R_18.setText("jRadioButton2");

        R_19.setText("jRadioButton3");

        R_20.setText("jRadioButton4");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel4.setText("Question ID:");

        L_Count1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        L_Count1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Count1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel5.setText("Question ID:");

        L_Count2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        L_Count2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Count2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel6.setText("Question ID:");

        L_Count3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        L_Count3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Count3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel8.setText("Question ID:");

        L_Count5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        L_Count5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Count5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Enter Name");

        Txt_Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Crs_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(Btn_Close3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Question4, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R_17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R_18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R_19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(R_20)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btn_Close2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_4))
                            .addComponent(L_Question1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(L_Count1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(L_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L_Q, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(Txt_Name))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(L_Count5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(L_Count3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(L_Count2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(L_Count, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R_9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R_11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_12))
                            .addComponent(L_Question2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R_13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R_15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_16))
                            .addComponent(L_Question3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Crs_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Close3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_Count, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_Question)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R_1)
                            .addComponent(R_2)
                            .addComponent(R_3)
                            .addComponent(R_4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_Count1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(L_Question1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_5)
                    .addComponent(R_6)
                    .addComponent(R_7)
                    .addComponent(R_8))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_Count2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(L_Question2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_9)
                    .addComponent(R_10)
                    .addComponent(R_11)
                    .addComponent(R_12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_Count3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(L_Question3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_13)
                    .addComponent(R_14)
                    .addComponent(R_15)
                    .addComponent(R_16))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_Count5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Question4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_17)
                    .addComponent(R_18)
                    .addComponent(R_19)
                    .addComponent(R_20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Close2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Close2ActionPerformed
        setVisible(false);
        new StudentView().setVisible(true);
    }//GEN-LAST:event_Btn_Close2ActionPerformed

    private void Btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SubmitActionPerformed
       int a=JOptionPane.showConfirmDialog(null, "Do you really want to submit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            answerset();
            submit();
        }
 
    }//GEN-LAST:event_Btn_SubmitActionPerformed

    private void Btn_Close3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Close3ActionPerformed
 if(Crs_CB.getSelectedItem().equals("Computer"))
 {
        try
        {
        Connection Con=Connect.getcon();
        Statement st=Con.createStatement();
        ResultSet rs=st.executeQuery("select * from tbl_q where  Cat='Computer'");
        if(rs.next())
        {
            L_Count.setText(rs.getString(1));
            L_Question.setText(rs.getString(3));
            R_1.setText(rs.getString(4));
            R_2.setText(rs.getString(5));
            R_3.setText(rs.getString(6));
            R_4.setText(rs.getString(7));
            if(rs.next())
            L_Count1.setText(rs.getString(1));
            L_Question1.setText(rs.getString(3));
            R_5.setText(rs.getString(4));
            R_6.setText(rs.getString(5));
            R_7.setText(rs.getString(6));
            R_8.setText(rs.getString(7));
            if(rs.next())
            L_Count2.setText(rs.getString(1));
            L_Question2.setText(rs.getString(3));
            R_9.setText(rs.getString(4));
            R_10.setText(rs.getString(5));
            R_11.setText(rs.getString(6));
            R_12.setText(rs.getString(7));
            if(rs.next())
            L_Count3.setText(rs.getString(1));
            L_Question3.setText(rs.getString(3));
            R_13.setText(rs.getString(4));
            R_14.setText(rs.getString(5));
            R_15.setText(rs.getString(6));
            R_16.setText(rs.getString(7));
            if(rs.next())
            L_Count5.setText(rs.getString(1));
            L_Question4.setText(rs.getString(3));
            R_17.setText(rs.getString(4));
            R_18.setText(rs.getString(5));
            R_19.setText(rs.getString(6));
            R_20.setText(rs.getString(7));
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}
else if(Crs_CB.getSelectedItem().equals("English"))
{
    
    try
    {
        Connection Con=Connect.getcon();
        Statement st=Con.createStatement();
        ResultSet rs=st.executeQuery("select * from tbl_q where  Cat='English'");
        if(rs.next())
        {
            L_Count.setText(rs.getString(1));
            L_Question.setText(rs.getString(3));
            R_1.setText(rs.getString(4));
            R_2.setText(rs.getString(5));
            R_3.setText(rs.getString(6));
            R_4.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question1.setText(rs.getString(3));
            R_5.setText(rs.getString(4));
            R_6.setText(rs.getString(5));
            R_7.setText(rs.getString(6));
            R_8.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question2.setText(rs.getString(3));
            R_9.setText(rs.getString(4));
            R_10.setText(rs.getString(5));
            R_11.setText(rs.getString(6));
            R_12.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question3.setText(rs.getString(3));
            R_13.setText(rs.getString(4));
            R_14.setText(rs.getString(5));
            R_15.setText(rs.getString(6));
            R_16.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question4.setText(rs.getString(3));
            R_17.setText(rs.getString(4));
            R_18.setText(rs.getString(5));
            R_19.setText(rs.getString(6));
            R_20.setText(rs.getString(7));
        } 
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}
else if(Crs_CB.getSelectedItem().equals("Maths"))
{
    try
    {
        Connection Con=Connect.getcon();
        Statement st=Con.createStatement();
        ResultSet rs=st.executeQuery("select * from tbl_q where  Cat='Maths'");
        if(rs.next())
        {
            L_Count.setText(rs.getString(1));
            L_Question.setText(rs.getString(3));
            R_1.setText(rs.getString(4));
            R_2.setText(rs.getString(5));
            R_3.setText(rs.getString(6));
            R_4.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question1.setText(rs.getString(3));
            R_5.setText(rs.getString(4));
            R_6.setText(rs.getString(5));
            R_7.setText(rs.getString(6));
            R_8.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question2.setText(rs.getString(3));
            R_9.setText(rs.getString(4));
            R_10.setText(rs.getString(5));
            R_11.setText(rs.getString(6));
            R_12.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question3.setText(rs.getString(3));
            R_13.setText(rs.getString(4));
            R_14.setText(rs.getString(5));
            R_15.setText(rs.getString(6));
            R_16.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question4.setText(rs.getString(3));
            R_17.setText(rs.getString(4));
            R_18.setText(rs.getString(5));
            R_19.setText(rs.getString(6));
            R_20.setText(rs.getString(7));
        } 
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }        
}
else if(Crs_CB.getSelectedItem().equals("Science"))
{
    try
    {
        Connection Con=Connect.getcon();
        Statement st=Con.createStatement();
        ResultSet rs=st.executeQuery("select * from tbl_q where  Cat='Science'");
        if(rs.next())
        {
            L_Count.setText(rs.getString(1));
            L_Question.setText(rs.getString(3));
            R_1.setText(rs.getString(4));
            R_2.setText(rs.getString(5));
            R_3.setText(rs.getString(6));
            R_4.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question1.setText(rs.getString(3));
            R_5.setText(rs.getString(4));
            R_6.setText(rs.getString(5));
            R_7.setText(rs.getString(6));
            R_8.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question2.setText(rs.getString(3));
            R_9.setText(rs.getString(4));
            R_10.setText(rs.getString(5));
            R_11.setText(rs.getString(6));
            R_12.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question3.setText(rs.getString(3));
            R_13.setText(rs.getString(4));
            R_14.setText(rs.getString(5));
            R_15.setText(rs.getString(6));
            R_16.setText(rs.getString(7));
            if(rs.next())
            L_Count.setText(rs.getString(1));
            L_Question4.setText(rs.getString(3));
            R_17.setText(rs.getString(4));
            R_18.setText(rs.getString(5));
            R_19.setText(rs.getString(6));
            R_20.setText(rs.getString(7));
        } 
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }        
}
    }//GEN-LAST:event_Btn_Close3ActionPerformed

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
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Close2;
    private javax.swing.JButton Btn_Close3;
    private javax.swing.JButton Btn_Submit;
    private javax.swing.JComboBox<String> Crs_CB;
    private javax.swing.JLabel L_Count;
    private javax.swing.JLabel L_Count1;
    private javax.swing.JLabel L_Count2;
    private javax.swing.JLabel L_Count3;
    private javax.swing.JLabel L_Count4;
    private javax.swing.JLabel L_Count5;
    private javax.swing.JLabel L_Q;
    private javax.swing.JLabel L_Question;
    private javax.swing.JLabel L_Question1;
    private javax.swing.JLabel L_Question2;
    private javax.swing.JLabel L_Question3;
    private javax.swing.JLabel L_Question4;
    private javax.swing.JRadioButton R_1;
    private javax.swing.JRadioButton R_10;
    private javax.swing.JRadioButton R_11;
    private javax.swing.JRadioButton R_12;
    private javax.swing.JRadioButton R_13;
    private javax.swing.JRadioButton R_14;
    private javax.swing.JRadioButton R_15;
    private javax.swing.JRadioButton R_16;
    private javax.swing.JRadioButton R_17;
    private javax.swing.JRadioButton R_18;
    private javax.swing.JRadioButton R_19;
    private javax.swing.JRadioButton R_2;
    private javax.swing.JRadioButton R_20;
    private javax.swing.JRadioButton R_3;
    private javax.swing.JRadioButton R_4;
    private javax.swing.JRadioButton R_5;
    private javax.swing.JRadioButton R_6;
    private javax.swing.JRadioButton R_7;
    private javax.swing.JRadioButton R_8;
    private javax.swing.JRadioButton R_9;
    private javax.swing.JTextField Txt_Name;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

