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
public class Consumidor implements Runnable {

    public void run() {
        while (true) {
            int iDel = Exer1.Delete();

            if (iDel != -1) {
                System.out.println("Consumidor: " + iDel);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Thread interrompida");
            }

        }
    }

}
