package Constructors;

public class SuperChild extends SuperParent {

    int b;

    SuperChild(int a, int b) {
        super(a); // will call the parent constructor, must be at start of Child constructor
        this.b = b;
        System.out.println("Child constructor called");
    }

    public static void main (String [] args) {
        SuperChild s1 = new SuperChild(10, 20);
        System.out.println(s1.a);
        System.out.println(s1.b);
    }

}
