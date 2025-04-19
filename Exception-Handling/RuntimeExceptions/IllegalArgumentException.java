package RuntimeExceptions;

public class IllegalArgumentException {

    public static void main(String [] args) {
        int num = Integer.parseInt("2344"); // no error
        System.out.println(num);

        // NumberFormatException
        int num2 = Integer.parseInt("abcd"); // gives NumberFormatException

    }

}
