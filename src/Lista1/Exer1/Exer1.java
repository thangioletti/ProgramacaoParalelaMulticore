/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1.Exer1;

/**
 *
 * @author angioletti
 */
public class Exer1 extends javax.swing.JFrame {

    
    static Contador[] aCounters = new Contador[2];           
       
    public Exer1() {
        initComponents();
        
        aCounters[0] = new Contador(0);        
        aCounters[1] = new Contador(1);        
        
        Thread oThread1 = new Thread(aCounters[0]);
        oThread1.start();
        Thread oThread2 = new Thread(aCounters[1]);
        oThread2.start();
        
    }
    
    //Metodo para iniciar os contadores
    private void startCounter(int iCod) {                        
        aCounters[iCod].setbFinish(false);
        Thread oThread1 = new Thread(aCounters[iCod]);
        oThread1.start();
    }         
    
    //Metodo para pausar os contadores
    private void pauseCounter(int iCod) {                        
        aCounters[iCod].setbFinish(true);        
    } 
    
    //Metodo para parar os contadores    
    private void stopCounter(int iCod) {                        
        aCounters[iCod].setiCont(0);
        aCounters[iCod].setbFinish(true);        
    }    
    
    //Metodo para incrementar o contador
    public static void incrementCounter(int iCod) {
        if (iCod == 0) {
            counterA.setText(""+aCounters[0].getiCont());         
        } else if (iCod == 1) {
            counterB.setText(""+aCounters[1].getiCont());         
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startA = new javax.swing.JButton();
        pauseA = new javax.swing.JButton();
        stopA = new javax.swing.JButton();
        counterA = new javax.swing.JLabel();
        startB = new javax.swing.JButton();
        pauseB = new javax.swing.JButton();
        stopB = new javax.swing.JButton();
        counterB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startA.setText("Start A");
        startA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startA(evt);
            }
        });

        pauseA.setText("Pause A");
        pauseA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseA(evt);
            }
        });

        stopA.setText("Stop A");
        stopA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopA(evt);
            }
        });

        counterA.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        counterA.setText("0");

        startB.setText("Start B");
        startB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startB(evt);
            }
        });

        pauseB.setText("Pause B");
        pauseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseB(evt);
            }
        });

        stopB.setText("Stop B");
        stopB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopB(evt);
            }
        });

        counterB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        counterB.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pauseA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopA)
                        .addGap(18, 18, 18)
                        .addComponent(counterA))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pauseB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopB)
                        .addGap(18, 18, 18)
                        .addComponent(counterB)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(counterA)
                    .addComponent(startA)
                    .addComponent(pauseA)
                    .addComponent(stopA))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(counterB)
                    .addComponent(startB)
                    .addComponent(pauseB)
                    .addComponent(stopB))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startA(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startA
        this.startCounter(0);
    }//GEN-LAST:event_startA

    private void pauseA(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseA
        this.pauseCounter(0);
    }//GEN-LAST:event_pauseA

    private void stopA(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopA
        this.stopCounter(0);
    }//GEN-LAST:event_stopA

    private void startB(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startB
        this.startCounter(1);
    }//GEN-LAST:event_startB

    private void pauseB(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseB
        this.pauseCounter(1);
    }//GEN-LAST:event_pauseB

    private void stopB(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopB
        this.stopCounter(1);
    }//GEN-LAST:event_stopB


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exer1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel counterA;
    public static javax.swing.JLabel counterB;
    private javax.swing.JButton pauseA;
    private javax.swing.JButton pauseB;
    private javax.swing.JButton startA;
    private javax.swing.JButton startB;
    private javax.swing.JButton stopA;
    private javax.swing.JButton stopB;
    // End of variables declaration//GEN-END:variables
}
