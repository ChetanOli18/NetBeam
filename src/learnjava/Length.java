/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package learnjava;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mico5
 */
public class Length extends javax.swing.JFrame {

   
    public Length() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Combo2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        con = new javax.swing.JButton();
        Combo1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(306, 443));
        setSize(new java.awt.Dimension(306, 443));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Length Converter");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Length");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 55, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Length");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 70, -1));

        Combo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm" }));
        Combo2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 102), new java.awt.Color(0, 153, 51)));
        Combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo2ActionPerformed(evt);
            }
        });
        getContentPane().add(Combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("To");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 40, 30));

        txt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 30));

        txt2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 270, 30));

        con.setBackground(new java.awt.Color(204, 204, 204));
        con.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        con.setText("Convert");
        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });
        getContentPane().add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        Combo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm" }));
        Combo1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 102), new java.awt.Color(0, 153, 51)));
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });
        getContentPane().add(Combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
     
        String Num1 = (String)Combo1.getSelectedItem();
        
        String Num2 = (String)Combo2.getSelectedItem();
        
        if (Num1.equals("cm")&& Num2.equals("mm"))
        {
            double cm = Double.parseDouble(txt1.getText());
            double mm = (double)(cm*10);
             txt2.setText(String.valueOf(mm));
             
             }     
        if (Num1.equals("mm")&& Num2.equals("cm"))
        {
            double mm = Double.parseDouble(txt1.getText());
            double cm = (double)(mm/10);
             txt2.setText(String.valueOf(cm));
        }
        
    }//GEN-LAST:event_conActionPerformed

    private void Combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo2ActionPerformed

    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage HM = new HomePage();
     HM.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Length.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Length.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Length.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Length.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Length().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JComboBox<String> Combo2;
    private javax.swing.JButton con;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
