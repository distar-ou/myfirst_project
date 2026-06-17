package converdemo;

import java.io.*;

public class demo8 {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps=new PrintStream(new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\myio\\ency.txt"),true,"UTF-8");
        ps.println("今天天气不错");
        ps.print("出来外面玩吗");
        ps.println();
        ps.printf("%s和%s也来了","阿伟","阿鑫");
        ps.close();


    }
}
