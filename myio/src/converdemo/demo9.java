package converdemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class demo9 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\HP\\IdeaProjects\\myio\\ency.txt"),true);
        pw.println("出来玩");
        pw.print("好吗");
        pw.close();


    }
}
