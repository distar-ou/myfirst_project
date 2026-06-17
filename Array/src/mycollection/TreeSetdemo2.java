package mycollection;

import java.util.TreeSet;

public class TreeSetdemo2 {

    public static void main(String[] args) {
        Student s1=new Student("zhangsang",23);
        Student s2=new Student("lishi",24);
        Student s3=new Student("wangwu",25);
        Student s4=new Student("zhaoliu",26);

        //比较器排序
        TreeSet<Student> ts=new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
    }
}
