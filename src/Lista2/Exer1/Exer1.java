/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2.Exer1;

/**
 *
 * @author angioletti
 */
public class Exer1 extends javax.swing.JFrame {

    
    static Contador[] aCounters = new Contador[2];           
       
    public Exer1() {
        initComponents();
        
        aCounters[0] = new Contador(0);        
        
        Thread oThread1 = new Thread(aCounters[0]);
        oThread1.start();
        
    }
    
    //Metodo para iniciar os contadores
    private void startCounter(int iCod, int iDirection) {                        
        aCounters[iCod].setbFinish(false);
        aCounters[iCod].setiDirection(iDirection);       
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
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Up = new javax.swing.JButton();
        pauseA = new javax.swing.JButton();
        stopA = new javax.swing.JButton();
        counterA = new javax.swing.JLabel();
        Down = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Up.setText("Up");
        Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Up(evt);
            }
        });

        pauseA.setText("Pause");
        pauseA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseA(evt);
            }
        });

        stopA.setText("Stop");
        stopA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopA(evt);
            }
        });

        counterA.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        counterA.setText("0");

        Down.setText("Down");
        Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Down(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Up)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Down)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pauseA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopA)
                .addGap(18, 18, 18)
                .addComponent(counterA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Up)
                    .addComponent(pauseA)
                    .addComponent(stopA)
                    .addComponent(Down))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(counterA)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Up(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Up
        this.startCounter(0, 1);
    }//GEN-LAST:event_Up

    private void pauseA(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseA
        this.pauseCounter(0);
    }//GEN-LAST:event_pauseA

    private void stopA(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopA
        this.stopCounter(0);
    }//GEN-LAST:event_stopA

    private void Down(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Down
      this.startCounter(0, 2);
    }//GEN-LAST:event_Down


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exer1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Down;
    private javax.swing.JButton Up;
    public static javax.swing.JLabel counterA;
    private javax.swing.JButton pauseA;
    private javax.swing.JButton stopA;
    // End of variables declaration//GEN-END:variables
}
