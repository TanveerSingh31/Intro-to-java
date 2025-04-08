public class Student {
    public
    int age;
    static int noOfStudents = 0;
    final int data = 10; // "final" makes the variable constant
    Student(int age) {
        this.age = age;
    }

    public static void main(String [] args) {

        // Variables in java

        char name = 97;
        long var = 1000L; // long must end with "L"
        float var1 = 1000.00f;
        double var3 = 10000.0000d;


        System.out.println(name);
        System.out.println(var);
        System.out.println(var1);
        System.out.println(var3);
    }

}