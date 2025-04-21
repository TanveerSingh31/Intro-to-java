import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String [] args) {
        // Some common methods of Collections

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(10);

        // .size() - size of the collection
        System.out.println(arrayList.size());

        // .contains(el) - return true/false, whether the el present in the collection
        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.contains(5));

        // .add(el) - add element to the collection

        // .remove(el) - if int provided -> treated as index
        // -> to remove actual integer, provide the integer object using wrapper class
        arrayList.remove(1);
        arrayList.remove(Integer.valueOf(3)); // deleted 3 from list

        arrayList.forEach((num) -> System.out.println(num));


        // .toArray() - converts collection to array
        Stack<Integer> stackNums = new Stack<Integer>();
        stackNums.add(10);
        stackNums.add(20);
        stackNums.add(30);

        Object [] numList =  stackNums.toArray();
        for(Object o : numList) {
            System.out.println(o);
        }



        // .addAll() -> adds items of One collection to another
        arrayList.addAll(stackNums);
        arrayList.forEach((num) -> System.out.print(num + " "));
        System.out.println(" ");


        // .removeAll() -> removes item of One collection from another
        arrayList.removeAll(stackNums);
        arrayList.forEach((num) -> System.out.print(num + " "));
        System.out.println(" ");


        // .equals() -> compares 2 collections elements
        Stack<Integer> stackNums2 = new Stack<Integer>();
        stackNums2.add(1);
        stackNums2.add(4);
        System.out.println(stackNums2.equals(arrayList));

        List<String> stringlist = new ArrayList<String>();
        stringlist.add("abc");
        stringlist.add("cbc");
        stringlist.add("vbc");

        // Err - Cannot add different datatypes collection to one another
        // arrayList.addAll(stringlist);
    }


}
