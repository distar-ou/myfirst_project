package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class demo2 {
    public static void main(String[] args) throws IOException {
        Properties ps=new Properties();

        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\MyThread\\pro.txt");

        ps.load(fis);
        fis.close();
        System.out.println(ps);
    }
}
