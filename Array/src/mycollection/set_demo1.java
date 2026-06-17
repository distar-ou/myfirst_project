package mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class set_demo1 {

    public static void main(String[] args) {
        Set<String> s=new HashSet<>();      //创建hashset实现类对象

        s.add("张三");
        //s.add("张三");
        s.add("李四");
        s.add("王五");


        Iterator<String> it = s.iterator();

//
//        while(it.hasNext()){
//            String str=it.next();
//            System.out.println(str);
//        }

        for (String str : s) {
            System.out.println(str);
        }


        s.forEach( str ->  System.out.println(str));



    }
}
