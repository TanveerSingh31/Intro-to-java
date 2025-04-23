import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String [] args) {


        // List - Interface, implemented by ArrayList class, therefore it can hold reference to it.
        List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);


        // Iterating on objects of collection using Iterable obj methods

        // Method-1
        // .iterator() -> method to get iterator object of a collection
        Iterator<Integer> iteratorObj = values.iterator();

        // Iterator Object - Methods
        // 1. hasNext() - returns true/false, if there is more elements present in the collection
        while(iteratorObj.hasNext()) {

            //2 .next() - returns the value of next element, also updates the iterator object to next element
            int num = iteratorObj.next();

            //3 .remove() - removes the object from the collection that the Iterator object points to.
            if(num == 2) {
                iteratorObj.remove();
            }

            System.out.println(num);

        }



        // Method-2
        // Using for loop
        for(int val : values) {
            System.out.println(val);
        }


        // Method-3
        // Using forEach - method -> accepts lambda expression
        values.forEach((Integer num) -> { System.out.println(num); });


    }


}
