package Lista3.Exer4;

public interface Buffer {
    public void set (int valor, int id) throws InterruptedException;
    
    public int get(int id) throws InterruptedException;
}
