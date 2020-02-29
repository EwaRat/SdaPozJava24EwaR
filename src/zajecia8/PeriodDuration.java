package zajecia8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class PeriodDuration {

    public static void main(String[] args) {

        LocalDateTime myFatherBirthday=LocalDateTime.of(1959, Month.JUNE, 28,15,20);
        LocalDateTime myBirthday=LocalDateTime.of(1989,Month.SEPTEMBER,15,12,55);

        Duration duration=Duration.between(myFatherBirthday,myBirthday);
        System.out.println(duration.getSeconds());

        Period period=Period.between(myFatherBirthday.toLocalDate(), myBirthday.toLocalDate());
        System.out.println(period.getYears());  //pelne lata
        System.out.println(period.getMonths()); //pelne miesiace
        System.out.println(period.getDays());

        //ChronoUnit
    }
}
