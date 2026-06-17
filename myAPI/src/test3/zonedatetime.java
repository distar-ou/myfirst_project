package test3;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class zonedatetime {
    public static void main(String[] args) {
       ZonedDateTime zonedatetime=ZonedDateTime.now();
        System.out.println(zonedatetime);

        ZonedDateTime time1=ZonedDateTime.of(2025,6,7,11,
                0,0,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        Instant instant=Instant.now();
        ZoneId zoneId=ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2=ZonedDateTime.ofInstant(instant,zoneId);
        System.out.println(time2);

        ZonedDateTime time3=time2.withYear(2025);
        System.out.println(time3);

        ZonedDateTime time4=time3.minusYears(1);
        System.out.println(time4);


        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dtf1.format(time4));
    }
}
