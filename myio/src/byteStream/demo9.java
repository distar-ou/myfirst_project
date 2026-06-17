package byteStream;

import java.io.*;

public class demo9 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new
                FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt"));

        BufferedOutputStream bos=new BufferedOutputStream(new
                FileOutputStream("C:\\Users\\HP\\IdeaProjects\\myio\\b.txt"));

        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
