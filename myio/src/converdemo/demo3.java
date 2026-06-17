package converdemo;

import java.io.*;

public class demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\d.txt")));

        String line;
        while((line =br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
