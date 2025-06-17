import java.util.LinkedList;

public class Main {

    public static void main(String [] args) {
        LinkedList<Integer> llObj = new LinkedList<>();

        // Deque Methods
        llObj.addLast(1);
        llObj.addFirst(2);

        while(llObj.size() > 0) {
            System.out.println(llObj.pollLast());
        }



        // List Methods

        LinkedList<Integer> llObj2 = new LinkedList<>();
        llObj2.add(1);
        llObj2.add(0, 100);
        llObj2.add(1, 200);
        llObj2.add(1);

        System.out.println(llObj2.get(1));

        llObj2.remove((Integer) 1);
        System.out.println(llObj2.indexOf(200)); // 1

        llObj2.forEach((Integer a)->{
            System.out.println(a);
        });

        // 100, 200, 1
        for(Object el : llObj2) {
            System.out.println(el);
        }



    }



}
