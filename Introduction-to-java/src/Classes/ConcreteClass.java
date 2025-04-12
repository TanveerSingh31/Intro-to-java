package Classes;

// Default: package private access modifier
public class ConcreteClass {

    int a;
    int b;

    public ConcreteClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main( String [] args) {
        ConcreteClass obj = new ConcreteClass(10, 20);
        System.out.println(obj.getA());
    }
}
