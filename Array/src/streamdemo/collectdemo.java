package streamdemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class collectdemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌-男-12", "周芷若-女-13", "张三丰-男-14", "张强-男-15", "赵敏-女-16");
//Set
        Set<String> set = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);
//List
        List<String> list1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(list1);

//Map
        Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1])).
                collect(Collectors.toMap(new Function<String, String>() {
                                             public String apply(String s) {
                                                 return s.split("-")[0];
                                             }

                                         },
                        new Function<String, Integer>() {
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }

                        }));


        System.out.println(map);

    }
}
