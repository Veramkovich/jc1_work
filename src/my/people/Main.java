package my.people;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List list = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        Man myMan2;
        Man myMan1 = new Man(35);
        System.out.println(myMan1.getAge());

        myMan2 = myMan1;
        System.out.println(myMan2.getAge());

        myMan2.age = 25;
        System.out.println(myMan2.getAge());
        System.out.println(myMan1.getAge());

        /*Thread.sleep(10_000);
        for (int i = 0; i < 1_000_000; i++) {
            list.add(new Man(i));
            if (i < 10_000) Thread.sleep(1);
        }*/
    }
}

