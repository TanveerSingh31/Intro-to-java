package RuntimeExceptions;

class Parent {
}


class Child extends Parent {
}

class CustomClass {
}



public class ClassCastException1 {

    public static void main(String [] args) {

        // 1. ClassCast Exception
        Object c1 = new Child();
        Parent c2 = new Child();

        // -> throws classCast exception, as the cast class is not linked to the original class
        CustomClass c3 = (CustomClass) c1;

        Object num = 1;
        String numString = (String) num;
        // -> throws classCast exception, as the cast class is not linked to the original class

    }







}
