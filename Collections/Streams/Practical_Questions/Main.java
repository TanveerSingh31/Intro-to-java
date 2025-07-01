package Practical_Questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String [] args) {

        // 1. Problem:
        // Given a list of integers, return a list containing only even numbers.
        ArrayList<Integer> mylist = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Stream<Integer> mystream = mylist.stream().filter((Integer a) -> {
            if (a % 2 == 0) return true;
            return false;
        });

        List<Integer> myListOuput = mystream.collect(Collectors.toList());

        System.out.println(myListOuput);




        // 2. Find the maximum value in a list of integers.
        ArrayList<Integer> mylist2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Optional<Integer> maxValue = mylist2.stream().max(Integer::compare);
        System.out.println(maxValue.get());



        // 3. Find sum of elements
        ArrayList<Integer> myList3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> myStream =  myList3.stream();

        // way1
        Optional<Integer> output = myStream.reduce((Integer a, Integer b) -> a+b);
        System.out.println(output.get());

        // way2
        //        Integer output2 = myStream.mapToInt(Integer::intValue).sum();



        // 4. List of name to uppercase
        List<String> names = Arrays.asList("tanveer", "singh", "ranveer", "singh");
        Stream<String> stream3 = names.stream().map((String a) -> a.toUpperCase());

        List<String> outputName = stream3.collect(Collectors.toList());
        System.out.println(outputName);


        // 5. Sort List (Increasing / Descreasing)
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(4,3,2,1,6,4));
        Stream<Integer> st = list1.stream().sorted((Integer a, Integer b) -> b-a);
        List<Integer> sortedList = st.collect(Collectors.toList());

        System.out.println(sortedList);



        // 6. Count numbers that are greater than 5
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> stream2 = list2.stream().filter((Integer a) -> a > 5);
        long ans = stream2.count();
        System.out.println(ans);


        // 7. Get distinct elements
        List<Integer> list3 = Arrays.asList(1,1,2,2,3,3,3,4,5,6,6);
        Stream<Integer> stream4 = list3.stream().distinct();
        List<Integer> output4 = stream4.collect(Collectors.toList());
        System.out.println(output4);


        // 8. Get First 5 names
        List<String> names2 = Arrays.asList("tanveer", "singh", "ranveer", "singh");
        Stream<String> streamOutput2 = names2.stream().limit(2);
        List<String> output2 = streamOutput2.collect(Collectors.toList());
        System.out.println(output2);


        // 9. Return true if all match given condition
        List<String> names3 = Arrays.asList("tanveer", "singh", "ranveer", "singh");
        Boolean streamOutput3 = names3.stream().allMatch((String a) -> a.length() >= 5);
        System.out.println(streamOutput3);


        // 10. convert 2-d array to 1-d array
        List<List<Integer>> a = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8));
        Stream<Integer> st2 = a.stream().flatMap((List<Integer> b) -> b.stream());
        List<Integer> out2 = st2.collect(Collectors.toList());

        System.out.println(out2);






    }
}
