package Lista3.Exer1;


import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Fibonacci de: ");
        int n = entrada.nextInt();
        ExecutorService aplicacao = Executors.newCachedThreadPool();
        
        BufferSincronizado sharedLocation = new BufferSincronizado();
        
        Produtor prod = new Produtor(sharedLocation);
        prod.setFib(n);
        Consumidor con = new Consumidor(sharedLocation);
        con.setFib(n);
                       
        aplicacao.execute(prod);
        aplicacao.execute(con);
        
        aplicacao.shutdown();  
    }
    
}
