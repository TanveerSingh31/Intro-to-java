package Classes;

// Interfaces can include only definitions, no declarations
public interface PersonInterface {


    public String getPersonName();

    public int getPersonAge();

    // Note -
    // Cannot just define static-methods in Interfaces, need to provide method body as well.
    // Because, these are'nt inherited by the child class that implements it.
    // It belongs to the Interface itself.

    //    public static int getPersonTotalCount() {
    //
    //    }

}