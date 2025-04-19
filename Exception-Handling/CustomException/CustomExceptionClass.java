package CustomException;

public class CustomExceptionClass extends Exception {

    CustomExceptionClass(String exceptionMessage) {
        super(exceptionMessage);
    }

    public static void method2() throws CustomExceptionClass {
        // we can create new CustomExceptionClass objects and throw them
        throw new CustomExceptionClass("Error from method2");
    }

    public static void method1() {
        try{
            method2();
        }
        catch(CustomExceptionClass e) {
            System.out.println("Inside catch block " + e);
        }

    }


    public static void main(String [] args) {
        method1();
    }

}
