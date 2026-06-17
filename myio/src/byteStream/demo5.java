package byteStream;

import java.io.FileWriter;
import java.io.IOException;

public class demo5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\HP\\IdeaProjects\\myio\\b.txt");

        fw.write("今天天气不错");
        fw.flush();
        fw.write("出去玩吗");
        fw.close();
    }
}
