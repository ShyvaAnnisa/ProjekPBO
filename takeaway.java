/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package array_group.arrayproject;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class takeaway extends javax.swing.JFrame {

    /** Creates new form takeaway */
    public takeaway() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        nohp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Silahkan isi data berikut !");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(34, 32, 236, 22);

        jLabel2.setText("Nama                                     :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(34, 91, 236, 20);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(34, 157, 0, 0);

        jLabel4.setText("Alamat (juga berisi ket.lorong)  :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(34, 128, 236, 20);

        jLabel5.setText("No.HP                                     :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(34, 166, 236, 20);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(34, 260, 0, 0);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(126, 260, 394, 0);

        OK.setBackground(new java.awt.Color(204, 0, 204));
        OK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OK.setText("Ok");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        getContentPane().add(OK);
        OK.setBounds(303, 226, 57, 31);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(274, 88, 320, 26);

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat);
        alamat.setBounds(274, 125, 320, 26);

        nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohpActionPerformed(evt);
            }
        });
        getContentPane().add(nohp);
        nohp.setBounds(274, 163, 320, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        // TODO add your handling code here:
         if(nama.getText().isEmpty() || alamat.getText().isEmpty() || nohp.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Harap isi Data Diri Anda Dengan Lengkap");
        } else {
            JOptionPane.showMessageDialog(null, "Terima Kasih Atas Pesanan Anda");
            JOptionPane.showMessageDialog(null, "Pesanan Anda Akan Segera Kami Antar ke " +alamat.getText());
            dispose();
        }
    }//GEN-LAST:event_OKActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohpActionPerformed

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
            java.util.logging.Logger.getLogger(takeaway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(takeaway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(takeaway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(takeaway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new takeaway().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nohp;
    // End of variables declaration//GEN-END:variables

}