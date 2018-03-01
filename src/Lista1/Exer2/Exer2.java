/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1.Exer2;

import javax.swing.ImageIcon;

/**
 *
 * @author angioletti
 */
public class Exer2 extends javax.swing.JFrame {

    public Exer2() {
        initComponents();                        
        
        
        Thread oThread1 = new Thread(new Semaforo(0, 0, 0)); //INICIA VERMELHO
        oThread1.start();
        Thread oThread2 = new Thread(new Semaforo(1, 0, 4500)); //INICIAR VERMELHO
        oThread2.start();
        Thread oThread3 = new Thread(new Semaforo(2, 0, 9000)); //INICIAR VERMELHO
        oThread3.start();
        Thread oThread4 = new Thread(new Semaforo(3, 0, 13500)); //INICIAR VERMELHO
        oThread4.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Semaforo1 = new javax.swing.JLabel();
        Semaforo2 = new javax.swing.JLabel();
        Semaforo3 = new javax.swing.JLabel();
        Semaforo4 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 375));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Semaforo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lista1/Exer2/vermelho.png"))); // NOI18N
        jPanel1.add(Semaforo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        Semaforo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lista1/Exer2/vermelho.png"))); // NOI18N
        jPanel1.add(Semaforo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 30, 40));

        Semaforo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lista1/Exer2/vermelho.png"))); // NOI18N
        Semaforo3.setToolTipText("");
        jPanel1.add(Semaforo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 20, 40));

        Semaforo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lista1/Exer2/vermelho.png"))); // NOI18N
        jPanel1.add(Semaforo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 30, 50));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lista1/Exer2/fundo.png"))); // NOI18N
        Fundo.setText("'");
        jPanel1.add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {                
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exer2().setVisible(true);
            }
        });
    }                                  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    public static javax.swing.JLabel Semaforo1;
    public static javax.swing.JLabel Semaforo2;
    public static javax.swing.JLabel Semaforo3;
    public static javax.swing.JLabel Semaforo4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
