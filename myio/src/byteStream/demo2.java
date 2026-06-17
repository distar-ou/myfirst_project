package byteStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt");
        int ch;
        while((ch= fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();

    }
}
