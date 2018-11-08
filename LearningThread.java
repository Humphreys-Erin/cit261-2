/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnthread;

/**
 *
 * @author woo13
 */
public class LearningThread extends Thread {

    /* Create run method first
     *
     */
    @Override
    public void run(){
        for(int a=0; a<5; a++)
            System.out.println("Thread: "+a);
    }
    public static void main(String[] args) {
        
        // Create object LearningThread class
        
        LearningThread t1 = new LearningThread();
        t1.start();
        LearningThread t2 = new LearningThread();
        t2.start();
        
    }
    
}
