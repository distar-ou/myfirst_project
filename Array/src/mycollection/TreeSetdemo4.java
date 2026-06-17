package mycollection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetdemo4 {


    public static void main(String[] args) {
        student2 s1=new student2("张三",23,77,88,100);
        student2 s2=new student2("李四",24,78,87,100);
        student2 s3=new student2("王五",25,79,87,99);
        student2 s4=new student2("赵六",26,80,88,95);
        student2 s5=new student2("小七",27,97,78,97);
        student2 s6=new student2("小星",23,77,88,100);

        TreeSet<student2> ts=new TreeSet<>(new Comparator<student2>() {
            @Override
            public int compare(student2 o1, student2 o2) {
                double i=o1.getsum()-o2.getsum();
                i = i==0 ? o1.getChineseGrade()-o2.getChineseGrade() :i;
                i = i==0 ? o1.getMathGrade()-o2.getMathGrade() :i;
                i = i==0 ? o1.getEnglishGrade()-o2.getEnglishGrade() :i;
                i = i==0 ? o1.getName().compareTo(o2.getName()) : i;
                return (int)i;
            }
        });


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        System.out.println(s1.getsum());
        System.out.println(s2.getsum());
        System.out.println(s3.getsum());
        System.out.println(s4.getsum());
        System.out.println(s5.getsum());
        System.out.println(s6.getsum());

        System.out.println(ts);
    }
}
