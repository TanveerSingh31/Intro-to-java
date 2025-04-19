package RuntimeExceptions;

public class NullPointerException {


    public static void main(String [] args) {
        String s = null;
        s.charAt(0); // causes NullPointer Exception
    }

}
