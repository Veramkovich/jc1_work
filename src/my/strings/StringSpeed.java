package my.strings;

public class StringSpeed {

    public static String buildString() {
        String result = "";
        for (int i = 0; i <= 100_000; i++) {
            result = result + i;
        }
        return result;
    }

    public static String buildStringBuilder() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i <= 100_000; i++) {
            result.append(i);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        buildString();
        //buildStringBuilder();
        long t2 = System.currentTimeMillis();

        System.out.println("Result: " + (t2 - t1));
    }

}
