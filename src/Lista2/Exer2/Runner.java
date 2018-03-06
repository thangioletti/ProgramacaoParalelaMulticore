/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2.Exer2;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author angioletti
 */
public class Runner implements Runnable{
    
    private final int iFinish = 700;
    private int iPos = 0;
    private int iCod;
    private boolean bStart;
    private final Random r = new Random();        

    public Runner(int iCod) {
        this.iCod = iCod;
        this.bStart = true;
    }

    public boolean isbStart() {
        return bStart;
    }

    public void setbStart(boolean bStart) {
        this.bStart = bStart;
    }
            
    public void setiPos(int iPos) {
        this.iPos = iPos;
    }

    public int getiCod() {
        return iCod;
    }

    public void setiCod(int iCod) {
        this.iCod = iCod;
    }
    
    public int getiPos() {
        return iPos;
    }

    public int getiFinish() {
        return iFinish;
    }
       
    private void increment() {
      int iResult = this.r.nextInt(20);
      this.setiPos(this.getiPos()+iResult);
      
      if (this.getiPos() > this.getiFinish()) {
          this.setiPos(this.getiFinish());
      }
    }
    
    public void run(){
        
        while (this.getiPos() < this.getiFinish() && this.isbStart()){
             
            this.increment();
            
            try {
              Thread.sleep(50);
            } catch (InterruptedException ex) {
              System.out.println("Thread interrompida");
            }
            
            Exer2.incrementRunner(this.getiCod());
            
        }
        
        this.setbStart(false);
        Thread.interrupted();
    }
}
