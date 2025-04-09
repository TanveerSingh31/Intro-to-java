public class VariableArgsFn {

    public static int getSum(int ...nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }


    public static void main (String [] args) {
        System.out.println(VariableArgsFn.getSum(1,2,3,4));
        System.out.println(VariableArgsFn.getSum(1,2));
        System.out.println(VariableArgsFn.getSum(1,2,3,4,5,6,7,8,9));
        System.out.println(VariableArgsFn.getSum(1));
        System.out.println(VariableArgsFn.getSum());
    }
}
