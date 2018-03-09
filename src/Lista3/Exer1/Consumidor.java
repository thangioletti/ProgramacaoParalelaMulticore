package Lista3.Exer1;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Consumidor implements Runnable{    
    private final Buffer sharedLocation;
    private int fib;   
    
    public Consumidor(Buffer shared){
        sharedLocation = shared;
    }
    
    public void run(){        
        for(int i = 1; i <= fib; i++){           
            try {                
                System.out.println("Consumidor leu que fib("+i+") = "+sharedLocation.get());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }       
    }

    public int getFib() {
        return fib;
    }

    public void setFib(int fib) {
        this.fib = fib;
    }
    
    
    
}
