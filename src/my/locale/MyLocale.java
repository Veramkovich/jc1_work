package my.locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocale {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(locale.getDisplayCountry());

        NumberFormat curFormat = NumberFormat.getCurrencyInstance();
        System.out.println(curFormat.format(10_000_000));

        Locale byLocale = new Locale("ru", "RU");
        NumberFormat belCurFormat = NumberFormat.getCurrencyInstance(byLocale);
        System.out.println(belCurFormat.format(10_000_000));

        Date curDate = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat belDateFormat = DateFormat.getDateInstance(DateFormat.SHORT, byLocale);
        System.out.println(dateFormat.format(curDate));
        System.out.println(belDateFormat.format(curDate));

        try {
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
            Date parseDate = df.parse("10/15/10");
            System.out.println(parseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ResourceBundle rb = ResourceBundle.getBundle("myApp");
        ResourceBundle rbRu = ResourceBundle.getBundle("myApp", byLocale);
        System.out.println(rb.getString("greeting"));
        System.out.println(rbRu.getString("greeting"));
    }
}
