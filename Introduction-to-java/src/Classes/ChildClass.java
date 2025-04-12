package Classes;

public class ChildClass extends AbstractClass {

    public ChildClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Implementing the Abstract Methods, in Child-class

    @Override
    public int getA() {
        return a;
    }

    @Override
    public int getB() {
        return b;
    }

}
