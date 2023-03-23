package lesson5;

public class LogicalExample {

    public static void main(String[] args) {
        int i1 = 0, i2 = 1;
        //               false | true
        boolean res1 = i1 != 0 | i2 > 0;
        System.out.println(res1);

        boolean res2 = i1 != 0 || i2 > 0;
        System.out.println(res2);


        boolean res3 = i1 == 0 | compare(i2, 0);
        System.out.println(res3);
        //                     || not executed!!!
        boolean res4 = i1 == 0 || compare(i2, 0);
        System.out.println(res4);
    }
    static boolean compare(int a, int b) {
        System.out.println("Call compare!");
        return a > b;
    }
}
