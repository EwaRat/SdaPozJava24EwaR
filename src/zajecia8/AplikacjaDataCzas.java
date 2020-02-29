package zajecia8;

import java.time.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.TimeZone;

public class AplikacjaDataCzas {

    public static void main(String[] args) {

        //Instant

        Instant instant= Instant.now();
        System.out.println(instant);

        Instant instant1=Instant.parse("2020-02-29T08:33:54.675009100Z");
        instant1=instant1.minus(Duration.ofDays(05));
        System.out.println(instant1);

        Instant instant2= instant1.plus(Duration.ofHours(8));
        System.out.println(instant2);

        boolean check=instant1.isBefore(instant2);
        System.out.println(check);

        //LocalDate

        LocalDate today=LocalDate.now();
        System.out.println(today);

        LocalDate specialDay=LocalDate.of(2020,02,29);
        LocalDate specialday2=LocalDate.of(2020, Month.FEBRUARY,29);

        String myBirthday="1989-09-15";
        LocalDate myBirthdayDate=LocalDate.parse(myBirthday);

        LocalDate tomorrow= LocalDate.now().plusDays(1);

        //LocalTime

        LocalTime now=LocalTime.now();
        System.out.println(now);

        LocalTime meeting=LocalTime.of(11,30,0);
        LocalTime meetingFinish=meeting.plusHours(3);
        System.out.println(meetingFinish.isAfter(meeting));

        //LocalDateTime

        //milionsecounds precision
        LocalDateTime localDateTime1=LocalDateTime.of(2020,2,29,10,03,15,1);

        //month enum
        LocalDateTime localdateTime2=LocalDateTime.of(2020, Month.FEBRUARY,29,10,03,15,1);

        //local date + local time
        LocalDate date=LocalDate.of(2020,02,29);
        LocalTime time=LocalTime.of(10,9);
        LocalDateTime localdateTime3=LocalDateTime.of(date,time);

        DayOfWeek dayOfweek= localDateTime1.getDayOfWeek();
        int dayOfYear=localdateTime2.getDayOfYear();
        Month month=localdateTime3.getMonth();
        int monthInt=localdateTime3.getMonthValue();

        //ZonedDate Time
        String[] ids= TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(ids));

        ZoneId New_York=ZoneId.of("Amerika/New_York");
        ZoneId London=ZoneId.of("Europe/London");
        ZoneId Budapest=ZoneId.of("Europe/Budapest");
        ZoneId Tokyo=ZoneId.of("Asia/Tokyo");

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(New_York));
        System.out.println(ZonedDateTime.now(London));
        System.out.println(ZonedDateTime.now(Budapest));
        System.out.println(ZonedDateTime.now(Tokyo));


    }
}
