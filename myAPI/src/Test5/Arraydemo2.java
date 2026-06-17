package Test5;

import javax.xml.xpath.XPathVariableResolver;
import java.util.Arrays;
import java.util.Comparator;

public class Arraydemo2 {
    public static void main(String[] args) {
        String []s={"a","aaa","aa","aaaaa"};
//
//        Arrays.sort(s, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });

        Arrays.sort(s, (String o1, String o2) ->o1.length()-o2.length());



        System.out.println(Arrays.toString(s));
    }
}
