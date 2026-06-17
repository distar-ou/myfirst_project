package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\ency.txt");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\myio\\ccc.txt");
//加密  两次异或处理等于本身
        int ch;
        while((ch=fis.read())!=-1){
            fos.write(ch ^2);
        }
        fos.close();
        fis.close();
    }

}
