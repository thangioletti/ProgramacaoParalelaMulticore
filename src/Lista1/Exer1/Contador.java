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
public class Contador implements Runnable{
    
    private int iCont;
    private int iCod;
    private boolean bFinish;

    public Contador(int iCod) {
        this.iCod = iCod;
        this.iCont = 0;
        this.bFinish = true;
    }

    public void setiCod(int iCod) {
        this.iCod = iCod;
    }
        
    public void setiCont(int iCont) {
        this.iCont = iCont;
    }
        
    public void setbFinish(boolean bFinish) {
        this.bFinish = bFinish;
    }

    public int getiCod() {
        return iCod;
    }        
        
    public int getiCont() {
        return iCont;
    }

    public boolean isbFinish() {
        return bFinish;
    }
    
    public void incrementCount(){
        int iNewCount = this.getiCont();
        iNewCount++;
        this.setiCont(iNewCount);
    }
    
    
    public void run(){
        while(!isbFinish()){
            
            this.incrementCount();
            
            try {
              Thread.sleep(1000);
            } catch (InterruptedException ex) {
              System.out.println("Thread 1 interrompida");
            }
            
            Exer1.incrementCounter(this.getiCod());
    }
    }
}
