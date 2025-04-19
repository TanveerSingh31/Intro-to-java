package CompileTimeExceptions;

// Methods to handle the error - throws , try-catch, finally
public class Main {

    public static void main(String [] args) {
        method1();
        method4(); // Since, method1(), handled the error, program will not quit, method4() will get executed !
    }


    // 1. using "throws" Keyword
    // Note -
    // "throws" keyword tells the compiler,
    // Current method might throw this exception &
    // Current method will not handle the exception inside itself.
    // Other methods that are calling this Method, need to handle these exception inside them.
    public static void method2() throws ClassNotFoundException {
        // throws compile time exception
        throw new ClassNotFoundException();
    }


    // 2. using Try-Catch Block
    // Method1 - handling the error inside itself
    public static void method1(){
        try{
            method2();
        }
        // Multiple Exceptions in single catch block
        catch(ClassNotFoundException | ClassCastException e) {
            System.out.println(e);
        }
    }



    // Finally Block
    public static void method4() {
        try{
            method2();
            return;
        }
        catch(Exception e) { // This can accommodate any exception , It is the "parent" class of all exceptions
            System.out.println("Inside catch block" + e);
        }
        finally { // Gets executed always
            System.out.println("Inside finally block");
        }
    }



}
