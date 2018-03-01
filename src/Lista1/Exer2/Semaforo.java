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
public class Semaforo implements Runnable {
       
    private int[] aTempos = new int[3]; //Array com tempos de cada etapa
    private int iEstado; //Marca o estado do semaforo    
    private int[] aEstadoFuturo = new int[3]; //Marca o estado futuro
    private int iCodigoSemaforo; //Codigo do Semaforo
    private int iTempoStart; //Tempo para iniciar 1 loop
    
    public int getTempo(int i) {
        return aTempos[i];
    }    

    public int getiEstado() {
        return iEstado;
    }

    public int getaEstadoFuturo(int i) {
        return aEstadoFuturo[i];
    }    

    public void setiEstado(int iEstado) {
        this.iEstado = iEstado;
    }        

    public int getiCodigoSemaforo() {
        return iCodigoSemaforo;
    }

    public void setiCodigoSemaforo(int iCodigoSemaforo) {
        this.iCodigoSemaforo = iCodigoSemaforo;
    }

    public void setiTempoStart(int iTempoStart) {
        this.iTempoStart = iTempoStart;
    }

    public int getiTempoStart() {
        return iTempoStart;
    }
    
    
    
    public Semaforo(int iCodigoSemaforo, int iEstadoInicial, int iTempoStart){
        
      
        
        this.aTempos[0] = 13500; //Vermelho
        this.aTempos[1] = 1500; //Amarelo
        this.aTempos[2] = 3000; //Verde
        
        this.aEstadoFuturo[0] = 2;
        this.aEstadoFuturo[1] = 0;
        this.aEstadoFuturo[2] = 1;
          
        this.setiTempoStart(iTempoStart);
        this.setiCodigoSemaforo(iCodigoSemaforo);
        this.setiEstado(iEstadoInicial);
    }        
    
    private void trocaEstado(){
        int iEstadoAtual = this.getiEstado();
        int iEstadoFuturo = this.getaEstadoFuturo(iEstadoAtual);
        this.setiEstado(iEstadoFuturo);
    }
    
    public void run(){
        
        try {
          Thread.sleep(this.getiTempoStart());
        } catch (InterruptedException ex) {
          System.out.println("Thread interrompida");
        }

        
        while(true){                 
            
            this.trocaEstado();
            int iEstado = this.getiEstado();
            this.mudaSemaforo(iEstado);
            
            try {
              Thread.sleep(this.getTempo(iEstado));
            } catch (InterruptedException ex) {
              System.out.println("Thread interrompida");
            }
                     
        }
    }
    
    public void mudaSemaforo(int iEstado){                
        int iSemaforo = this.getiCodigoSemaforo();
        ImageIcon oImg = getImagemEstado(iEstado);
        
        if (iSemaforo == 0) {            
            Exer2.Semaforo1.setIcon(oImg);
        } else if (iSemaforo == 1) {
            Exer2.Semaforo2.setIcon(oImg);
        } else if (iSemaforo == 2) {
            Exer2.Semaforo3.setIcon(oImg);
        } else {
            Exer2.Semaforo4.setIcon(oImg);
        }
            
    }   
    
    private ImageIcon getImagemEstado(int iEstado){
        if (iEstado == 0){
            return new ImageIcon(getClass().getResource("/Lista1/Exer2/vermelho.png"));
        } else if (iEstado == 1) {            
            return new ImageIcon(getClass().getResource("/Lista1/Exer2/amarelo.png"));
        } else {
            return new ImageIcon(getClass().getResource("/Lista1/Exer2/verde.png"));
        }
    }  
}
