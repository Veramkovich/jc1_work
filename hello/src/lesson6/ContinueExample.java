package lesson6;

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Command 1");
            System.out.println("Command 2");
            System.out.println("Command 3");
            if (i <= 5) {
                System.out.println("------");
                continue;
            }
            System.out.println("Command 4");
            System.out.println("Command 5");
        }
    }

}
