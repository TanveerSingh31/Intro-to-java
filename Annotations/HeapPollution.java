import java.util.ArrayList;

public class HeapPollution {

    @SafeVarargs // Suppresses the Heap pollution warning
    public static void saveIntegerList(ArrayList<Integer>...listOfIntegerList) {
        Object [] obj = listOfIntegerList;
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Tanveer");

        // Heap Pollution occurring - storing Stringlist in List that contains List of Integers only
        obj[0] = stringList; // Keeping StringList inside List of IntegerList


        for(ArrayList<Integer> list : listOfIntegerList) {
            System.out.println(list);
        }
    }


    public static void main(String [] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        saveIntegerList(list1, list1, list1);
    }




}
