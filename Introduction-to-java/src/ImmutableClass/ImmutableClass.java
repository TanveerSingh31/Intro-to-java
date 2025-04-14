package ImmutableClass;

// Immutable class ->
// properties of object of this class cannot be altered after it is created
// This class cannot be inherited by any other class

import java.util.ArrayList;

final class ImmutableClass {

    // data-members must be private, final
    private final int data1;
    private final ArrayList<Integer> data2;


    public ImmutableClass(int data1, ArrayList<Integer> data2) {
        this.data1 = data1;
        this.data2 = data2;
    }


    // No setter-methods allowed

    // Only getter methods allowed -> They should also return copy of original data , not reference
    public ArrayList<Integer> getData2() {
        // return copy of the data, not returning direct reference
        return new ArrayList<Integer>(data2);
    }

}
