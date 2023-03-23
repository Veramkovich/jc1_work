package lesson5;

public class BitwiseExample {

    public static void main(String[] args) {
        int i1 = 0b0110;
        int i2 = 0b1010;

        System.out.println(Integer.toBinaryString(i1 & i2));
        System.out.println(Integer.toBinaryString(i1 | i2));
        System.out.println(Integer.toBinaryString(i1 ^ i2));

        System.out.println(Integer.toBinaryString(~i1));
        System.out.println(Integer.toBinaryString(~i2));

        // 0b0110
        System.out.println(Integer.toBinaryString(i1 >> 1)); //0110 -> 0011
        System.out.println(Integer.toBinaryString(i1 << 1)); //0110 -> 1100
        System.out.println(Integer.toBinaryString(i1 >>> 1)); //0110 -> 0011






    }

}
