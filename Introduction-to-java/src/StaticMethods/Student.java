package StaticMethods;

public class Student {
    int name;
    static int noOfStudents = 90;

    public int getName() {
        return name;
    }

    static int getNoOfStudents() {
        // System.out.println(name); // Can't access non-static members in static method
        // getName(); // Can't access non
        return noOfStudents;
    }
}
