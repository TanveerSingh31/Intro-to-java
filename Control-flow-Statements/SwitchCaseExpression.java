public class SwitchCaseExpression {

    // Switch Expressions - switch-case statements that return some data

    public static String switchExpression(int input) {
        // No block of code to be executed
        // only return single value from each case statement
        // No break statement required
        String output = switch(input){
            case 1 -> "One";
            case 2 -> "Two";
            default -> "";
        };

        return output;
    }



    public static String switchExpression2(int input) {
        // switch expression with block of code to be executed
        // "yield" keyword is used to return the data from the block
        String output = switch(input){
            case 1 -> {
                System.out.println("inside first block");
                yield "One";
            }
            case 2 -> {
                System.out.println("inside second block");
                yield "Two";
            }
            default -> {
                System.out.println("inside default block");
                yield "";
            }
        };

        return output;
    }



    public static void main(String [] args) {

        System.out.println(switchExpression(1));

        System.out.println(switchExpression2(1));
        System.out.println(switchExpression2(2));
        System.out.println(switchExpression2(10));
    }

}
