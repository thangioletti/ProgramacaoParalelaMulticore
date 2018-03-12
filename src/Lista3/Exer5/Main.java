package Lista3.Exer5;
public class Main {
    public static void main(String[] args) {
        Garfos g1 = new Garfos(1, 5);
        Garfos g2 = new Garfos(2, 1);
        Garfos g3 = new Garfos(3, 2);
        Garfos g4 = new Garfos(4, 3);
        Garfos g5 = new Garfos(5, 4);
        
        Filosofo f1 = new Filosofo(1, g1);
        Filosofo f2 = new Filosofo(2, g2);
        Filosofo f3 = new Filosofo(3, g3);
        Filosofo f4 = new Filosofo(4, g4);
        Filosofo f5 = new Filosofo(5, g5);
        
        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f2);
        Thread t3 = new Thread(f3);
        Thread t4 = new Thread(f4);
        Thread t5 = new Thread(f5);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }    
}
