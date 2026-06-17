package test2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class demo3 {
    public static void main(String[] args) {
        BigDecimal bd1=new BigDecimal("0.01");
        BigDecimal bd2=new BigDecimal("0.09");
        BigDecimal bd3=bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4=BigDecimal.valueOf(10.0);
        BigDecimal bd5=BigDecimal.valueOf(3.0);
        System.out.println(bd4==bd5);


        BigDecimal bd6=bd4.multiply(bd5);
        System.out.println(bd6);

        BigDecimal bd8=bd4.divide(bd5,2, RoundingMode.HALF_UP);
        System.out.println(bd8);
    }
}
