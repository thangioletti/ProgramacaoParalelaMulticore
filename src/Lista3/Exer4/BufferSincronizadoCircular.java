package Lista3.Exer4;

public class BufferSincronizadoCircular implements Buffer{
    private int[] buffer = {-1, -1, -1};
    private int contCelulaOcupada = 0;
    private int writeIndex = 0;
    private int readIndex = 0;
    private boolean escritaAtivada = false;
    
    public synchronized void set(int valor, int id)throws InterruptedException{
          
        while(contCelulaOcupada == buffer.length){
            System.out.println("Buffer cheio. Escritor esperando");
            wait();
        }
        escritaAtivada = true;      
        buffer[writeIndex] = valor;
        
        writeIndex = (writeIndex+1)%buffer.length;
        System.out.println("Escritor "+id+" escreveu "+valor);
        
        ++contCelulaOcupada;        
        
        escritaAtivada = false;
        notifyAll();
    }
    
    public synchronized int get(int id) throws InterruptedException{
        while(contCelulaOcupada == 0){
            System.out.println("Buffer vazio. Leitor esperando");
            wait();
        }
        while(writeIndex == readIndex && escritaAtivada){
            System.out.println("Se um escritor esta escrevendo, "
                + "nenhum leitor pode ler a mesma região de dados compartilhada.");
            wait();
        }
        
        
        int readValor = buffer[readIndex];
        System.out.println("Leitor "+id+" leu "+readValor);       
        
        readIndex = (readIndex+1)%buffer.length;
        
        --contCelulaOcupada;
        
        
        notifyAll();
        return readValor;
    }   
}
