package lesson9;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public final static String ALL_CYRILLIC_STRINGS = "[\\u0410-\\u044F\\u0451\\u0401]+";

    public static void main(String[] args) {
        System.out.println("Мама".matches(ALL_CYRILLIC_STRINGS));
        System.out.println(
                "375296101011".matches("\\d{12}")
        );
        String[] strings = "I love Java. And I love beer.".split("love");
        System.out.println(strings);
        System.out.println(
                Arrays.toString(strings)
        );

        Pattern pattern = Pattern.compile(ALL_CYRILLIC_STRINGS);
        String text = "Я люблю beer and футбол!!!";
        final Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
    }

}
