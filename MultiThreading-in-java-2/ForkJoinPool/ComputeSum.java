package ForkJoinPool;

import java.util.concurrent.RecursiveTask;


// Example - ComputeSum returns sum of numbers in a given range

public class ComputeSum extends RecursiveTask<Integer> {

    int start;
    int end;

    public ComputeSum(int start, int end) {
        this.start = start;
        this.end = end;
    }


    // This method will be invoked by the Fork-Join Pool, when we submit any task to it.
    // This method will also be invoked for sub-tasks, when we .fork() it
    @Override
    protected Integer compute() {

        // base case
        if(end - start <= 4) {
            int sum = 0;
            for(int i=start; i<=end; i++){
                sum += i;
            }
            return sum;
        }

        int mid = (start + end) / 2;

        // split current task into sub-tasks
        ComputeSum left = new ComputeSum(start, mid);
        ComputeSum right = new ComputeSum(mid+1, end);

        // This calls compute() on the left & right sub-tasks
        left.fork();
        right.fork();

        // Waiting for the result by joining the Sub-tasks threads of both the subtasks before continuing further
        int leftAns = left.join();
        int rightAns = right.join();

        return leftAns + rightAns;
    }
}
