package Methods;

public class AccessModifier {

    // public : can be accessed by any class in any package
    public int getAge() {
        return 1;
    }

    // private : can be accessed only in this class
    private int getAgePrivate() {
        return 2;
    }


    // protected : can be accessed by classes in this package + Can be accessed by sub-classes in other packages
    protected int getAgeProtected() {
        return 3;
    }


    // Default : If no access modifier is assigned, Java automatically assign Protected to the method
    //           It can be access by classes in the same package only.

    int getAgeDefault() {
        return 4;
    }

}