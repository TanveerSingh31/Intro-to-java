package EnumClass;

import java.util.List;

public class Main {

    public static void main (String [] args) {

        // 1. NORMAL ENUM CLASS
        NormalEnumClass normalMonday = NormalEnumClass.MONDAY;

        // Commonly Used functions

        // 1. enumClass.values() -> return array of the enum objects
        NormalEnumClass[] enumList =  NormalEnumClass.values();
        for(NormalEnumClass enumObj : enumList) {
            System.out.println(enumObj);
        }

        // 2. enumObj.ordinal() -> returns the value of the enum object
        for(NormalEnumClass enumObj : enumList) {
            System.out.println(enumObj.ordinal());
        }


        // 3. enumClass.valueOf(key) -> returns the entire enum object corresponding to the particular key
        System.out.println(NormalEnumClass.valueOf("MONDAY").ordinal());


        // 4. name()
        // returns the name/key of which the values is.
        NormalEnumClass mondayObj = NormalEnumClass.MONDAY;
        System.out.println(mondayObj.name());





        // 2. Enum Classes with Custom Values
        EnumWithCustomValues monday = EnumWithCustomValues.MONDAY; // returns that Enum object
        EnumWithCustomValues tuesday = EnumWithCustomValues.TUESDAY;

        // These methods can be called via Enum object
        System.out.println(monday.getDay());
        System.out.println(tuesday.getComment());


        // Methods that belong to Enum Class (Static methods)
        System.out.println(EnumWithCustomValues.getEnumFromDay(2));





        // 3. Enum Classes implementing Interface
        EnumWithInterface e1 = EnumWithInterface.TUESDAY;
        e1.sayValue();
    }
}
