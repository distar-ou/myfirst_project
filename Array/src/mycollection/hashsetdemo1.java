package mycollection;

import java.util.HashSet;

public class hashsetdemo1 {
    public static void main(String[] args) {
        Student s1=new Student("张三",23);
        Student s2=new Student("王五",25);
        Student s3=new Student("李四",24);
        Student s4=new Student("张三",23);

        HashSet<Student> ha=new HashSet<>();

        System.out.println(ha.add(s1));
        System.out.println(ha.add(s2));
        System.out.println(ha.add(s3));
        System.out.println(ha.add(s4));


        System.out.println(ha);
    }
}
