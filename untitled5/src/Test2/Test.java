package Test2;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("张三",18,"男");
        Student s2=new Student("月月",19,"女");
        Student s3=new Student("王青",20,"男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int max=StudentUtil.getMaxAge(list);
        System.out.println(max);

    }
}
