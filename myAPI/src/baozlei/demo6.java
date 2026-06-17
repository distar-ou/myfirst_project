package baozlei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class demo6 {
    public static void main(String[] args) throws ParseException {
        String s="2006年1月25日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date date=sdf.parse(s);
        long birthdayTime = date.getTime();

        long todayTime=System.currentTimeMillis();
        long time=todayTime-birthdayTime;
        System.out.println(time/1000/60/60/24);

        LocalDate ld1=LocalDate.of(2006,1,25);
        LocalDate ld2=LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1, ld2);

        System.out.println(days);

    }

}
