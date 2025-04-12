package ClassesTest;

import Classes.ChildClass;
import Classes.ConcreteClass;
// import Classes.ConcreteClassPackagePrivate;

public class Main {

    public static void main(String [] args) {

        // 1. Concrete Classes
        ConcreteClass obj = new ConcreteClass(10, 20);

        // Cannot use package private class, outside the package
        // ConcreteClassPackagePrivate obj2 = new ConcreteClassPackagePrivate();



        // 2. Abstract Classes
        ChildClass childObj = new ChildClass(100, 200);

        System.out.println(childObj.getA());
        System.out.println(childObj.getB());
        childObj.getSum(); // Implementation directly in Abstract class -> Parent

    }



}
