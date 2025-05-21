import java.util.HashMap;

public class Main {

    public static void main(String [] args) {



        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        myHashMap.put(1, 100);

        System.out.println(myHashMap.get(1));

        System.out.println(myHashMap.isEmpty());
    }


}
