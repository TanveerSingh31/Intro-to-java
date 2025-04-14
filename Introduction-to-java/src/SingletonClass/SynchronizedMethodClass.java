package SingletonClass;

// Synchronized method - this method will only allow 1 thread at a time to access the method (lock/Unlock)
// Issues
// All threads invoking getInstance() , will have to apply lock -> More latency

public class SynchronizedMethodClass {

    private static SynchronizedMethodClass singletonObj = null;

    private SynchronizedMethodClass() {}

    // Made method synchronized to avoid multiple threads trying to access the method simultaneously
    synchronized public static SynchronizedMethodClass getInstance() {
        if(singletonObj == null) {
            singletonObj = new SynchronizedMethodClass();
        }
        return singletonObj;
    }

}
