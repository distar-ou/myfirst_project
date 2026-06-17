package converdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class demo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\e.txt"));

        Object o = ois.readObject();
        ois.close();
        System.out.println(o);

    }
}
