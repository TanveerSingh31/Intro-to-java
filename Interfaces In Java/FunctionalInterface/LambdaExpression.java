package FunctionalInterface;


// Implementing Functional Interface using Lambda Expression
public class LambdaExpression {

    public static void main (String [] args) {

        // No need to give return Type to the implemented function
        // No need to give name , as there is only 1 Abstract function
        // No need to create child-class from the interface, store the object directly in Interface Type
        FunctionalInterfaceSample obj = () -> {
            return 100;
        };

        System.out.println(obj.getData());



        // Functional Interface accepting arguments 
        Sample2 obj2 = (String data) -> {
            return data;
        };

        System.out.println(obj2.getData("Tanveer Singh"));

    }

}
