package Thread_Join;

class Sample {

    int data;
    public Sample(int data) {
        this.data = data;
    }

    public int getData() {
        System.out.println("getData invoked start");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e) {

        }
        System.out.println("getData invoked end");
        return data;
    }

};


public class Main {

    public static void main(String [] args) {

        // 1. join
        // Waits for the thread , before continuing the task of current thread

        // Without join
        Sample sampleObj = new Sample(100);
        Thread t1 = new Thread(()-> {
            sampleObj.getData();
        });

        System.out.println("main thread execution start");

        t1.start(); // execution does not wait here for thread - t1 to complete.

        System.out.println("main thread execution end");


        // With join
        System.out.println("------------With Join------------------");
        Thread t2 = new Thread(()-> {
            sampleObj.getData();
        });

        t2.start();

        System.out.println("main thread execution start - 2");
        try {
            t2.join(); // main thread waits for thread - t2 to finish, only then main thread will get continue ..
        } catch (Exception e) {}

        System.out.println("main thread execution end - 2");

    }





}
