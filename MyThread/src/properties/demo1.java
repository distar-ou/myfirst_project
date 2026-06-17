package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class demo1 {

    public static void main(String[] args) throws IOException {
        Properties ps=new Properties();

        ps.put("aaa","111");
        ps.put("bbb","112");
        ps.put("ccc","122");
        ps.put("ddd","123");

        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\MyThread\\pro.txt");
        ps.store(fos,"test");
        fos.close();
    }
}
