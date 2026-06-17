package converdemo;

import java.io.*;
import java.nio.charset.Charset;

public class demo2 {

    public static void main(String[] args) throws IOException {
//        OutputStreamWriter ow=new OutputStreamWriter(new FileOutputStream
//                ("C:\\Users\\HP\\IdeaProjects\\myio\\dd.txt"),"GBK");
//
//        ow.write("你好你好");
//        ow.close();


        FileWriter fw=new FileWriter(new File("C:\\Users\\HP\\IdeaProjects\\myio\\dd.txt"), Charset.forName("GBK"));
        fw.write("你还能你好好和你");
        fw.close();
    }
}
