package Methods2;

import Methods.AccessModifier;

public class AccessModifierTest extends AccessModifier {


    public static void main(String [] args) {
        AccessModifierTest a = new AccessModifierTest();
        System.out.println(a.getAge()); // public
        // System.out.println(a.getAgePrivate()); // Err : private method
        System.out.println(a.getAgeProtected()); // protected can be access via child classes even in diff. package
        // System.out.println(a.getAgeDefault()); // Default: can't be accessed outside the package
    }
}
