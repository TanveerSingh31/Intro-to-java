import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {


    public static void main(String [] args) {

        // Order is not guaranteed
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(10);
        hs.add(2);
        hs.add(4);
        hs.add(null);

        hs.forEach((Integer a) -> {
            System.out.println(a);
        });





        // Follows Insertion order
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(10);
        lhs.add(5);
        lhs.add(null);

        System.out.println("linked has set output");
        lhs.forEach((Integer a) -> {
            System.out.println(a);
        });



        // Sorted Order
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(9);
        ts.add(8);
        ts.add(7);
        // ts.add(null); // gives error, cannot add null in tree set


        System.out.println("Tree set output");
        ts.forEach((Integer a) -> {
            System.out.println(a);
        });




        // Commonly used methods
        hs.addAll(lhs);
        System.out.println(hs);

        // retains intersection of hs and lhs
        hs.retainAll(lhs);
        System.out.println(hs);






    }


}
