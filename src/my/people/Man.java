package my.people;

import java.math.BigDecimal;

public class Man {

    String firstName = "Vasia";
    char nameLetter = 'V';
    int binAge = 0b010101;
    int octAge = 025;
    int hexAge = 0xFF;
    long cell = 1_000_000L;
    float weight = 1.11f;
    double height = 0.34;
    boolean isSingle = false; //true\
    short s1 = 123;
    byte b1 = 123;

    int age;

    /*public Man() {
        age = 18;
    }*/

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
