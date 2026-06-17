package test3;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class instantdemo {
    public static void main(String[] args) {
        Instant now=Instant.now();
        System.out.println(now);

        Instant instant1=Instant.ofEpochMilli(0L);
        System.out.println(instant1);
        Instant instant3=Instant.ofEpochSecond(1L);
        System.out.println(instant3);
        Instant instant4=Instant.ofEpochSecond(1L,1000000000L);
        System.out.println(instant4);

        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        Instant  instant5=Instant.ofEpochMilli(0L);
        Instant  instant6=Instant.ofEpochMilli(1000L);

        boolean result = instant5.isBefore(instant6);
        System.out.println(result);

       Instant instant7=Instant.ofEpochSecond(3);
        System.out.println(instant7);
       Instant instant8=instant7.minusSeconds(1);
        System.out.println(instant8);
    }
}
