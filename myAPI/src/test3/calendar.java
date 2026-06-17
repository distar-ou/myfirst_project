package test3;

import java.util.Calendar;
import java.util.Date;

public class calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();      //静态方法获取对象
        Date d=new Date(0L);

        c.setTime(d);

        System.out.println(c);

        c.set(Calendar.YEAR,2000);                  //set    修改信息
        c.add(Calendar.MONTH,1);


        int year=c.get(Calendar.YEAR);
        int mouth=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        int week=c.get(Calendar.DAY_OF_WEEK);

        System.out.println(year+", "+mouth+", "+day+", "+getweek(week));
    }
    public static String getweek(int index){
        String []arr={"","星期天", "星期一","星期二 ","星期三","星期四","星期五","星期六"};
        return arr[index];
    }
}
