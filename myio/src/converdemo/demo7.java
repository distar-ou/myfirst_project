package converdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class demo7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\student.txt"));

        ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
        System.out.println(students);
        ois.close();
    }
}
