package SingletonClass;

public class EagerLoadingSingletonClass {

    // Private Data-member stores the reference to the singleton object
    private static EagerLoadingSingletonClass singletonObj = new EagerLoadingSingletonClass();

    // Private constructor - to avoid any object creation outside the class
    private EagerLoadingSingletonClass() {
    }

    // Public method -> to access the singleton object
    // It will be static , as we need to access the object, but we already don't have the object
    // It can be accessed only via the class name
    public static EagerLoadingSingletonClass getInstance() {
        return singletonObj;
    }

}
