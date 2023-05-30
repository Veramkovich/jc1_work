package lesson20;

public class Main {

    public static void main(String[] args) {
        try {
            new ConsoleWriter().run();
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
