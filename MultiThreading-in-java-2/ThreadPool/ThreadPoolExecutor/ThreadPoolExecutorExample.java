package ThreadPool.ThreadPoolExecutor;

import java.util.concurrent.*;




public class ThreadPoolExecutorExample {

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


        for(int i=0; i<7; i++) {
            executor.submit(()->{
                try{
                    System.out.println("Task started by thread - " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println("Task completed ");
                }
                catch(Exception e) {}

            });
        }

        // Working
        // 2 tasks will go to the thread pool , t1, t2
        // 2 tasks will go to queue for waiting
        // 1 task - task-5 will be handled by t3, new thread added in thread pool
        // 1 task - task-6 will be handled by t4, new thread added in thread pool
        // 1 task - task-7 will be rejected,
        //              since no place to keep this task,
        //                     -> Thread pool reached max capacity
        //                     -> Queue also full

    }


};


class customRejectionHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected");
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