package mydemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        Collections.addAll(list1,"aaa","bbb","ccc");
        //拿着流中的每一个元素，取调用String类中的toUpperCase方法，方法的返回值就是转换之后的结果
        list1.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));
        Collections.addAll(list2,1,2,3,4,5);

//        Integer[] arr = list2.stream().toArray(new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {
//                return new Integer[value];
//            }
//        });

        Integer[] arr = list2.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));


    }
}
