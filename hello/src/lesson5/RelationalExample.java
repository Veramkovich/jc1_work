package lesson5;

public class RelationalExample {

    public static void main(String[] args) {
        int i1 = 2, i2 = 3;
        System.out.println(i1 == i2);
        System.out.println(i2 == i2);

        System.out.println(i1 != 10);
        System.out.println(i2 != 3);

        System.out.println( i2 > i1);
        boolean result = i2 < i1;
        System.out.println(result);

        int result2 = i1 * (5 == i2 ? 1 : 0) + 7;
        System.out.println(result2);

    }

}
