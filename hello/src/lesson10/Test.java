package lesson10;

public class Test {

    public static double getMiddle(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        double result;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        result = (double) sum/numbers.length;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle(new int[] {1,2}));

        int[] array = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        System.out.println(getMiddle(array));
    }

}
