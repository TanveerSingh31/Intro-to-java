interface Student {
    public String getStudentName();
    default int getStudentAge();
}

public abstract class AbstractClassWithInterface implements Student {

    @Override
    public String getStudentName() {
        return "Tanveer";
    }

    @Override
    public abstract int getStudentAge();


    public static void main(String [] args) {
        ScienceStudent s1 = new ScienceStudent();
        System.out.println(s1.getStudentAge());
        System.out.println(s1.getStudentName());
    }
}



class ScienceStudent extends AbstractClassWithInterface {

    @Override
    public int getStudentAge() {
        return 1;
    };
}



