package CustomLocks;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Sample5 {

    boolean isLockAcquired = false;
    ReentrantLock lockObj = new ReentrantLock();
    Condition condition = lockObj.newCondition();



    public void acquireLockMethod(){
        System.out.println("Inside Acquire lock start");
        lockObj.lock();
        if(isLockAcquired) {
            try {
                System.out.println("Waiting for lock to release");
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{

            lockObj.unlock();
            condition.signal();
        }


    }



};


public class Conditions {

    public static void main(String [] args) {

        Sample5 obj = new Sample5();


        Thread t1 = new Thread(()->{
            obj.acquireLockMethod();
        });

        Thread t2 = new Thread(()->{
            obj.acquireLockMethod();
        });

        Thread t3 = new Thread(()->{
            obj.acquireLockMethod();
        });







    }


}
