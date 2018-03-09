package Lista3.Exer1;



public class BufferSincronizado implements Buffer{
    private int[] buffer = {1, 1, -1};
    private int contCelulaOcupada = 2;
    private int writeIndex = 2;
    private int readIndex = 0;
    
    public synchronized void set(int valor)throws InterruptedException{
        while(contCelulaOcupada == buffer.length){
            System.out.println("Buffer cheio. Produtor esperando");
            wait();
        }
        
        buffer[writeIndex] = valor;
        
        writeIndex = (writeIndex+1)%buffer.length;
        
        ++contCelulaOcupada;        
        
        
        notifyAll();
    }
    
    public synchronized int get() throws InterruptedException{
        while(contCelulaOcupada == 0){
            System.out.println("Buffer vazio. Consumidor esperando");
            wait();
        }
        
        int readValor = buffer[readIndex];
        
        readIndex = (readIndex+1)%buffer.length;
        
        --contCelulaOcupada;        
        
        notifyAll();
        
        return readValor;
    }
}
