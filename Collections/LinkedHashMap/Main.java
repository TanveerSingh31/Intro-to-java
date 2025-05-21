import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String [] args) {

        // Insertion Order LinkedHashMap - Default
        Map<Integer, Integer> mp = new LinkedHashMap<>();

        mp.put(1, 100);
        mp.put(10, 200);
        mp.put(3, 900);

        // We get same order , in which el's were inserted
        mp.forEach((Integer key, Integer value) -> {
            System.out.println("key - " + key + " : value - " + value);
        });


        // Access Order LinkedHashMap
        Map<Integer, Integer> mpAccessOrder = new LinkedHashMap<>(10, 0.75F, true);

        mpAccessOrder.put(1, 100);
        mpAccessOrder.put(10, 200);
        mpAccessOrder.put(3, 900);
        mpAccessOrder.put(5, 100);
        mpAccessOrder.put(8, 200);
        mpAccessOrder.put(7, 900);

        mpAccessOrder.get(10); // this pushes the 10 node, to end of LL
        // As it is recently accessed

        System.out.println("Access Order LinkedHashmap");
        // We get same order , in which el's were inserted
        mpAccessOrder.forEach((Integer key, Integer value) -> {
            System.out.println("key - " + key + " : value - " + value);
        });



    }

}
