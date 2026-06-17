package baozlei;

import java.time.LocalDate;
import java.util.Calendar;

public class demo7 {

    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2001,0,1);
        c.add(Calendar.DAY_OF_YEAR,-1);
        int day=c.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);


        LocalDate ld1=LocalDate.of(2000,3,1);
        LocalDate ld2=ld1.minusDays(1);
        int day1=ld2.getDayOfMonth();
        System.out.println(day1);

        System.out.println(ld1.isLeapYear());

    }
}
