package mydemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class test3 {
    public static void main(String[] args) {
        Student s1=new Student("张三",23);
        Student s2=new Student("李四",24);
        Student s3=new Student("王五",25);

        ArrayList<Student> list1=new ArrayList<>();

        Collections.addAll(list1,s1,s2,s3);


        String[] array = list1.stream().map(new Function<Student, String>() {

            public String apply(Student s) {

                return s.getName() + "-" + s.getAge();
            }
        }).toArray(String[]::new);


        System.out.println(Arrays.toString(array));
    }
}
