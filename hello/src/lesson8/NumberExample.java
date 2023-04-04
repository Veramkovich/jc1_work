package lesson8;

public class NumberExample {

    public static void main(String[] args) {
        Long l1 = 120L; // autoboxing
        long l2 = l1;  //unboxing

        Number num = new Integer(1);

        System.out.println(l1);
        System.out.println(l2);

        int i1 = 10;
        int i2 = 20;
        System.out.println(sum(i1, i2));

        i1 = Integer.MAX_VALUE;
        i2 = Integer.MAX_VALUE;
        System.out.println(sum(i1, i2));
    }

    static int sum(int i1, int i2) {
        return i1 + i2;
    }

}
