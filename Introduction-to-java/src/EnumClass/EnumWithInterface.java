package EnumClass;


interface I1 {
    public void sayValue();
}


public enum EnumWithInterface implements I1 {

    MONDAY,
    TUESDAY,
    WEDNESDAY;

    // This method can be common for all objects
    @Override
    public void sayValue() {
        System.out.println(this.ordinal());
    }
}

