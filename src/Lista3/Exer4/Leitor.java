package Lista3.Exer4;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Leitor implements Runnable {

    private final static Random gerador = new Random();
    private final Buffer sharedLocation;
    private final int idThread;

    public Leitor(Buffer shared, int id) {
        sharedLocation = shared;
        this.idThread = id;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(gerador.nextInt(3000));
                sharedLocation.get(idThread);
            } catch (InterruptedException ex) {
                Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Leitor " + idThread + " terminou");
    }
}
