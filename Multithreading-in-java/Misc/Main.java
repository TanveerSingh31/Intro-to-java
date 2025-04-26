package Misc;

public class Main {

    public static void main(String [] args) {
        // Thread Priority
        Thread t1 = new Thread(()->{
            System.out.println("Thread1 executed");
        });

        Thread t2 = new Thread(()->{
            System.out.println("Thread2 executed");
        });

        Thread t3 = new Thread(()->{
            System.out.println("Thread3 executed");
        });

        t1.setPriority(2);
        t2.setPriority(1);
        t3.setPriority(9);

        t1.start();
        t2.start();
        t3.start();

    }

}
