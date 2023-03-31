package lesson7;

public class StaticExample {

    public static void main(String[] args) {
        SomeValue someValue1 = new SomeValue();
        SomeValue someValue2 = new SomeValue();

        SomeValue.i1 +=10;
        someValue1.i2 += 3;

        SomeValue.i1 +=20;
        someValue2.i2 += 5;

        System.out.println("someValue1: i1=" + someValue1.i1 + " i2=" + someValue1.i2);
        System.out.println("someValue2: i1=" + someValue2.i1 + " i2=" + someValue2.i2);

        System.out.println(SomeValue.GLOBAL_CONSTANT);
    }
}

class SomeValue {

    public static final int GLOBAL_CONSTANT = 7;

    public static final String GLOBAL_CONSTANT_STR = "GLOBAL_CONSTANT";

    static int i1 = 0;
    int i2 = 0;

}
