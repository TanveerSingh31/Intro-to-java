package Intermediate_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String [] args) {

        // Different Intermediate methods, that work with streams


        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(100);
        arrayList.add(50);
        arrayList.add(10);

        ArrayList<ArrayList<Integer>> arrayListComplex = new ArrayList<ArrayList<Integer>>(3);
        arrayListComplex.add(arrayList);
        arrayListComplex.add(arrayList);
        arrayListComplex.add(arrayList);


        Stream<Integer> streamList = arrayList.stream();

        // 1. filter
        List<Integer> output = streamList.filter((Integer n)-> n > 40).toList();
        System.out.println(output);




        Stream<Integer> streamList2 = arrayList.stream();

        // 2. map
        List<Integer> output2 = streamList2.map((Integer n)-> n+10).toList();
        System.out.println(output2);


        Stream<ArrayList<Integer>> streamList3 = arrayListComplex.stream();

        // 3. flatMap
        List<Integer> output3 = streamList3.flatMap((ArrayList<Integer> list) -> list.stream()).toList();
        System.out.println(output3);

    }

}
