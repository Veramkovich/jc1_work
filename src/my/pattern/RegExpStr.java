package my.pattern;

public class RegExpStr {

    public static void main(String[] args) {
        String s1 = "1234.00";
        System.out.println(s1.matches("\\d+\\.\\d{2}"));
    }
}
