package string;
import java.util.Scanner;
public class Stringdemo3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入金额:");
        int money;
        while(true){
            money=sc.nextInt();
            if(money>=0 && money<9999999){
                break;
            }
            else{
                System.out.println("金额错误，请重新输入:");
            }
        }


        String moneystr="";

        while(true){
            int ge=money%10;
            money=money/10;
            String capitalmoney=capital(ge);
            moneystr=capitalmoney + moneystr;
            if(money==0){break;}

        }
        int count=7-moneystr.length();
        for(int i=0;i<count;i++){
            moneystr="零"+moneystr;
        }

        String []arr={"佰","拾","万","仟","佰","拾","元"};

        String result="";
        for(int i=0;i<moneystr.length();i++){
            char c=moneystr.charAt(i);
            result=result+c+arr[i];
        }

        System.out.print(result);


    }


    public static String capital(int number){
        String []arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖" };
        return arr[number];


    }


}
