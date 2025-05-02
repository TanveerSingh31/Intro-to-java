public class Main {


    public static void main(String [] args) {

        ThreadLocal<String> threadLocalObj = new ThreadLocal<String>();

        // threadLocalObj -> it will store the local variables for different threads

        threadLocalObj.set("main thread local variable value");
        System.out.println(threadLocalObj.get());


        Thread t1 = new Thread(()->{
           threadLocalObj.set("new thread local variable value");
           System.out.println(threadLocalObj.get());

           threadLocalObj.remove(); // this removes the thread local variable of current thread
            System.out.println(threadLocalObj.get());
        });

        t1.start();

    }

}
