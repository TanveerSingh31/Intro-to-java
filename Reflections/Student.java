public class Student extends Parent {

    public int age;
    public String name;
    private int privateField;


    public int getAge(int data) {
        return data;
    }

    private String getName() {
        return "Tanveer Singh";
    }

    protected String getName1() {
        return this.name;
    }

    public int getPrivateField() {
        return privateField;
    }
}


class Parent {

    private int parentField1;
}