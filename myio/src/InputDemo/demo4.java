package InputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo4 {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt");

        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\myio\\c.txt");

        try(fis;fos){
            int len;
            byte[] b=new byte[10];
            while((len=fis.read(b))!=-1){
                System.out.println(len);
                fos.write(b,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
