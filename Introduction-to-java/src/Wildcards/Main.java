package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {


    List<Parent> parentList = new ArrayList<Parent>();
    List<Child> childList = new ArrayList<Child>();

    // Cannot directly assign child-list to parent-list obj. and vice-versa.
    // parentList = childList => X -- Wrong
    // childList = parentList => X -- Wrong

    // Wildcards Types

    // 1. Upper Bound Wildcard
    // Store Child obj. List to Parent list
    List<? extends Parent> p = childList; // No error


    // 2. Lower Bound Wildcard
    // Store Parent Obj. List to Child List
    List<? super Child> c = parentList; // No error


    // 3. Unknown Bounded Wildcard
    // It is "Object" type, so it can store obj/list/etc... of any class
    List<?> list1 = new ArrayList<Integer>();
    List<?> list2 = new ArrayList<String>();
    List<?> list3 = new ArrayList<Parent>();





}
