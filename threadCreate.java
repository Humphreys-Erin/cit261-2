
import threading.threading;

public class threadCreate {
    public static void main(String[] args) {
       
        Thread t1 = new Thread(new threading("one"));
        Thread t2 = new Thread(new threading("two"));
        Thread t3 = new Thread(new threading("three"));
        Thread t4 = new Thread(new threading("four"));
       
       //how to start a thread
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
