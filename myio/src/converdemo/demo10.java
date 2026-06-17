package converdemo;

import java.io.PrintStream;
import java.io.PrintWriter;

public class demo10 {
    public static void main(String[] args) {
        PrintStream ps=System.out;
        ps.println("出来玩啊");

        ps.close();

        System.out.println("好啊");



    }



}
