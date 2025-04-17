package FunctionalInterface;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Different types of Functional Interfaces in Java (In-built)
public class TypesOfFunctionalInterface {



    public static void main(String [] args) {


        // Types of functional Interface

        // 1. Consumer -> accepts 1 argument, does not return anything
        Consumer<Integer> consumerObj = (Integer data) -> {
            System.out.println("Inside consumer Lambda expression");
        };
        consumerObj.accept(123);


        // 2. Supplier -> accepts No argument, return data
        Supplier<String> supplierObj = () -> {
            return "Output";
        };

        System.out.println(supplierObj.get());



        // 3. Function -> accepts 1 argument, return data as well.
        Function<Integer, String> functionObj = (Integer data) -> {
            return "Output from function interface";
        };
        System.out.println(functionObj.apply(1000));




        // 4. Predicate -> accepts 1 argument, return only Boolean value
        Predicate<Integer> predicateObj = (Integer data) -> {
            return true;
        };
        System.out.println(predicateObj.test(1000));

    }


}
