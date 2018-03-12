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
public class Exer1 {
    
    public static Fila oFila = new Fila();
    
    public static boolean Insert(int iNum){
        return oFila.Insert(iNum);
    }
    
    public static void List(){
        oFila.List();
    }
    
    public static int Delete(){
        return oFila.Delete();
    }
    
    public static void main(String args[]) {                        
       
       Thread oThread1 = new Thread(new Produtor());
       oThread1.start();
       
       Thread oThread2 = new Thread(new Consumidor());
       oThread2.start();
   } 
}
