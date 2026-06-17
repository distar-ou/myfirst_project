package mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class lamda {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //底层原理：会自己遍历每一个元素，再把每一个元素传递给accept
//        coll.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //lamda表达式
        coll.forEach(s-> System.out.println(s));
    }
}
