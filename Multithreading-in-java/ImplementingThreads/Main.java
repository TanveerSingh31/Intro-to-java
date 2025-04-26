package ImplementingThreads;

// 1. Implementing Runnable interface
class RunnableClass implements Runnable {
    // This method will be invoke the the thread object
    @Override
    public void run() {
        System.out.println("Task executed by another thread using Runnable " +  Thread.currentThread().getName());
    }

}


// 2. extends "Thread" Class
class Parent extends Thread {

    // we must override the run method inside the class
    @Override
    public void run() {
        System.out.println("Task executed by another thread using Thread class" + Thread.currentThread().getName());
    }
}



public class Main {

    public static void main(String [] args) {

        // using "Runnable" Interface
        // Steps
        RunnableClass runnableObj = new RunnableClass();
        Thread threadObj = new Thread(runnableObj);

        threadObj.start();
        System.out.println("Task completed " + Thread.currentThread().getName());




        // Using "Thread" Class
        // Steps
        Parent parentObj = new Parent();
        parentObj.start();


    }



}
