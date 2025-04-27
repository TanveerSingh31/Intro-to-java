package CustomLocks;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class Sample3 {

    // Simultaneously multiple threads can invoke readMethod as they are using the Read lock
    public void readMethod(ReentrantReadWriteLock lockObj) {
        lockObj.readLock().lock();
        System.out.println("Read method start" + Thread.currentThread().getName());

        try{
            Thread.sleep(4000);
        } catch(Exception e) {}

        System.out.println("Read method end" + Thread.currentThread().getName());
        lockObj.readLock().unlock();
    }


    // No other thread can put any lock , if write lock is applied on the lockObj
    public void writeMethod(ReentrantReadWriteLock lockObj) {
        lockObj.writeLock().lock();
        System.out.println("Write method start" + Thread.currentThread().getName());

        System.out.println("Write method end" + Thread.currentThread().getName());
        lockObj.writeLock().unlock();
    }

}


public class ReadWriteLock {

    public static void main(String [] args) {
        ReentrantReadWriteLock lockObj = new ReentrantReadWriteLock();

        Sample3 sObj = new Sample3();
        Sample3 sObj2 = new Sample3();
        Sample3 sObj3 = new Sample3();



        // Read Threads
        Thread t1 = new Thread(()->{
            sObj.readMethod(lockObj);
        });

        Thread t2 = new Thread(()->{
            sObj2.readMethod(lockObj);
        });

        Thread t3 = new Thread(()->{
            sObj3.writeMethod(lockObj);
        });

        t1.start();
        t2.start();
        t3.start();
    }

}
