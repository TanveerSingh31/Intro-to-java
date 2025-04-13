package EnumClass;

// Enum Class with custom values for each constant
public enum EnumWithCustomValues {

    // Declare the constants
    MONDAY(1, "1st Day"), // This implicitly calls the constructor
    TUESDAY(2, "2nd Day"){

        // We can override methods in each Enum-object as well.
        @Override
        public String getComment() {
            return "This is from Tuesday";
        }

    },
    WEDNESDAY(3, "3rd Day");


    // These data-members belong to each enum object
    private final int day;
    private final String comment;


    // Constructor is private by default
    EnumWithCustomValues(int day, String comment) {
        this.day = day;
        this.comment = comment;
    }



   // These methods can be used by all objects, they belong to all objects
   public int getDay() {
        return day;
   }

   public String getComment() {
        return comment;
   }


   public static EnumWithCustomValues getEnumFromDay(int day) {
        // EnumWithCustomValues.values() -> return array of enums constants in this class
        for(EnumWithCustomValues sample : EnumWithCustomValues.values()) {
            if(sample.day == day) {
                return sample;
            }
        }
        return null;
   }

}
