package ThreadPool.ThreadPoolExecutor.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Main {


    public static void main(String [] args) {
        CompletableFuture<String> completableFutureObj = CompletableFuture.supplyAsync(()->{
            System.out.println("inside thread pool");
            return "data";
        });

        try{
            System.out.println(completableFutureObj.get());
            System.out.println("inside main thread");
        }
        catch(Exception e) {
        }



        // Chaining of completeFuture

        // thenApply() -> task executed by same thread, as previous chain task
        // thenApplyAsync() -> task executed by different thread, as previous chain task

        CompletableFuture<String> completableFutureObj2 = CompletableFuture.supplyAsync(()->{
            System.out.println("inside thread pool");
            System.out.println("thread name - " + Thread.currentThread().getName());
            return "data";
        }).thenApply((String data)->{
            System.out.println("thread name - " + Thread.currentThread().getName());
            return " added data";
        });

        try{
            System.out.println(completableFutureObj2.get());
            System.out.println("inside main thread");
        }
        catch(Exception e) {
        }




        // thenCompose()
        // used when data from 1 async. operation used in another async operation
        // ordering of executing the async operations

        CompletableFuture<String> completableFutureObj3 = CompletableFuture.supplyAsync(()->{
            System.out.println("inside async method - 1");
            System.out.println("thread name - " + Thread.currentThread().getName());
            return "data";
        }).thenCompose((String data)->{

            return CompletableFuture.supplyAsync(() -> {
                System.out.println("inside another async operation");
                return "data2";
            });
        });

        try{
            System.out.println(completableFutureObj3.get());
        }
        catch(Exception e) {
        }





        // .thenCombine()
        // used to combine results of multiple CompletableFuture objects

        CompletableFuture<String> obj1 = CompletableFuture.supplyAsync(()->{
            return "data1";
        });

        CompletableFuture<String> obj2 = CompletableFuture.supplyAsync(() -> {
            return " data2";
        });

        CompletableFuture<String> obj3 = obj1.thenCombine(obj2, (String a, String b) -> a+b);

        try{
            System.out.println(obj3.get()); // "data1 data2"
        }
        catch(Exception e) {

        }








    }

}
