package ProducerConsumerProblem;

public class Main {

    public static void main(String[] args) {

        QueueClass obj = new QueueClass();

        Thread producer = new Thread(()->{
            obj.addElement(10);
            obj.addElement(20);
            obj.addElement(30);
            obj.addElement(40); // thread will wait
        });

        Thread consumer = new Thread(()->{
            obj.getElement(); // 10
            obj.getElement(); // 20
            obj.getElement(); // 30
            obj.getElement(); // 40
        });

        producer.start();
        consumer.start();


        // Output
        // 3 Times
        // Inside Producer thread addElement ....
        // Producer thread added element el

        // "Producer thread waiting ...."

        // "element retrieved by consumer = " + el - 10

        // "Producer thread added element " + el - 40

        // "element retrieved by consumer = " + el - 20
        // "element retrieved by consumer = " + el - 30
        // "element retrieved by consumer = " + el - 40


    }

}
