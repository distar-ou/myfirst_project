package test2;

import java.util.regex.Pattern;

public class demo8 {
    public static void main(String[] args) {
       //aaa123aaa bbb456bbb 111789111  &&abc&&
        String regex="((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex));
        System.out.println("bbb456bbb".matches(regex));
        System.out.println("111789111".matches(regex));
        System.out.println("&&abc&&".matches(regex));

        String s="我要学学编编编编程程程程程程";
        String regex1="(.)\\1+";
        String result = s.replaceAll(regex1, "$1");        //$外部使用组号内容
        System.out.println(result);


    }
}
