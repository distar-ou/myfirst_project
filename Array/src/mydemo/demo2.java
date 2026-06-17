package mydemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        Collections.addAll(list,"张无忌-12", "周芷若-13",  "张三丰-14", "张强-15", "赵敏-16");
//引用构造方法
        List<Student> newList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);
    }
}
