package Lista3.Exer1;


import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produtor implements Runnable {
    private final Buffer sharedLocation;
    private int fib;

    public Produtor(Buffer shared) {
        sharedLocation = shared;
    }
    
    public void run(){
        int fib1 = 1;
        int fib2 = 1;
        int aux;
        for(int i = 3; i <= fib; i++){
            try {                
                aux = fib1+fib2;
                fib1 = fib2;
                fib2 = aux;                                
                System.out.println("Produtor escreveu que fib("+i+") = "+fib2);
                sharedLocation.set(fib2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Producão terminada");
    }

    public int getFib() {
        return fib;
    }

    public void setFib(int fib) {
        this.fib = fib;
    }
   
}
