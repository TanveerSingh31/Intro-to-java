package Constructors;

public class PrivateConstructor {

    static PrivateConstructor obj = null;
    int data;

    private PrivateConstructor() {
        data = 100;
    }



    // Objects can be created via this fn. only (Singleton Pattern)
    public static PrivateConstructor getObject() {
        if(obj == null) {
            // create new object & return
            obj = new PrivateConstructor();
            return obj;
        }
        else {
            // return already created obj
            return obj;
        }
    }





}
