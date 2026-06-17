package string;
import java.util.Scanner;
public class Stringdemo2 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            System.out.println(c);
        }
    }
}
