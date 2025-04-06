public class Conversions {
    public static void main(String [] args) {

        //1. Automatic Conversion (from low byte to High byte)
        byte a = 100;
        int num = a;

        System.out.println(num);

        //2. Down casting -  Higher to Lower Byte (Explicit conversion)
        int num1 = 100;
        byte num1Byte = (byte) num1;
        System.out.println(num1Byte);

        // Note:
        int numInt = 129;
        byte num2Byte = (byte) numInt;
        System.out.println(num2Byte); // -127


        //3. Promotion
        byte x = 1;
        byte y = 127;
        byte z = (byte)(x+y); // error : we need to explicitly convert in this case.
        int xy = x+y; // 128

        System.out.println(z);
        System.out.println(xy);


        // Note : If (higher byte) + (lower byte) -> result = must be store in higher byte variable, else it must be explicitly type casted.

        int num10 = 100;
        long long10 = 1000;

        int numResult = (int) (num10 + long10); // wrong, it must be explicitly type casted.
        long numResultLong = num10 + long10; // Correct , Automatic

        System.out.println(numResult);
        System.out.println(numResultLong);


    }
}