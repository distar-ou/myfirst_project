package byteStream;

import java.io.FileWriter;
import java.io.IOException;

public class demo4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\HP\\IdeaProjects\\myio\\b.txt");
        String s="今天天气不错";
        char[]c={'c','e'};
        fw.write("你好,");
        fw.write(s);
        fw.write(c);
        fw.close();
    }
}
