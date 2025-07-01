package Practical_Questions;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {

        // 1. Get all even numbers
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> s = list.stream().filter((Integer a) -> a % 2 == 0);
        List<Integer> output = s.collect(Collectors.toList());
        System.out.println(output);



        // ****IMP******
        // 2. Find numbers starting with 1
        List<Integer> list2 = Arrays.asList(1,2,13, 14, 5,6 , 17);
        Stream<Integer> s2 = list2.stream().filter((Integer a) -> {
           String b = a + "";
           if(b.startsWith("1")) return true;
           return false;
        });

        System.out.println(s2.collect(Collectors.toList()));



        // ****IMP******
        // 3. Find duplicate elements in array
        List<Integer> list3 = Arrays.asList(1,1,2,3,4,4,4,5);
        Set<Integer> st = new HashSet<>();

        Stream<Integer> s3 = list3.stream().filter((Integer a) -> {
            if(st.contains(a)) return true;
            else{
               st.add(a);
               return false;
            }
        }).distinct(); // distinct to only return unique elements in case , same element present multiple times
        System.out.println(s3.collect(Collectors.toList()));



        // 3. Find first element in array
        List<Integer> list4 = Arrays.asList(1,1,2,3,4,4,4,5);
        Set<Integer> st2 = new HashSet<>();

        Optional<Integer> s4 = list3.stream().findFirst();
        System.out.println(s4.get());



        // 4. Find total no. of elements present in list
        List<Integer> list5 = Arrays.asList(1,1,2,3,4,4,4,5);
        long count = list5.stream().count();
        System.out.println(count);



        // 5. Find maximum
        List<Integer> list6 = Arrays.asList(1,1,2,3,4,4,4,5);
        Optional<Integer> val = list6.stream().max((Integer a, Integer b) -> a-b);
        System.out.println(val.get());


        // ****V.V.IMP******
        // 6. Given a String, find first non-repeating character in it
        String sample = "Java articles are Awesome";
        Optional<Character> ans =  sample.chars().mapToObj(a -> (char) a)
                .filter(a -> sample.indexOf(a) == sample.lastIndexOf(a))
                        .findFirst();

        System.out.println(ans.get());




    }
}
