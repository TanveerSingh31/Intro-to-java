public class Main {

    public static void main(String [] args) {


        StringBuffer s = new StringBuffer("my name is ");

        s.append("Tanveer ");
        s.append("Singh");

        System.out.println(s);

        // Additional Methods

        // .insert(index, string)
        s.insert(0, "insert after - ");
        System.out.println(s);


        // .substring()
        String s2 = s.substring(3, s.length());
        System.out.println(s2);


        // .delete()
        s.delete(1, s.length()-1);
        System.out.println(s);


    }


}
