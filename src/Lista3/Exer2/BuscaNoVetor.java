package Lista3.Exer2;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class BuscaNoVetor implements Runnable {

    private final int[] iVetor;
    private final int iInicioVetor;
    private final int iFimVetor;
    private final int iProcurado;
    private final int iIdThread;
    public static boolean bAchou;
    public static int iPosicao;

      

    public synchronized boolean isAchou() {
        return bAchou;
    }

    public synchronized void setAchou(boolean bAchou) {
        this.bAchou = bAchou;
    }

    public BuscaNoVetor(int[] vet, int inicio, int fim, int proc, int identificador) {
        iVetor = vet;
        iInicioVetor = inicio;
        iFimVetor = fim;
        iProcurado = proc;
        iIdThread = identificador;
    }

    @Override
    public void run() {
        if (isAchou()) {
            System.out.println("Já foi encontrado.");            
        } else {
            for (int i = iInicioVetor; i <= iFimVetor; i++) {
                if(isAchou()){
                    i = iFimVetor;
                }else if (iVetor[i] == iProcurado) {
                    setAchou(true);
                    setPosEncontrada(i);
                    System.out.println("A["+i+"] = "+iProcurado);
                    System.out.println("Thread que encontrou o elemento no iVetor: " + iIdThread);
                }
            }
        } 
        System.out.println("thread "+iIdThread+" terminou");
    }

    public void buscaSemThread(){
        for(int i = 0; i < iVetor.length; i++){
            if(iProcurado == iVetor[i]){  
                setPosEncontrada(i);                
                bAchou = true;
                break;
            }
        }        
    }

    public synchronized int getPosEncontrada() {
        return iPosicao;
    }

    public synchronized void setPosEncontrada(int iPosicao) {
        this.iPosicao = iPosicao;
    }
    
    
}
