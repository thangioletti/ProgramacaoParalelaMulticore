/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3.Exer1;

/**
 *
 * @author angioletti
 */
public class Lista {
    private final int iConst = 5;
    private int aArray[] = new int[iConst];
    private int iPosInserir = 0;
    private int iPosRemover;
    private boolean bConsome = false;
    private boolean bInsere  = true;

    public int[] getaArray() {
        return aArray;
    }

    public void setaArray(int[] aArray) {
        this.aArray = aArray;
    }

    public int getiPosInserir() {
        return iPosInserir;
    }

    public void setiPosInserir(int iPosInserir) {
        this.iPosInserir = iPosInserir;
    }

    public int getiPosRemover() {
        return iPosRemover;
    }

    public void setiPosRemover(int iPosRemover) {
        this.iPosRemover = iPosRemover;
    }

    public boolean isbConsome() {
        return bConsome;
    }

    public void setbConsome(boolean bConsome) {
        this.bConsome = bConsome;
    }

    public boolean isbInsere() {
        return bInsere;
    }

    public void setbInsere(boolean bInsere) {
        this.bInsere = bInsere;
    }
        
    public boolean insert(int iVal) {
      
       if (!this.isbInsere()) { //Lista bloqueada
           return false;
       }
       
       int iPosInserir = this.getiPosInserir();
      
       {//Valida proxima inserção 
        if (iPosInserir >= iConst) { //Ultima gravação liberada
          this.setbInsere(false);
        }
       }
              
       int[] aArray = this.getaArray();
       aArray[iPosInserir] = iVal;
       this.setaArray(aArray);    
       
       return true;
       
    }
    
    public int remove() {
       int[] aArray = this.getaArray();
       int iReturn = aArray[this.getiPosRemover()];
       aArray[this.getiPosRemover()] = 0;
       this.setaArray(aArray);       
       return iReturn;
    }
} 
