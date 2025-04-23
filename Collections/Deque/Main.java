import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main (String [] args) {

        // ArrayDeque -> concrete class that implements Deque interface

        ArrayDeque<Integer> q = new ArrayDeque<Integer>();

        // Insertion
        q.addLast(1);
        q.addFirst(2);
        q.offerLast(3);

        System.out.println("Elements in queue");
        while(!q.isEmpty()){
            int num = q.pollFirst(); // removes element from deque
            System.out.println(num); // 2 1 3
        }




        ArrayDeque<Integer> q2 = new ArrayDeque<Integer>();

        // Insertion
        q2.addLast(1);
        q2.addFirst(2);
        q2.offerLast(3);

        // Get methods
        System.out.println("Elements in queue");
        System.out.println(q2.peekFirst()); // 2
        System.out.println(q2.peekLast()); // 3

        System.out.println(q2.size()); // 3


        // Thread safe version of Deque & priorityQueue
        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque= new ConcurrentLinkedDeque<Integer>();
        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

    }


}
