package Classes;

// Super-Classes that contain method declaration to be implemented by Child-class
// It can contain Method definition as well.

public abstract class AbstractClass {

    int a, b;

    // Abstract Methods -> Contains only method-declaration
    public abstract int getA();
    public abstract int getB();

    // Normal Methods -> Contains method definition as well, No need to implement in child class
    public void getSum() {
        // this -> points to Child Object via which getSum() is called.
        System.out.println("data in Abstract class " + this.a);
    }

}
