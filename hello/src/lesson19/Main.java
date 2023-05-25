package lesson19;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();

        List<Integer> testList1 = List.of(1, 2);
        System.out.println(calculator.average(testList1));


        List<Integer> testList2 = new ArrayList<>();
        testList2.add(1);
        testList2.add(null);
        testList2.add(2);
        System.out.println(calculator.average(testList2));

        List<Integer> testList3 = new ArrayList<>();
        testList3.add(null);
        testList3.add(null);
        testList3.add(null);
        System.out.println(calculator.average(testList3));

        List<Integer> testList4 = new ArrayList<>();
        testList4.add(Integer.MAX_VALUE);
        testList4.add(Integer.MAX_VALUE);
        testList4.add(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(calculator.average(testList4));

        List<Integer> testList5 = new ArrayList<>();
        testList5.add(1);
        testList5.add(4);
        testList5.add(5);
        testList5.add(2);
        System.out.println(calculator.getMinEvenNumber(testList5));


    }

}
