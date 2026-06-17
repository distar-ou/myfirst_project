package converdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class demo4 {
    public static void main(String[] args) throws IOException {
        Student s=new Student("张三",23,"广东");

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\myio\\e.txt"));
        oos.writeObject(s);
        oos.close();

    }
}
