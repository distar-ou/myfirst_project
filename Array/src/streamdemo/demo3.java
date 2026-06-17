package streamdemo;

import java.util.Arrays;
import java.util.stream.Stream;

public class demo3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Arrays.stream(arr).forEach(s -> System.out.println(s));


        //Stream接口中的静态方法of   形参可以是一堆数据，也可以是数组，但得是引用类型的数组
        Stream.of(arr).forEach(s-> System.out.println(s));
    }


}
