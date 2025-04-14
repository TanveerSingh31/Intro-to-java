package SingletonClass;

public class EagerLoadingSingletonClass {

    // Private Data-member stores the reference to the singleton object
    private static EagerLoadingSingletonClass singletonObj = new EagerLoadingSingletonClass();

    // Private constructor - to avoid any object creation outside the class
    private EagerLoadingSingletonClass() {
    }

    // Public method -> to access the singleton object
    public EagerLoadingSingletonClass getInstance() {
        return singletonObj;
    }

}
