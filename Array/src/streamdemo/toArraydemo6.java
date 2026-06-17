package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class toArraydemo6 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        Collections.addAll(list1, "张无忌", "周芷若", "张无忌", "张三丰", "张强", "赵敏", "张三丰");

//        Object[] arr = list1.stream().toArray();
//        System.out.println(Arrays.toString(arr));



//        String[] arr = list1.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//        System.out.println(Arrays.toString(arr));

        String[] arr = list1.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));
    }
}
