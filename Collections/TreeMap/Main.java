import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String [] args ){

        // strores el's in sorted order
        TreeMap<Integer, Integer> mp = new TreeMap<>();


        mp.put(10, 100);
        mp.put(5, 50);
        mp.put(3, 10);
        mp.put(2, 100);
        mp.put(1, 50);
        mp.put(0, 10);

        // Returns in sorted order - ascending
        mp.forEach((Integer key, Integer val) -> {
            System.out.println("key - " + key + ", Val - " + val);
        });



        // sub-map methods

        Map<Integer, Integer> subMap1 = mp.headMap(5); // {3, 10}, {0, }, {1, }, {2 , }
        Map<Integer, Integer> subMap2 = mp.tailMap(5); // {5, 50} , {10, 100}




        // Navigable methods

        Map.Entry<Integer, Integer> output = mp.lowerEntry(3);
        Integer output2 = mp.lowerKey(3);

        System.out.println("");

    }

}
