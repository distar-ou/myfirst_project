package Demo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo1 {
    public static void main(String[] args) throws IOException {
        String FamilynameNet="https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";

        String FamilynameStr = Webclawer(FamilynameNet);
        System.out.println(FamilynameStr.contains("赵钱孙李"));

        ArrayList<String> list=getData(FamilynameStr,"(\\W{4})(，|。)",1);
        System.out.println(list);

    }

    public static String Webclawer(String net) throws IOException {
        StringBuilder sb=new StringBuilder();


        URL url=new URL(net);
        URLConnection coon = url.openConnection();
        InputStreamReader ir=new InputStreamReader(coon.getInputStream(),"UTF-8");
        int b;
        while((b=ir.read())!=-1){
            sb.append((char)b);
        }
        ir.close();

        return sb.toString();


    }
    public static ArrayList<String> getData(String str,String regex,int n){
        ArrayList<String> list=new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            list.add(matcher.group(n));
        }

        return list;


    }
}
