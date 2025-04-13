package Classes;

public class StaticNestedClass {

    // Classes that are created inside some other class
    public static int a = 100;
    public int b = 100;

    // static nested class
    // can access only static members of upper class inside it.
    // Access Modifier -> can also be private, protected
    public static class NestedClass {

        public int getA() {
            return a;
        }
    }

    // Private Nested Class
    private static class NestedClassPrivate {
        public int getA() {
            return a;
        }
    }
}
