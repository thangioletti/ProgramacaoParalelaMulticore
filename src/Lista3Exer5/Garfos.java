package Lista3Exer5;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Garfos implements Runnable{
    private int garfoEsq;
    private int garfoDir;
    
    
    public Garfos(int esq, int dir){
        this.garfoEsq = esq;
        this.garfoDir = dir;
    }
    
    @Override
    public void run(){
        int maximo = 5;
        int cont = 0;
        while(maximo > cont){
            try {
                sortearGarfoEsq();
                sortearGarfoDir();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Garfos.class.getName()).log(Level.SEVERE, null, ex);
            }
            cont++;
        }
    }
    
    public void sortearGarfoEsq(){
        int garfoEsquerda;        
        Random r = new Random();
        garfoEsquerda = r.nextInt(5);
        System.out.println("O garfo da esquerda sorteado foi o "+garfoEsquerda);
    }
    
    public void sortearGarfoDir(){
        int garfoDireita;        
        Random rand = new Random();
        garfoDireita = rand.nextInt(5);
        System.out.println("O garfo da esquerda sorteado foi o "+garfoDireita);
    }

    public int getGarfoEsq() {
        return garfoEsq;
    }

    public void setGarfoEsq(int garfoEsq) {
        this.garfoEsq = garfoEsq;
    }

    public int getGarfoDir() {
        return garfoDir;
    }

    public void setGarfoDir(int garfoDir) {
        this.garfoDir = garfoDir;
    }
    
    
    
    
}
