package mydemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class mydemo {
    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        list.stream().map(new Function<String, Integer>() {
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s));

        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
    }
}
