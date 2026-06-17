package test2;

import java.math.BigInteger;

public class demo2 {
    public static void main(String[] args) {
        BigInteger bd1=BigInteger.valueOf(10);
        BigInteger bd2=BigInteger.valueOf(5);

        BigInteger[] arr=bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(bd1.pow(2));

        BigInteger bd3=bd1.max(bd2);
        System.out.println(bd3);
        System.out.println(bd3==bd1);
    }
}
