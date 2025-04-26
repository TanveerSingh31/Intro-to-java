package MonitorLocksExample;

public class Main {

    public static void main(String [] args) {


        Sample obj = new Sample();

        Thread producer = new Thread(()->{
            obj.addData();
        });


        Thread consumer = new Thread(()-> {
            obj.getData();
        });

        consumer.start();
        producer.start();


    }




}
