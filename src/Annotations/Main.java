package Annotations;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        System.out.println("Meeting in next hour : " +
                timeNow.plus(1, ChronoUnit.HOURS));
        System.out.println("Meeting in next minutes : " +
                timeNow.truncatedTo(ChronoUnit.HOURS));
//        System.out.println(today.get(ChronoField.YEAR) +" "+ today.isLeapYear());
//        System.out.println("Today's Data : " + today.lengthOfYear() + " "+ today.getYear());
    }
}
