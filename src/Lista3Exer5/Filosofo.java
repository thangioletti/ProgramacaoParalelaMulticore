package Lista3Exer5;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo implements Runnable{
    private int id;
    private Garfos garfo; 

    public Filosofo(int id, Garfos garfo) {
        this.id = id;
        this.garfo = garfo;
    }

    
    
    public void pensar(){
        Random r = new Random();
        System.out.println("O filósofo "+this.id+" está pensando.");
        try {
            Thread.sleep(r.nextInt(1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void run(){        
        int maximo = 5;
        int cont = 0;
        while(maximo > cont){
            if(garfo.getGarfoDir() == 1){
                System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoDir());
                
                if(garfo.getGarfoEsq() == 2){
                    System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoEsq());                    
                    System.out.println("O filósofo "+id+" está comendo...");
                    System.out.println("O filósofo "+id+" largou o garfo da esquerda");
                   System.out.println("O filósofo "+id+" largou o garfo da direita");
                }else{
                    System.out.println("O filósofo "+id+" largou o garfo "+garfo.getGarfoDir());
                }
            }
            else{
                pensar();
            }
            
            if(garfo.getGarfoDir() == 2){
                System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoDir());
                
                if(garfo.getGarfoEsq() == 3){
                    System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoEsq());                    
                    System.out.println("O filósofo "+id+" está comendo...");
                    System.out.println("O filósofo "+id+" largou o garfo da esquerda");
                   System.out.println("O filósofo "+id+" largou o garfo da direita");
                }else{
                    System.out.println("O filósofo "+id+" largou o garfo "+garfo.getGarfoDir());
                }
            }
            else{
                pensar();
            }
            
            if(garfo.getGarfoDir() == 3){
                System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoDir());
                
                if(garfo.getGarfoEsq() == 4){
                    System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoEsq());                    
                    System.out.println("O filósofo "+id+" está comendo...");
                    System.out.println("O filósofo "+id+" largou o garfo da esquerda");
                   System.out.println("O filósofo "+id+" largou o garfo da direita");
                }else{
                    System.out.println("O filósofo "+id+" largou o garfo "+garfo.getGarfoDir());
                }
            }
            else{
                pensar();
            }
            
            if(garfo.getGarfoDir() == 4){
                System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoDir());
                
                if(garfo.getGarfoEsq() == 5){
                    System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoEsq());                    
                    System.out.println("O filósofo "+id+" está comendo...");
                    System.out.println("O filósofo "+id+" largou o garfo da esquerda");
                   System.out.println("O filósofo "+id+" largou o garfo da direita");
                }else{
                    System.out.println("O filósofo "+id+" largou o garfo "+garfo.getGarfoDir());
                }
            }
            else{
                pensar();
            }
            
            if(garfo.getGarfoDir() == 5){
                System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoDir());
                
                if(garfo.getGarfoEsq() == 1){
                    System.out.println("O filósofo "+id+" pegou o garfo "+
                        garfo.getGarfoEsq());                    
                    System.out.println("O filósofo "+id+" está comendo...");
                    System.out.println("O filósofo "+id+" largou o garfo da esquerda");
                   System.out.println("O filósofo "+id+" largou o garfo da direita");
                }else{
                    System.out.println("O filósofo "+id+" largou o garfo "+garfo.getGarfoDir());
                }
            }
            else{
                pensar();
            }
            cont++;
        }
    }
}
