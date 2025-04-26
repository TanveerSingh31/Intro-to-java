package ProducerConsumerProblem;

import java.util.ArrayDeque;

public class QueueClass {

    // Fixed size buffer
    ArrayDeque<Integer> q = new ArrayDeque<Integer>(10);


    synchronized public void addElement(int el) {
        System.out.println("Inside Producer thread addElement ....");
        while(q.size() == 3){
            try{
                System.out.println("Producer thread waiting ....");
                wait();
            }
            catch(Exception e){

            }
        }

        System.out.println("Producer thread added element " + el);
        q.addLast(el);
        notifyAll();
    }


    synchronized public void getElement() {

        while(q.isEmpty()) {
            try{
                System.out.println("Consumer thread waiting ....");
                wait();
            }
            catch(Exception e) {}

        }
        int el = q.removeFirst();
        notifyAll();
        System.out.println("element retrieved by consumer = " + el);
    }

}
