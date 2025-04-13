package ClassesTest;

import Classes.*;
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


        // Interface
        PersonClass p1 = new PersonClass("Tanveer", 23);
        System.out.println(p1.getPersonAge());
        System.out.println(p1.getPersonName());
        p1.sayHello();




        // 3. Super-class & Sub-class
        SuperClass superObj = new SuperClass(1,2);
        SubClass subObj = new SubClass(1,2,3,4);

        System.out.println(superObj.getA());
        System.out.println(superObj.getB());

        // Got invoked on the child-class methods
        System.out.println(subObj.getA());
        System.out.println(subObj.getB());
        System.out.println(subObj.getC());

        // Even super-classes that are standalone classes, inherit from "Object" class in java, Implicitly
        System.out.println(superObj.getClass());

        // IMP Note - We can store the object of any class, in Object Class Datatype
        Object superObj2 = superObj;
        Object subObj2 = subObj;


        // 4. Nested Classes -> 2 types
        // Classes that are created inside some other class
        // - Static nested class
        // - Inner Class

        // a. Static Nested Class

        // Created object of Nested Class
        StaticNestedClass.NestedClass nestedClassObj = new StaticNestedClass.NestedClass();
        System.out.println(nestedClassObj.getA());





        // b. Inner Class -> 3 types
        // It can be access only via the object of the outer class

        // b.1 -> Member Inner Class
        InnerClass outerObj = new InnerClass();
        InnerClass.MemberInnerClass memberInnerClassObj = outerObj.new MemberInnerClass();

        System.out.println(memberInnerClassObj.getAB());



        // b.2 -> Local Inner Class
        // Cannot be used from outside
        outerObj.accessLocalInnerClass();



        // b.3 -> Anonymous Class
        outerObj.accessAnonymousClass();


















    }



}
