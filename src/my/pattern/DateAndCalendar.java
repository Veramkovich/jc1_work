package my.pattern;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {

    public static void main(String[] args) {
        Date currentDate = new Date(-100_000_000_000_000L);
        System.out.println("Current date: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        DateAndCalendar dateAndCalendar = DateAndCalendar.getInstance();

        OrderStatus initialStatus = OrderStatus.PAID;

        System.out.println(initialStatus.getPrice());
        System.out.println(initialStatus.name());
        System.out.println(initialStatus.ordinal());

    }

    public static DateAndCalendar getInstance() {
        return new DateAndCalendar();
    }
}
