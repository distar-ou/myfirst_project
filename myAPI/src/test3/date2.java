package test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date2 {
    public static void main(String[] args) throws ParseException {
        Date d1=new Date(0L);

        long time= d1.getTime();
        time=time+1000L*60*60*24*365;
        d1.setTime(time);
        System.out.println(d1);


        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");
        String str = sdf.format(d1);
        System.out.println(str);

        String str1="2023-11-11 11:11:11";

        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date= sdf1.parse(str1);
        System.out.println(date);

        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);
        System.out.println(result);
    }
}
