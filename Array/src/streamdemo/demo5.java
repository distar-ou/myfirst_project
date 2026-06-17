package streamdemo;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周芷若", "张无忌", "张三丰", "张强", "赵敏", "张三丰");
        Collections.addAll(list1, "111", "222");

        list.stream().filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        System.out.println("----------------------------------------");
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        System.out.println("----------------------------------------");
        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("----------------------------------------");
        list.stream().skip(3).forEach(s -> System.out.println(s));
        System.out.println("----------------------------------------");
//      去重
        list.stream().distinct().forEach(s -> System.out.println(s));
//连结
        Stream.concat(list.stream(), list1.stream()).forEach(s -> System.out.println(s));


        ArrayList<String> list3=new ArrayList<>();
        Collections.addAll(list3,"张无忌-12", "周芷若-13",  "张三丰-14", "张强-15", "赵敏-16");

        list3.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));

        long count = list.stream().count();
        System.out.println(count);
    }


}
