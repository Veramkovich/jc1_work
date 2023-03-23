package lesson5;

public class MathExample {

    public static void main(String[] args) {
        System.out.println(2 + 2);
        System.out.println("2" + "2");
        System.out.println(5 - 3);
        System.out.println(4 * 5);
        System.out.println('4' * '5'); //ASCII
        System.out.println(52 * 53); //Descimal
        System.out.println(0x34 * 0x35); //Hexidecimal
        System.out.println(0b100 * 0b101); //Binary
        System.out.println(Integer.toOctalString(02 + 017));

        System.out.println((float) 3 / 2);
        System.out.println(7 % 5);

        int i = 0;
        System.out.println(i++);  //0
        System.out.println(++i);  //2

        System.out.println(Math.pow(2, 4));

        System.out.println(2 + 2 * 2);

    }

}
