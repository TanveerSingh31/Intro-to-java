package MonitorLocks;

public class Sample {

    // Synchronized method - 1
    // synchonized method applies Monitor locks on the object
    synchronized public void  synchronizedMethod1()  {
        System.out.println("Inside synchronized method - 1");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Execution finished synchronized method - 1");
    }


    // Synchronized method - 2
    public void synchronizedBlockMethod2()  {
        System.out.println("Inside method - 2");
        synchronized (this) {
            System.out.println("Inside synchronized block - 2");
        }
        System.out.println("Execution finished synchronized method - 2");
    }


    public void NormalMethod3() {
        System.out.println("Inside Normal method - 3");
    }

}
