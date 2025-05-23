package ThreadPool.ThreadPoolExecutor.Future;

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


        Future<?> futureObj = executor.submit(()->{
            System.out.println("inside thread pool");
        });
        try{
            futureObj.get(); // waits for the thread pool , runnable task to complete
        } catch (Exception e) {

        }

        System.out.println("in main thread");
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
