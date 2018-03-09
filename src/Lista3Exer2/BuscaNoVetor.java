package Lista3Exer2;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class BuscaNoVetor implements Runnable {

    private final int[] vetor;
    private final int inicioVetor;
    private final int fimVetor;
    private final int termoProcurado;
    private final int idThread;
    public static boolean achou;
    public static int posEncontrada;

      

    public synchronized boolean isAchou() {
        return achou;
    }

    public synchronized void setAchou(boolean achou) {
        this.achou = achou;
    }

    public BuscaNoVetor(int[] vet, int inicio, int fim, int proc, int identificador) {
        vetor = vet;
        inicioVetor = inicio;
        fimVetor = fim;
        termoProcurado = proc;
        idThread = identificador;
    }

    @Override
    public void run() {
        if (isAchou()) {
            System.out.println("Já foi encontrado.");            
        } else {
            for (int i = inicioVetor; i <= fimVetor; i++) {
                if(isAchou()){
                    i = fimVetor;
                }else if (vetor[i] == termoProcurado) {
                    setAchou(true);
                    setPosEncontrada(i);
                    System.out.println("A["+i+"] = "+termoProcurado);
                    System.out.println("Thread que encontrou o elemento no vetor: " + idThread);
                }
            }
        } 
        System.out.println("thread "+idThread+" terminou");
    }

    public void buscaSemThread(){
        for(int i = 0; i < vetor.length; i++){
            if(termoProcurado == vetor[i]){  
                setPosEncontrada(i);                
                achou = true;
                break;
            }
        }        
    }

    public synchronized int getPosEncontrada() {
        return posEncontrada;
    }

    public synchronized void setPosEncontrada(int posEncontrada) {
        this.posEncontrada = posEncontrada;
    }
    
    
}
