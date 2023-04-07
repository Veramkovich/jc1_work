package lesson9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
        System.out.println(sqlDate);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

    }

}
