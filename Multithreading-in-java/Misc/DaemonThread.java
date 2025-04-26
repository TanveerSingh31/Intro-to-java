package Misc;


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



public class DaemonThread {

    public static void main(String [] args) {

        Sample obj = new Sample(100);

        Thread t1 = new Thread(()-> {
            System.out.println("Thread start");
            obj.getData();
            System.out.println("Thread end");
        });

        t1.setDaemon(true);

        System.out.println("Main start");
        t1.start();
        System.out.println("Main end");


    }


}
