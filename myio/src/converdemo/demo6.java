package converdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class demo6 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list=new ArrayList<>();

        Student s1=new Student("zhangs",23,"nanjing");
        Student s2=new Student("lishi",24,"beijing");
        Student s3=new Student("wangwu",25,"jingjing");
        Collections.addAll(list,s1,s2,s3);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\myio\\student.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
