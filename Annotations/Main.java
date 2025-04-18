
// 1. @Deprecated Annotation
@Deprecated
class Student {

    @Deprecated
    public int getData() {
        return 1;
    }
}


interface TeacherInterface {
    public String getTeacherName();
}


// 4. @FunctionalInterface
@FunctionalInterface
interface Interface1 {
    public int getAge();
    // public int getData(); -> gives error if we add more than 1 abstract method
}


// 2. @Override Annotation
class Teacher implements TeacherInterface {
    @Override
    public String getTeacherName() {
        return "";
    }
}





public class Main {

    // 3. @SuppressWarnings Annotation
    @SuppressWarnings("all")
    public void StudentFunction() {
        Student s1 = new Student();
    }


    public static void main (String [] args) {

        Student s1 = new Student(); // compiler gives warning, that class is deprecated
        s1.getData(); // we get warning




        // @SafeVarargs -> used in Heap Pollution Class



    }



}
