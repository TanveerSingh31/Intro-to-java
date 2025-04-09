package Constructors;

public class ChainingOfConstructosThis {

    int a,b;

    ChainingOfConstructosThis() {
        this(1); // it calls the constructor that matches this definition (args) : Constuctor Chaining
    }

    ChainingOfConstructosThis(int a) {
        this(a, 2);
    }

    ChainingOfConstructosThis(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public static void main(String [] args) {
         ChainingOfConstructosThis c = new ChainingOfConstructosThis();

         System.out.println(c.a);
         System.out.println(c.b);

    }
}
