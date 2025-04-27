package CustomLocks;


import java.util.concurrent.Semaphore;

class Sample4 {

    // Maximum threads that can apply lock on the resource
    // Only 2 threads will be allowed at a time to acquire lock
    Semaphore semaphoreLockObj = new Semaphore(2);

    public void getData(){

        try{
            semaphoreLockObj.acquire();
            System.out.println("lock acquired by " + Thread.currentThread().getName() );
            Thread.sleep(4000);
            semaphoreLockObj.release();
            System.out.println("lock released by " + Thread.currentThread().getName() );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}


public class SemaphoreLock {


    public static void main(String [] args) {

        Sample4 sampleObj = new Sample4();

        Thread t1 = new Thread(()->{
            sampleObj.getData();
        });

        Thread t2 = new Thread(()->{
            sampleObj.getData();
        });
        Thread t3 = new Thread(()->{
            sampleObj.getData();
        });
        Thread t4 = new Thread(()->{
            sampleObj.getData();
        });


        // Only 2 threads will be allowed at a time to acquire lock

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }


}
