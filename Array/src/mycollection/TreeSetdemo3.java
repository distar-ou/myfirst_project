package mycollection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetdemo3 {
    public static void main(String[] args) {


        //比较器排序
        TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i=o1.length()-o2.length();
                i = i==0? o1.compareTo(o2): i;
                return i;
            }
        });

        ts.add("c");
        ts.add("qwer");
        ts.add("df");
        ts.add("ab");

        System.out.println(ts);
    }
}
