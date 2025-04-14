package SingletonClass;

// Instead of making the method synchronized, we check if object is not created till now, only then internal method must be synchronized
// Issues - Given in Notes
public class DoubleCheckedLocking {
    private static DoubleCheckedLocking singletonObj = null;

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {

        if(singletonObj == null) {      // check 1
            synchronized (DoubleCheckedLocking.class) {
                if(singletonObj == null) {    // check 2
                    singletonObj = new DoubleCheckedLocking();
                }
            }
        }
        return singletonObj;
    }


}
