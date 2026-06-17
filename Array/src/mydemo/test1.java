package mydemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张无忌-12", "周芷若-13",  "张三丰-14", "张强-15", "赵敏-16");

//        Student[] array = list1.stream().map(new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//                String name = s.split("-")[0];
//                int age = Integer.parseInt(s.split("-")[1]);
//                return new Student(name, age);
//            }
//        }).toArray(Student[]::new);

        Student[] array = list1.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(array));

    }
}
