package Threads;

public class myThread1 implements Runnable {

    public void run() {
        System.out.println("This is a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new myThread1())).start();
    }

}