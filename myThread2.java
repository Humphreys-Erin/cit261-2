package Threads;

public class myThread2 extends Thread {

    public void run() {
        System.out.println("This is a thread!");
    }

    public static void main(String args[]) {
        (new myThread2()).start();
    }

}