/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teampro;

/**
 *
 * @author Natsuki Rafi
 */
public class Userchoice extends javax.swing.JFrame {

    /**
     * Creates new form Userchoice
     */
    public Userchoice() {
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

        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("MAY YOUR JOURNEY BE SAFE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 40, 460, 40);

        jSeparator3.setBackground(new java.awt.Color(204, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(180, 140, 310, 20);

        rSButtonHover1.setText("EXIT");
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonHover1);
        rSButtonHover1.setBounds(240, 280, 170, 40);

        rSButtonHover3.setText("Seat Add");
        getContentPane().add(rSButtonHover3);
        rSButtonHover3.setBounds(240, 170, 170, 40);

        jSeparator1.setBackground(new java.awt.Color(204, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(190, 240, 310, 10);

        jSeparator2.setBackground(new java.awt.Color(204, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(190, 338, 310, 2);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Natsuki Rafi\\Pictures\\1.jpg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 640, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

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
            java.util.logging.Logger.getLogger(Userchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userchoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    // End of variables declaration//GEN-END:variables
}