package Lista3.Exer1;



public interface Buffer {
    public void set (int valor) throws InterruptedException;
    
    public int get() throws InterruptedException;
}
