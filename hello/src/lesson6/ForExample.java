package lesson6;

public class ForExample {

    public static void main(String[] args) {
        String arg1 = args[0];
        int max_value = Integer.parseInt(arg1);
        for (int i = 0; i < max_value; i++) {
            //do something
            System.out.println("do something i=" + i);
            if (i >= 100) {
                break;
            }
        }
    }

}
