package CustomLocks;


import java.util.concurrent.locks.ReentrantLock;

class Sample2 {

    public void getData(ReentrantLock lockObj) {
        try{
            System.out.println("--------getData start--------" + Thread.currentThread().getName());

            // block of code - locked by Reentrant lock
            lockObj.lock(); // method to lock the block of code, no other thread can access this block now

                System.out.println("--------getData inside lock--------" + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("--------getData outside lock--------" + Thread.currentThread().getName());

            lockObj.unlock(); // method to unlock the lock.

            System.out.println("--------getData end--------" + Thread.currentThread().getName());


        } catch (Exception e) {

        }

    }

};



public class ReentrantLockExample {

    public static void main(String [] args) {

        // lock object from ReentrantLock Class
        ReentrantLock lockObj = new ReentrantLock();

        // Need to pass this same ReentrantLock Object, while invoking the method for different object

        Sample2 sampleObj1 = new Sample2();
        Thread t1 = new Thread(()->{
            sampleObj1.getData(lockObj);
        });

        Sample2 sampleObj2 = new Sample2();
        Thread t2 = new Thread(()->{
            sampleObj2.getData(lockObj);
        });

        // Even if they are using different objects
        // We can restrict the thread going in block of code, using Reentrant locks
        t1.start();
        t2.start();


    }
}
