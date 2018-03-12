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
public class Produtor implements Runnable{

    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
    public void run(){
        int n = 0;
        while (true) {            
            int iFibo = fibo(n);
            
            while (!Exer1.Insert(iFibo)){
                System.out.println("Produtor esperando");
              try {
                Thread.sleep(500);
              } catch (InterruptedException ex) {
                System.out.println("Thread interrompida");
              }
   
            }
            System.out.println("Produtor: "+iFibo);
            System.out.print("Buffer: ");
            Exer1.List();
            n++;
        }
        
    }
 
}
