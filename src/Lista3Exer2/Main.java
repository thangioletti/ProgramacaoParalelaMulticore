/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3Exer2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Wiliam
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Main() {
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

        jLabel1 = new javax.swing.JLabel();
        tamanhoDoVetor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        numProcurado = new javax.swing.JTextField();
        quantThreads = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tamanho do Vetor:");

        jLabel2.setText("Quant. de Threads:");

        jLabel3.setText("Procurar número:");

        jButton1.setText("Busca sem thread");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gerar vetor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Busca com thread");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tempo total: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tempo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(numProcurado, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(quantThreads, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(tamanhoDoVetor, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tamanhoDoVetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tempo))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tamanhoDoVetor.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo tamanho do vetor está vazio", "Insira o tamanho do vetor", JOptionPane.ERROR_MESSAGE, null);
        } else {
            vetor = new int[Integer.parseInt(tamanhoDoVetor.getText())];
            Random rand = new Random();
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = rand.nextInt(100);
                //System.out.println(vetor[i]);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        long tempoInicio = System.currentTimeMillis();
        BuscaNoVetor busca = new BuscaNoVetor(vetor, 0, vetor.length, Integer.parseInt(numProcurado.getText()), 1);
        busca.setAchou(false);
        busca.setPosEncontrada(-1);
        busca.buscaSemThread();
        tempo.setText((System.currentTimeMillis() - tempoInicio) + " ms");
        if (busca.isAchou()) {
            JOptionPane.showMessageDialog(null, "A[" + busca.getPosEncontrada() + "] = " + numProcurado.getText(), "Busca finalizada com sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        } else {
            JOptionPane.showMessageDialog(null, busca.getPosEncontrada(), "Busca finalizada com sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (quantThreads.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo quantidade de threads está vazio", "Insira a quantidade de threads", JOptionPane.ERROR_MESSAGE, null);
        } else if (numProcurado.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo procurar número está vazio", "Insira o procurar número", JOptionPane.ERROR_MESSAGE, null);
        } else if (vetor == null) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, clique no botão ao lado e gere o vetor", "Não foi gerado o vetor", JOptionPane.ERROR_MESSAGE, null);
        } else if (vetor.length < Integer.parseInt(quantThreads.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Quantidade de thread maior que o vetor", "Quantidade de thread inválida", JOptionPane.ERROR_MESSAGE, null);
        } else {
            BuscaNoVetor.achou = false;
            BuscaNoVetor.posEncontrada = -1;
            int quantThread = Integer.parseInt(quantThreads.getText());
            int tamIntervalo = vetor.length / quantThread +1;
            BuscaNoVetor v1;
            Thread th[] = new Thread[quantThread];
            long tempoInicio = System.currentTimeMillis();
            for (int i = 0; i < quantThread; i++) {
                v1 = new BuscaNoVetor(vetor, i * tamIntervalo, (i + 1) * tamIntervalo, Integer.parseInt(numProcurado.getText()), (i + 1));
                th[i] = new Thread(v1);
                th[i].start();
            }

            try {
                for (int i = 0; i < quantThread - 1; i++) {
                    th[i].join(0);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            tempo.setText((System.currentTimeMillis() - tempoInicio) + " ms");

            if (BuscaNoVetor.achou) {
                JOptionPane.showMessageDialog(null, "A[" + BuscaNoVetor.posEncontrada + "] = " + numProcurado.getText(), "Busca finalizada com sucesso", JOptionPane.INFORMATION_MESSAGE, null);
            } else {
                JOptionPane.showMessageDialog(null, BuscaNoVetor.posEncontrada, "Busca finalizada com sucesso", JOptionPane.INFORMATION_MESSAGE, null);
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private int[] vetor;

    //private BuscaNoVetor busca = new BuscaNoVetor(vet, WIDTH, WIDTH, WIDTH, WIDTH);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField numProcurado;
    private javax.swing.JTextField quantThreads;
    private javax.swing.JTextField tamanhoDoVetor;
    public static javax.swing.JLabel tempo;
    // End of variables declaration//GEN-END:variables
}
