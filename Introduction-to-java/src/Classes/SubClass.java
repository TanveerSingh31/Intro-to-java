package Classes;

public class SubClass extends SuperClass {

    int c, d;
    public SubClass(int a, int b, int c, int d) {
        super(a,b);

        this.c = c;
        this.d = d;
    }

    @Override
    public int getA() { return a; }

    @Override
    public int getB() { return b; }

    public int getC() {
        return c;
    }

}
