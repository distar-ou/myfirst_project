package byteStream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt");

        char[] chars=new char[2];
        int len;
        while((len= fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        fr.close();
    }
}
