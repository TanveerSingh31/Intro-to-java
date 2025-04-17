package FunctionalInterface;

// Functional Interface - Interface containing only 1 abstract not more than that

// @FunctionalInterface -> Adds Restriction on interface to follow Functional Interface properties
@FunctionalInterface
public interface FunctionalInterfaceSample {

    int getData();
    //  int getData2(); -> gives error , as we cannot define more than 1 abstract interface

    // other methods -> must contain body , to exist in Functional interface
    default int getData3() {
        return 100;
    }

    static int getData4() {
        return 200;
    }


    // Note - It can have contain Object Class Methods as well.
    String toString();
}

@FunctionalInterface
interface Sample2{

    String getData(String data);
}