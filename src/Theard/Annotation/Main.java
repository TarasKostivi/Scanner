package Theard.Annotation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate date = LocalDate.parse("2020/04/09", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(date);

        System.out.println(date.isBefore(currentDate));

        LocalDateTime currentyDateTime = LocalDateTime.now();
        System.out.println(currentyDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println(currentyDateTime.format(formatter));

        currentyDateTime.minus(1, ChronoUnit.HOURS);

        LocalTime localTime = LocalTime.now();

        System.out.println(currentyDateTime.getMonth().length(false));

    }
}
