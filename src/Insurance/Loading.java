/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insurance;

import java.awt.Toolkit;

/**
 *
 * @author alinb
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    @SuppressWarnings({"OverridableMethodCallInConstructor", "SleepWhileInLoop"})
    public Loading() {
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

        loading = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        developer = new javax.swing.JLabel();
        load = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("1177326-5011.png")));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(838, 511));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        loading.setBackground(new java.awt.Color(255, 255, 255));
        loading.setLayout(null);

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("INSURANCE MANAGEMENT SYSTEM");
        loading.add(title);
        title.setBounds(0, 290, 840, 40);

        developer.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        developer.setForeground(new java.awt.Color(0, 153, 0));
        developer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        developer.setText("Developed by Alin Babu,Ebin J,Govind P,Athulya  A L");
        loading.add(developer);
        developer.setBounds(0, 490, 840, 14);

        load.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        load.setForeground(new java.awt.Color(0, 153, 0));
        load.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        load.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Insurance/Spinner.gif"))); // NOI18N
        load.setLabelFor(loading);
        load.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loading.add(load);
        load.setBounds(0, 360, 840, 100);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Insurance/imageedit_1_9893603339.png"))); // NOI18N
        loading.add(jLabel1);
        jLabel1.setBounds(340, 60, 170, 200);

        getContentPane().add(loading);
        loading.setBounds(-1, 0, 840, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings({"SleepWhileInLoop", "Convert2Lambda"})
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("MetroUI".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Loading().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel developer;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel load;
    public static javax.swing.JPanel loading;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
