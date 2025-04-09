package Methods;

public class Method1 {

    public static void main(String [] args) {
        AccessModifier a = new AccessModifier();
        System.out.println(a.getAge()); // public
        // System.out.println(a.getAgePrivate()); // Err : private method

        System.out.println(a.getAgeProtected()); // protected
        System.out.println(a.getAgeDefault()); // Default : can be accessed in the same package
    }
}
