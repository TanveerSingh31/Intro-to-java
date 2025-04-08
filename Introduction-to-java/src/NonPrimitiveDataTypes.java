public class NonPrimitiveDataTypes {

    public static void main (String [] args) {

        Student stud1 = new Student(10);
        stud1.noOfStudents = 100; // static variable can be modified via object.

        System.out.println(stud1.data);
        //stud1.data = 199; // cannot changes (final) constant's value

        System.out.println(Student.noOfStudents);

        // 1. Class





        // 2. String -> String Constant Pool !!!
        // If same string values, variables will point to same memory location due to (String Constant Pool) in Heap.
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2); // "==" compares memory location
        System.out.println(s1.equals(s2)); // "equals()" compares values at memory location


        System.out.println(s1);
        System.out.println(s2);

        s1 = "HelloWorld"; // No effect on s2 existing memory, new memory is created in String Constant Pool and s1 is pointed to that

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2); // false

        String s3 = new String("Hello"); // new object created in heap, does not use existing memory
        System.out.println(s1 == s3); // false



        // 3. Interfaces
        // It can store reference to the object of child classes


    }

}


