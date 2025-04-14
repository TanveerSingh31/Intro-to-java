package SingletonClass;

// Similar to Eager-Loading but better
public class BillPughSolution {

    private BillPughSolution() {}

    // private static nested class -> does not load until accessed
    // Private -> cannot be accessed from outside
    private static class Helper {
        // Private -> cannot be accessed directly outside the class
        // final -> value cannot be re-assigned
        private static final BillPughSolution singletonObj = new BillPughSolution();
    }


    public static BillPughSolution getInstance() {
        return Helper.singletonObj;
    }



}
