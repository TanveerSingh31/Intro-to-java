

// These are Errors caused due to memory shortage i.e memory leak
public class Error {


    public static void main(String [] args) {
        // throws error, due to heap full
        // String constant pool full
        String [] arr = new String[100000000 * 100000000 * 1000000000];
    }

}
