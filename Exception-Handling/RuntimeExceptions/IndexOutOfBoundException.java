package RuntimeExceptions;

public class IndexOutOfBoundException {


    public static void main(String [] args) {
        int [] arr = new int[5];
        int data = arr[5]; // will cause ArrayIndexOutOfBoundsException

        String s = "abcde";
        char data2 = s.charAt(5); // will cause StringIndexOutOfBoundsException
    }

}
