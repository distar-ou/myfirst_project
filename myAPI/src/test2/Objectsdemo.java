package test2;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Objectsdemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangshang", 23);
        Student s2 = null;

        boolean result = Objects.equals(s1, s2);
        System.out.println(result);

        Student s3 = new Student();
        System.out.println(Objects.isNull(s3));

    }



}
