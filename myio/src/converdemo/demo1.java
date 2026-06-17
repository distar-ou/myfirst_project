package converdemo;

import java.io.*;
import java.nio.charset.Charset;

public class demo1 {

    public static void main(String[] args) throws IOException {
       FileReader fr=new FileReader(new File("C:\\Users\\HP\\IdeaProjects\\myio\\dd.txt"), Charset.forName("GBK"));
       FileWriter fw=new FileWriter(new File("C:\\Users\\HP\\IdeaProjects\\myio\\ddd.txt"));

        int len;
        while((len=fr.read())!=-1){
            fw.write(len);
        }
        fw.close();
        fr.close();

    }
}
