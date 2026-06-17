package test2;

import java.math.BigInteger;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {                     //范围：0---》2^4-1
        BigInteger bd1=new BigInteger(4,new Random());
        System.out.println(bd1);

        BigInteger bd2=new BigInteger("9999999999999999999");
        System.out.println(bd2);
        //进制转换
        BigInteger bd3=new BigInteger("100",2);
        System.out.println(bd3);

        BigInteger bd4=BigInteger.valueOf(16);
        BigInteger bd5=BigInteger.valueOf(16);
        System.out.println(bd4);
        System.out.println(bd5);
        System.out.println(bd4==bd5);

    }
}
