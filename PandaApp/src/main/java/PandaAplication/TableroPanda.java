/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PandaAplication;

/**
 *
 * @author Nata
 */
public class TableroPanda extends javax.swing.JFrame {

    /**
     * Creates new form TableroPanda
     */
    public TableroPanda() {
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

        jButton1 = new javax.swing.JButton();
        tableroPanda = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Panda");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 28, -1, -1));

        javax.swing.GroupLayout tableroPandaLayout = new javax.swing.GroupLayout(tableroPanda);
        tableroPanda.setLayout(tableroPandaLayout);
        tableroPandaLayout.setHorizontalGroup(
            tableroPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        tableroPandaLayout.setVerticalGroup(
            tableroPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(tableroPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 1090, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        //int [] x = {400 ,500, 397, 320 };
        //int [] y = {10, 100, 250, 120};
         //Panda.HacerPoligono(tableroPanda.getGraphics(), x, y, 4);
         
         
         
          int [] e = {300, 425,  550,  500, 400, 350, 300,  250, 200, 100,  50, 175 };
        int [] r =   {50,  100 , 300,  425, 475, 540, 550,  540, 475, 425, 300, 100};
        
         Panda.Poligono(tableroPanda.getGraphics(), e, r, 12);
         
         Panda.HacerLinea(tableroPanda.getGraphics(),175,100 ,250,200 );
         Panda.HacerLinea(tableroPanda.getGraphics(),250,200 ,100,425 );
         
         Panda.HacerLinea(tableroPanda.getGraphics(),425,100 ,350,200 );
         Panda.HacerLinea(tableroPanda.getGraphics(),350,200 ,500,425 );
         
         Panda.HacerLinea(tableroPanda.getGraphics(),200,475 ,250,505 );         
         Panda.HacerLinea(tableroPanda.getGraphics(),250,505 ,300,475 );
         
         Panda.HacerLinea(tableroPanda.getGraphics(),300,475 ,350,505 );         
         Panda.HacerLinea(tableroPanda.getGraphics(),350,505 ,400, 475 );
         
         int [] u = {300, 325, 300, 275 };
         int [] o = {475, 490, 505, 490 };
         Panda.HacerPoligono(tableroPanda.getGraphics(), u, o, 4);
         
         Panda.HacerLinea(tableroPanda.getGraphics(),300,475 ,300,455 ); 
         
         int [] l = {300, 340, 365, 300 ,235, 260 };
         int [] k = {465, 450, 425, 435, 425, 450 };
         Panda.HacerPoligono(tableroPanda.getGraphics(), l, k, 6);
         
         Panda.HacerLinea(tableroPanda.getGraphics(),200,475 ,190, 400 );
         Panda.HacerLinea(tableroPanda.getGraphics(),400,475 ,410, 400 );
         
         int [] h = {190, 235, 250, 140 };
         int [] g = {400, 350, 200, 365 };
         Panda.HacerPoligono(tableroPanda.getGraphics(), h, g, 4);
         
         int [] f = {410, 365, 350, 460 };
         int [] d = {400, 350, 200, 365 };
         Panda.HacerPoligono(tableroPanda.getGraphics(), f, d, 4);
         
         int [] s = {503, 560, 503, 425 };
         int [] a = {35, 130, 230, 100 };
         Panda.HacerPoligono(tableroPanda.getGraphics(), s, a, 4);
         
          int [] v = {97, 40, 97, 175 };
          int [] b = {35, 130, 230, 100 };
         Panda.HacerPoligono(tableroPanda.getGraphics(), v, b, 4);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(TableroPanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroPanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroPanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroPanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         TableroPanda miFormulario = new TableroPanda();
        miFormulario.setVisible(true);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroPanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel tableroPanda;
    // End of variables declaration//GEN-END:variables
}
