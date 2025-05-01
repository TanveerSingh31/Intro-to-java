package ThreadPool.ThreadPoolExecutor.StatesOfThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String [] args) {


        ExecutorService executor = Executors.newSingleThreadExecutor();


        executor.submit(()->{
            try{
                System.out.println("Work started");
                Thread.sleep(4000);
                System.out.println("Work end");
            }
            catch(Exception e) {}
        });

        executor.shutdown(); // this will make executor to not accept new tasks, continues completing already submitted tasks
        // executor.shutdownNow(); // ends in progress tasks as well


        try{
            // only call after the .shutdown() method
            // blocks the main thread, to wait for given time, and check if the executor has shutdown completely in this time
            boolean isExecutorShutdown = executor.awaitTermination(5, TimeUnit.SECONDS);
            if(isExecutorShutdown){
                System.out.println("Executor shut down");
            }
            else {
                System.out.println("Executor still running ");
            }
        }
        catch(Exception e) {}



        System.out.println("Main thread end");

    }

}
