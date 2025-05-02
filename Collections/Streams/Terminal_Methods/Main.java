package Terminal_Methods;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String [] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(100);
        arrayList.add(50);
        arrayList.add(10);


        // Terminal Methods in Streams


        // 1. toArray
        Stream<Integer> streamList = arrayList.stream();
        Integer[] outputData = streamList.filter((Integer n) -> n > 10).toArray((int size) -> new Integer[size]);
        for(int n: outputData){
            System.out.println(n);
        }


        // 2. reduce
        Stream<Integer> streamList2 = arrayList.stream();
        Optional<Integer> output =  streamList2.reduce((Integer a, Integer b) -> a+b);
        System.out.println(output.get());


        // 3. min,max
        Stream<Integer> streamList3 = arrayList.stream();
        Optional<Integer> output2 = streamList3.min((Integer a, Integer b)-> a-b);
        System.out.println(output2.get());




    }
}
