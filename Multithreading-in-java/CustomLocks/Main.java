package CustomLocks;


class Sample {

    synchronized public void getData() {
        System.out.println("Lock acquired by thread " + Thread.currentThread().getName());

        try{
            Thread.sleep(4000);
        } catch (Exception e) {

        }

        System.out.println("Lock released by thread " + Thread.currentThread().getName());
    }

}


public class Main {

    public static void main(String [] args) {
        Sample sampleObj = new Sample();
        Sample sampleObj2 = new Sample();

        Thread t1 = new Thread(()->{
            sampleObj.getData();
        });


        Thread t2 = new Thread(()->{
            sampleObj2.getData();
        });


        t1.start();
        t2.start();
    }


}
