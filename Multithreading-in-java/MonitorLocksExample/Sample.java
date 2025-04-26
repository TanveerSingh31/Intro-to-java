package MonitorLocksExample;

public class Sample {

    boolean isDataPresent = false;

    synchronized public void addData() {
        System.out.println("Producer Thread invoked");
        try {
            System.out.println("Producer Thread sleeping..");
            Thread.sleep(5000); // does not release monitor locks
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // After 5 secs.....

        isDataPresent = true;
        System.out.println("Producer Thread awake, and notify all waiting threads");
        notifyAll(); // this makes all threads in waiting state , back to runnable state
    }

    synchronized public void getData()  {
        System.out.println("Consumer Thread invoked");
        if(!isDataPresent) {
            System.out.println("Consumer Thread waiting.., data not present !");
            try {
                wait(); // thread is waiting , releases monitor locks on the object
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Data retrieved by consumer thread ");
        isDataPresent = false;
    }
}
