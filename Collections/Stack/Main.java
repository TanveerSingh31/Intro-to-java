import java.util.Stack;

public class Main {

    public static void main(String [] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(9);
        st.push(8);
        st.push(7);
        st.push(6);

        System.out.println(st.peek());
        System.out.println(st.pop());

        System.out.println(st.search(8));

        while(!st.empty()) {
            System.out.println(st.pop());
        }


        System.out.println("------List Methods ------");

        // List methods
        Stack<Integer> st2 = new Stack<>();
        st2.add(1);
        st2.add(2);
        st2.add(3);
        st2.add(0, 100);

        st2.remove((Integer) 2);

        while(!st2.empty()) {
            System.out.println(st2.pop());
        }
    }



}
