package a01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Stack;

public class thread4 extends Thread{
    static BigDecimal money=BigDecimal.valueOf(100.0);

    static int count=3;
    Random r=new Random();
    static final BigDecimal MIN=BigDecimal.valueOf(0.01);


    public void run(){
        synchronized (thread4.class){
            if(count==0){
                System.out.println(getName()+"没有抢到红包");
            }else{
                BigDecimal price;
                if(count==1){
                    price=money;
                }
                else{
                    double bounds=money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                    price = BigDecimal.valueOf(r.nextDouble(bounds));
                }
                price=price.setScale(2, RoundingMode.HALF_UP);


                money=money.subtract(price);
                count--;
                System.out.println(getName()+"抢到了"+price+"元");
            }



        }


    }


}
