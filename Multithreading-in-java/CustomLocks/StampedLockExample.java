package CustomLocks;

import java.util.concurrent.locks.StampedLock;

public class StampedLockExample {

    int a = 100;
    StampedLock stampedLockObj = new StampedLock();


    public void readData() {
        System.out.println("readData invoked");
        long stamp = stampedLockObj.tryOptimisticRead();

        try{
            Thread.sleep(5000);
        }catch(Exception e){}

        if(stampedLockObj.validate(stamp)){
            a = 200;
            System.out.println("updated the resource");
        }
        else{
            System.out.println("Rollback, as resource updated by another thread");
        }

    }



    public void writeData(int data) {
        System.out.println("Write Data invoked");
        long stamp = stampedLockObj.writeLock();
        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        this.a = data;
        stampedLockObj.unlockWrite(stamp);
    }





    public static void main(String [] args){

        // Stamped lock contains all method of the read-write lock

        // optimistic locking
        // If while the thread is doing optimistic read -> some other thread has updated the resource
        // When Optimistic lock will validate before updating -> it will return false
        // Hence we have to rollback

        StampedLockExample obj = new StampedLockExample();

        Thread t1 = new Thread(()->{
            obj.readData();
        });

        Thread t2 = new Thread(()->{
            obj.writeData(1000);
        });


        t1.start();
        t2.start();

        // waiting for all threads to finish its work
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e) {

        }


        System.out.println(obj.a);


    }

}
