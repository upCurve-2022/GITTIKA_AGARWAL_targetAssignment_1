package javaChallenges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class program1 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Todays date is :"+date);
        LocalTime time= LocalTime.now();
        System.out.println("Current time is :"+time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Date and time is :"+dateTime);
    }
}
