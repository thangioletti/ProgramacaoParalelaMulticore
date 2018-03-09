package Lista3Exer4;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritor implements Runnable {

    private final static Random gerador = new Random();
    private final Buffer sharedLocation;
    private final int idThread;

    public Escritor(Buffer shared, int id) {
        sharedLocation = shared;
        this.idThread = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(gerador.nextInt(3000));
                int num = gerador.nextInt(100);
                sharedLocation.set(num, idThread);
            } catch (InterruptedException ex) {
                Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Escritor " + idThread + " terminou");
    }

}
