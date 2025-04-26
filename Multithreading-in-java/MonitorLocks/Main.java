package MonitorLocks;

public class Main {

    public static void main(String [] args)  {

        Sample obj = new Sample();

        // creating obj. using lambda expression from Runnable interface
        Thread t1 = new Thread(()->{ obj.synchronizedMethod1(); });
        Thread t2 = new Thread(()->{ obj.synchronizedBlockMethod2(); });
        Thread t3 = new Thread(()->{ obj.NormalMethod3(); });

        t1.start();
        t2.start();
        t3.start();

        // Steps (Working Explained)
        // t1
        // "obj" -> Monitor lock applied ! -> by thread1
        // O/P = "Inside synchronized method - 1"
        // t1 -> goes to Timed Waiting state for 10 sec
        // After 10 sec -> O/P = "Execution finished synchronized method - 1"

        // t2
        // "Inside method - 2"
        // thread-t2 cannot go in synchronized block of "obj", since Monitor locks is not released on "obj"
        // After 10 sec, when lock is released on "obj"
        // t2 -> goes to synchronized block
        // O/P = "Inside synchronized block - 2"
        // O/P = "Execution finished synchronized method - 2"

        // t3
        // "Inside Normal method - 3"


        // --------Output---------------------------------
        // "Inside synchronized method - 1"
        // "Inside method - 2"
        // "Inside Normal method - 3"
        // ----- After 10 sec ---------
        // "Execution finished synchronized method - 1"
        // "Inside synchronized block - 2"
        // "Execution finished synchronized method - 2"
    }


}
