import java.util.Arrays;

class Car {
    public String name;
    public String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }
}


class Student implements Comparable<Student> {
    public String name;

    Student(String name) {
        this.name = name;
    }


    // Implemented compareTo method in the current class
    @Override
    public int compareTo(Student obj) {
        return this.name.compareTo(obj.name);
    }
}



public class Main {


    public static void main(String [] args) {
        Integer [] arr = {1, 2,3,4};
        Arrays.sort(arr, (Integer val1, Integer val2) -> val1-val2);

        System.out.println(arr[0].compareTo(arr[1]));

        for(Integer el : arr) {
            System.out.println(el);
        }



        Car [] carArray = new Car[3];
        carArray[0] = new Car("SUV", "petrol");
        carArray[1] = new Car("Sedan", "diesel");
        carArray[2] = new Car("Hatchback", "hybrid");

        // Sorting objects basis on their property, using custom comparator
        Arrays.sort(carArray, (Car o1, Car o2)-> o1.type.compareTo(o2.type));

        for(Car el : carArray) {
            System.out.println(el.name);
        }


        // Comparable -> Interface that concrete classes implement, It has 1 method -> compareTo
        // Used when we don't want to provide comparator explicitly while sorting arr of object of custom class
        Student [] studArray = new Student[3];
        studArray[0] = new Student("Tanveer");
        studArray[1] = new Student("Akash");
        studArray[2] = new Student("Bhavana");

        Arrays.sort(studArray);

        for(Student s : studArray) {
            System.out.println(s.name);
        }




    }


}

