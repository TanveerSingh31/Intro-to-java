import java.lang.reflect.*;

public class Main {

    public static void main(String [] args) {

        try {


            // Reflection - The object of the class "Class" associated with out class, is reflection of our class
            // It contains meta-data info about our class
            // Using reflection we can get details about the class , as well as we can alter the behaviour of the class


            // Methods to get Class obj for a particular class

            // 1. .forName('className') method
            Class studentClassObj = Class.forName("Student");


            // 2. .class property
            Class studentClassObj2 = Student.class;


            // 3. .getClass()
            Student sObj = new Student();
            Class studentClassObj3 = sObj.getClass();


            // Reflection contains - Metadata information regarding the class

            // Some commonly used methods
            System.out.println(studentClassObj.getName()); // getClassname

            System.out.println(Modifier.toString(studentClassObj.getModifiers())); // get class access modifier


            // Note- getDeclaredFields / getDeclaredMethods -> returns all methods/fields of current class
            // getFields / getMethods -> returns "public" fields/methods present in current and parent class

            Field[] fields = studentClassObj.getFields(); // get "public" fields present inside the class and parent class
            for (Field f : fields) {
                System.out.println(f);
            }


            // getMethods() - returns all "public" methods declared in current class + inherited methods
            Method[] methods1 = studentClassObj.getMethods();


            // getDeclaredMethods() - returns all methods (public/private/protected) declared in current class, not inherited from parent class
            Method[] methods = studentClassObj.getDeclaredMethods(); // get fields present inside the class
            for (Method m : methods) {
                System.out.println(m);
            }




            // Invoking the methods using Reflection
            Class classObjStudent = Student.class;
            Object studentObj = classObjStudent.newInstance();

            Method getAgeMethod = classObjStudent.getMethod("getAge", int.class);
            Object result = getAgeMethod.invoke(studentObj, 200);
            System.out.println("reflection invoke result = " + result);


            // Setting field value using Reflection
            Class classObjStudent2 = Class.forName("Student");
            Student sObj2 = new Student();

            // get field reference
            Field ageFieldReference = classObjStudent2.getDeclaredField("age");

            ageFieldReference.set(sObj2, 991100);

            System.out.println(sObj2.age); // getting value of age field of sObj2



            // *** IMP Setting value of "private" field using Reflection
            Field privateFieldReference = classObjStudent2.getDeclaredField("privateField");
            privateFieldReference.setAccessible(true); // *** IMP - changes the modifier internally
            privateFieldReference.set(sObj2, 99);

            System.out.println(sObj2.getPrivateField());


            // *** IMP invoke "private" method using Reflection
            Method getNameReference = classObjStudent2.getDeclaredMethod("getName");
            getNameReference.setAccessible(true); // without this, not able to invoke the private method
            System.out.println(getNameReference.invoke(sObj2));



            // *** V. IMP - Violation of Singleton using Reflection
            Class singletonClassObj = Singleton.class;
            Constructor[] constructors = singletonClassObj.getDeclaredConstructors();

            for(Constructor c : constructors) {
                c.setAccessible(true); // make the constructor public internally

                Object obj = c.newInstance(); //  we can create object of Singleton class
                System.out.println("singleton object = " + obj);
            }


        }  catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


    }


}
