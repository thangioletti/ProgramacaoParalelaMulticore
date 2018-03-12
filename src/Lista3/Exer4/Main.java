package Lista3.Exer4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author angioletti
 */
public class Main {

    public static void main(String[] args) {       
        ExecutorService aplicacao = Executors.newCachedThreadPool();
        
        BufferSincronizadoCircular sharedLocation = new BufferSincronizadoCircular();
        
        
        aplicacao.execute(new Leitor(sharedLocation,1));       
        aplicacao.execute(new Escritor(sharedLocation,1));
       
        
        aplicacao.execute(new Escritor(sharedLocation,2));
        aplicacao.execute(new Leitor(sharedLocation,2));
        
        aplicacao.execute(new Escritor(sharedLocation,3));
        aplicacao.execute(new Leitor(sharedLocation,3));
        
        
        
        aplicacao.shutdown(); 
        
    }
    
}
