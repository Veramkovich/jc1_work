package lesson6;

public class DoWhileExample {

    public static void main(String[] args) {

        boolean result = true;
        int i = 10;
        do {
            System.out.println("i=" + i);
            i--;
            if (i == 0) result = false;
        } while (result);

    }

}
