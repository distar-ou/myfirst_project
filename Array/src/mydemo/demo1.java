package mydemo;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {

        ArrayList<String> list1=new ArrayList<>();

        Collections.addAll(list1,"张无忌", "周芷若", "张三丰", "张强", "赵敏");

        list1.stream().filter(new demo1()::StringJude).forEach(s-> System.out.println(s));
    }

    public boolean StringJude(String s){
        boolean i=s.startsWith("张") &&s.length()==3;
        return i;
    }
}
