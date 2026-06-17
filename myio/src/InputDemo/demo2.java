package InputDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\myio\\b.txt");
        long l1 = System.currentTimeMillis();

        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }

        long l2=System.currentTimeMillis();
        System.out.println(l2-l1);
        fos.close();
        fos.close();

    }
}
