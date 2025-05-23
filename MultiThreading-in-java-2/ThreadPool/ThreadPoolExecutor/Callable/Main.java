package ThreadPool.ThreadPoolExecutor.Callable;

import java.util.concurrent.*;

public class Main {

    public static void main(String [] args) {


        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,      // min no. of threads
                4,                  // max no. of thread
                10,                 // keepAliveTime
                TimeUnit.SECONDS,   // keepAliveTime Units
                new ArrayBlockingQueue<>(2), //
                new ThreadFactorySample(),
                new customRejectionHandler()
        );



        Future<Integer> futureObj = executor.submit(() -> {
            // This task is treated as "callable", since it is returning some data
            System.out.println("inside thread pool");
            return 123;
        });

        try{
            System.out.println(futureObj.get());
        }
        catch(Exception e) {

        }


        System.out.println("inside main thread");

    }


}

class ThreadFactorySample implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(1);
        t.setDaemon(false);

        return t;
    }
};




class customRejectionHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected");
    }
}




