
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kumar
 */
public class NewStudent extends javax.swing.JFrame
{

    /**
     * Creates new form NewStudent
     */
    public NewStudent()
    {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_student_id = new javax.swing.JTextField();
        text_name = new javax.swing.JTextField();
        text_father_name = new javax.swing.JTextField();
        combobox_course_name = new javax.swing.JComboBox<>();
        combobox_branch_name = new javax.swing.JComboBox<>();
        save_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 148, 136, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 209, 136, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 270, 136, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Course Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 331, 136, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Branch Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 392, 136, 35));

        text_student_id.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(text_student_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 150, 321, 35));

        text_name.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(text_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 209, 321, 35));

        text_father_name.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(text_father_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 270, 321, 35));

        combobox_course_name.setBackground(new java.awt.Color(255, 255, 204));
        combobox_course_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combobox_course_name.setForeground(new java.awt.Color(102, 102, 0));
        combobox_course_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.TECH", "DIPLOMA", " " }));
        getContentPane().add(combobox_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 331, 321, 35));

        combobox_branch_name.setBackground(new java.awt.Color(255, 255, 204));
        combobox_branch_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combobox_branch_name.setForeground(new java.awt.Color(102, 102, 0));
        combobox_branch_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "CIVIL", "MECHANICAL" }));
        getContentPane().add(combobox_branch_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 392, 321, 35));

        save_button.setBackground(new java.awt.Color(255, 255, 204));
        save_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        save_button.setForeground(new java.awt.Color(51, 51, 255));
        save_button.setText("SAVE");
        save_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                save_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(save_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 496, 135, 53));

        close_button.setBackground(new java.awt.Color(255, 255, 204));
        close_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close_button.setForeground(new java.awt.Color(255, 0, 102));
        close_button.setText("CLOSE");
        close_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                close_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 496, 135, 53));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_close_buttonActionPerformed
    {//GEN-HEADEREND:event_close_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_close_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_save_buttonActionPerformed
    {//GEN-HEADEREND:event_save_buttonActionPerformed
        // TODO add your handling code here:
        String studentID = text_student_id.getText();
        String name = text_name.getText();
        String fatherName = text_father_name.getText();
        String courseName = (String)combobox_course_name.getSelectedItem();
        String branchName = (String)combobox_branch_name.getSelectedItem();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('"+studentID+"' , '"+name+"' , '"+fatherName+"' , '"+courseName+"' , '"+branchName+"')");
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            new NewStudent().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , "Student ID Already Exist");
            setVisible(false);
            new NewStudent().setVisible(true);
        }
     
    }//GEN-LAST:event_save_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_button;
    private javax.swing.JComboBox<String> combobox_branch_name;
    private javax.swing.JComboBox<String> combobox_course_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField text_father_name;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField text_student_id;
    // End of variables declaration//GEN-END:variables
}
