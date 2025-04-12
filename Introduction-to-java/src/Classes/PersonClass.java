package Classes;

public class PersonClass implements PersonInterface {

    String name;
    int age;

    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implementing methods in Child-Class
    public String getPersonName() {
        return name;
    }

    public int getPersonAge() {
        return age;
    }

    // We can define additional methods in child-class as well
    public void sayHello() {
        System.out.println("Hello " + name);
    }

}
