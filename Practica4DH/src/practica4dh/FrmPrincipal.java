/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4dh;

/**
 *
 * @author USUARIO
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FrmPrincipal() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jventana = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Bmenu = new javax.swing.JMenu();
        Bsuma = new javax.swing.JMenuItem();
        Bresta = new javax.swing.JMenuItem();
        Bmulti = new javax.swing.JMenuItem();
        Bdivision = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Bsalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jventana.setBorder(new javax.swing.border.MatteBorder(null));
        Jventana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JventanaLayout = new javax.swing.GroupLayout(Jventana);
        Jventana.setLayout(JventanaLayout);
        JventanaLayout.setHorizontalGroup(
            JventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        JventanaLayout.setVerticalGroup(
            JventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        Bmenu.setText("Operaciones");

        Bsuma.setText("Suma");
        Bsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsumaActionPerformed(evt);
            }
        });
        Bmenu.add(Bsuma);

        Bresta.setText("Resta");
        Bresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrestaActionPerformed(evt);
            }
        });
        Bmenu.add(Bresta);

        Bmulti.setText("Multiplicacion");
        Bmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmultiActionPerformed(evt);
            }
        });
        Bmenu.add(Bmulti);

        Bdivision.setText("Division");
        Bdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdivisionActionPerformed(evt);
            }
        });
        Bmenu.add(Bdivision);

        jMenuBar1.add(Bmenu);

        jMenu2.setText("Terminar");

        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        jMenu2.add(Bsalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jventana)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jventana)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdivisionActionPerformed
        // TODO add your handling code here:
          FrmDivision division = new FrmDivision();
          Jventana.add(division);
        division.setVisible(true);
    }//GEN-LAST:event_BdivisionActionPerformed

    private void BsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsumaActionPerformed
        // TODO add your handling code here:
         FrmSuma suma = new FrmSuma();
         Jventana.add(suma);
          suma.setVisible(true);
    }//GEN-LAST:event_BsumaActionPerformed

    private void BmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmultiActionPerformed
        // TODO add your handling code here:
         FrmMulti multi = new FrmMulti();
         Jventana.add(multi);
                multi.setVisible(true);
    }//GEN-LAST:event_BmultiActionPerformed

    private void BrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrestaActionPerformed
        // TODO add your handling code here:
        FrmResta resta = new FrmResta();
        Jventana.add(resta);
                resta.setVisible(true);
    }//GEN-LAST:event_BrestaActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BsalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Bdivision;
    private javax.swing.JMenu Bmenu;
    private javax.swing.JMenuItem Bmulti;
    private javax.swing.JMenuItem Bresta;
    private javax.swing.JMenuItem Bsalir;
    private javax.swing.JMenuItem Bsuma;
    public static javax.swing.JDesktopPane Jventana;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
