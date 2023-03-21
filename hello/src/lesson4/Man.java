package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Man {

    int hairLength;
    String name;

    public Man(String name) {
        this.name = name;
    }

    void grow() {
        hairLength = hairLength + 1;
    }


    static List<Man> mans = new ArrayList<Man>();
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 125_000_000; i++) {
            Man man = new Man(String.valueOf(i));
            mans.add(man);
        }
    }
}

