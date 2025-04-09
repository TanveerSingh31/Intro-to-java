package Constructors;

public class Main {
    public static void main(String [] args) {
        // PrivateConstructor p1 = new PrivateConstructor(); // error, as private constructors , we cannot create objects directly

        PrivateConstructor p1 = PrivateConstructor.getObject(); // getting object via the public fn. only
        // Once object created, will always return the same object only.

        System.out.println(p1);
    }
}
