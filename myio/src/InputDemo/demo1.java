package InputDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt");
        int b;
        while((b=fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();
    }
}
