package mydemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Student> list1=new ArrayList<>();

        Collections.addAll(list1,new Student("张三",23));
        Collections.addAll(list1,new Student("李四",24));
        Collections.addAll(list1,new Student("王五",25));

//        String[] array = list1.stream().map(new Function<Student, String>() {
//            public String apply(Student s) {
//                return s.getName();
//            }
//        }).toArray(String[]::new);
//        System.out.println(Arrays.toString(array));

        String[] array = list1.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
