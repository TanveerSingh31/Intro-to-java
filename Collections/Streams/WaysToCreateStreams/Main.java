package WaysToCreateStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {


    public static void main(String [] args) {

        // 1. With Collections
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(90);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);


        // Streams
        Stream<Integer> stream1 = list.stream();
        System.out.println(stream1.sorted().toList());



        // 2. With Arrays
        Integer [] arr = {10, 9, 8, 7, 6, 5, 4,3,2,1};
        Stream<Integer> stream2 = Arrays.stream(arr);
        System.out.println(stream2.sorted().toList());



        // 3. Stream.of()
        Stream<Integer> stream3 = Stream.of(1,2,3,4);
        System.out.println(stream3.sorted().toList());


        // 4. Stream.builder
        Stream.Builder<Integer> streamBuilderObj = Stream.builder();
        streamBuilderObj.add(10).add(20).add(30);

        Stream<Integer> stream4 = streamBuilderObj.build();
        System.out.println(stream4.sorted().toList());


    }

}
