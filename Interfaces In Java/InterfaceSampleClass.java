interface InterfaceSample {
    int data = 123;
    public int getData();

    // IMP !!!!
    // Note - Java8+ - Feature
    // If method access-specifier = default , then we must provide method implementation in interface itself.
    // Not important for child-class to implement this method
    default int getDataDefault() {
        return 1;
    }

}



public class InterfaceSampleClass implements InterfaceSample {


    int data = 100;

    public int getData() {
        return data;
    }


    public static void main(String [] args) {
        int data2 = InterfaceSample.data;
    }
}
