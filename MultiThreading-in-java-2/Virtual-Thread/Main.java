import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String [] args) throws InterruptedException {

        Runnable task = ()->{
            System.out.println("Thread started");
        };

        // Points to remember
        // 1. Virtual Threads are Daemon Threads by default
            // -> meaning - virtual threads will terminate , if main threads terminates
        // 2. When virtual threads goes in waiting state, JVM removes it's link with OS thread
            // -> making the OS thread unblocked, it can process another task
        // 3. Virtual Threads are used mostly for I/O operations
        // 4. We can create numerous Virtual Threads, since it is managed by JVM.


        // 2 Ways to create Virtual Threads
        // 1. using Thread class
        Thread t1 = Thread.ofVirtual().start(task);


        // 2. using Executors class
        ExecutorService t2 = Executors.newVirtualThreadPerTaskExecutor();
        t2.submit(task);


        Thread.sleep(5000);


    }


}
