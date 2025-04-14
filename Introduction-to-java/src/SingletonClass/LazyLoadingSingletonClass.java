package SingletonClass;

// Only when getInstance() is invoked the object is created & returned -> Lazy loading
// Issues
// Multiple objects can be created, If multiple threads try to invoke getInstance() simultaneously

public class LazyLoadingSingletonClass {

    // Initialized with null, to signify no singleton obj. created till now
    private static LazyLoadingSingletonClass singletonObj = null;

    // Private constructor
    private LazyLoadingSingletonClass() {}

    // Only create the object, if not already created
    public static LazyLoadingSingletonClass getInstance() {
        if(singletonObj == null) {
            singletonObj = new LazyLoadingSingletonClass();
        }
        return singletonObj;
    }


}
