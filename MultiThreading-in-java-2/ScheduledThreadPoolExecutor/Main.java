package ScheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String [] args) {

        ScheduledExecutorService executorObj = Executors.newScheduledThreadPool(3);

        // METHODS

        // Schedules task to run after some time, only once
        executorObj.schedule(()->{
            try{
                System.out.println("task started");
                Thread.sleep(5000);
                System.out.println("task ended");
            }
            catch(Exception e){

            }
        }, 2,  TimeUnit.SECONDS);



        // similar to setInterval in js
        // Note - If task is currently processing, and time for new task comes,
        // it will be added to queue, and it will process instantly when the thread gets free.
        executorObj.scheduleAtFixedRate(()->{
            try{
                System.out.println("task started scheduleAtfixedRate");
                Thread.sleep(5000);
                System.out.println("task ended scheduleAtfixedRate");
            }
            catch(Exception e){

            }
        }, 2, 2, TimeUnit.SECONDS);




        // In this no queue to store tasks is present, The timer for next will start, only after the first task is completed.
        executorObj.scheduleWithFixedDelay(()->{
            try{
                System.out.println("task started scheduleWithFixedDelay");
                Thread.sleep(5000);
                System.out.println("task ended scheduleWithFixedDelay");
            }
            catch(Exception e){

            }
        }, 2, 2, TimeUnit.SECONDS);

    }
}
