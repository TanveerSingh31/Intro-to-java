package StaticMethods;

public class Main {
    public static void main (String [] args) {
        Student s1 = new Student();
        System.out.println(Student.getNoOfStudents()); // static methods can be invoked via Class
        System.out.println(s1.getNoOfStudents()); // static methods can be invoked via object

    }
}
