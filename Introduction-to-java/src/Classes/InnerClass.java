package Classes;


public class InnerClass {

    public int a = 100;
    public static int b = 200;

    // Inner Classes are not bound to static members , they can access any member of the class

    // 1. Member Inner Class
    public class MemberInnerClass {
        public int getAB() {
            return a+b;
        }
    }


    // 2. Local Inner Class
    // Class created inside any block, if-block, for-block, while-block, method etc..
    public void accessLocalInnerClass() {

        int c = 500;

        // Local Inner Class
        // Access modifier -> can only be default
        class LocalInnerClass {
            public void printData() {
                // can access members of Upper Class + variables created in the above method
                System.out.println("Inside local Inner Class " + (a+b+c));
            }
        }

        LocalInnerClass localInnerClassObj = new LocalInnerClass();
        localInnerClassObj.printData();
    }



    // 3. Anonymous Inner Class

    public abstract class Abstract {
        public abstract int sayHello();
    }


    public void accessAnonymousClass() {
        // We have not created a new class, itself.
        // Therefore Java has implicitly created an Anonymous Class.
        Abstract obj = new Abstract() {

            // Added the implementation of methods of Abstract Class
            @Override
            public int sayHello() {
                System.out.println("Hello from Anonymous Class");
                return 0;
            }
        };

        obj.sayHello();
    }



}
