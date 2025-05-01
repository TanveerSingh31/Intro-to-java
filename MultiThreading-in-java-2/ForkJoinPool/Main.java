package ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Main {

    public static void main(String [] args) {
        ForkJoinPool forkJoinThreadPool = new ForkJoinPool();
        Future<Integer> futureObj = forkJoinThreadPool.submit(new ComputeSum(0, 100));

        try{
            System.out.println(futureObj.get());
        }
        catch(Exception e) {

        }
    }

}
