package test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo6 {
    public static void main(String[] args) {


        String str="Java自从95年问世以来,经历了很多版本,abbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaa,目前企业中用的最多的是Java8和Java11," +
                "“因为这两个是长期支持版本,下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        Pattern  p=Pattern.compile("Java\\d{0,2}");
        Matcher m=p.matcher(str);
        while(m.find()){
            String s=m.group();
            System.out.println(s);
        }

        System.out.println("---------------------------");
        //需求1
        String str1="Java(?=8|11|17)";      //不接后面内容

        //需求2
        String str2="((?i)java)(?:8|11|17)";  //?:接后面内容

        //需求3
        String str3="((?i)java)(?!8|11|17)";

        String str4="ab+";
        String str5="ab+?";
        Pattern p2=Pattern.compile(str3);
        Matcher m2=p2.matcher(str);
        while(m2.find()){

            System.out.println(m2.group());
        }

    }
}
