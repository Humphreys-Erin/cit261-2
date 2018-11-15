/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
          System.out.println("Executing Task At " + System.nanoTime()); //system timer
        };

        System.out.println("Submitting task at " + System.nanoTime() + " to be executed after 3 seconds.");
        scheduledExecutorService.schedule(task, 3, TimeUnit.SECONDS);
        
        scheduledExecutorService.shutdown();
    }
}
