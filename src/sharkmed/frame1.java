/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sharkmed;

/**
 *
 * @author ASUS
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public frame1() {
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

        sharkMedLOGO = new javax.swing.JLabel();
        medicine = new javax.swing.JLabel();
        caring = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 680));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 680));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sharkMedLOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sharkMedLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Minimalist Hospital and Medical Health Logo (5).png"))); // NOI18N
        sharkMedLOGO.setLabelFor(sharkMedLOGO);
        sharkMedLOGO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sharkMedLOGO.setDoubleBuffered(true);
        sharkMedLOGO.setFocusCycleRoot(true);
        sharkMedLOGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sharkMedLOGOMouseClicked(evt);
            }
        });
        getContentPane().add(sharkMedLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 310));

        medicine.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        medicine.setForeground(new java.awt.Color(0, 45, 105));
        medicine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicine.setText("MEDICINE");
        getContentPane().add(medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 450, -1));

        caring.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        caring.setForeground(new java.awt.Color(0, 74, 173));
        caring.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caring.setText("caring beyond");
        getContentPane().add(caring, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 450, -1));

        jPanel1.setBackground(new java.awt.Color(214, 224, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sharkMedLOGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sharkMedLOGOMouseClicked
        home home = new home();
        home.setVisible(true);
        home.pack();
        this.dispose();
    }//GEN-LAST:event_sharkMedLOGOMouseClicked

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caring;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel medicine;
    private javax.swing.JLabel sharkMedLOGO;
    // End of variables declaration//GEN-END:variables
}
