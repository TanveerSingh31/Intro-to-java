package Classes;

public class SuperClass {

    int a,b;

    public SuperClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        System.out.println("In Super Class getA");
        return a;
    }

    public int getB() {
        System.out.println("In Super Class getB");
        return b;
    }
}
