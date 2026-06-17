package byteStream;

import java.io.*;

public class demo10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new
                FileReader("C:\\Users\\HP\\IdeaProjects\\myio\\b.txt"));

        BufferedWriter bw=new BufferedWriter(new
                FileWriter("C:\\Users\\HP\\IdeaProjects\\myio\\copy.txt"));

        String s1= br.readLine();
        bw.write(s1);
        bw.newLine();
        String s2= br.readLine();
        bw.write(s2);
        String s3= br.readLine();
        bw.write(s3);

        bw.close();
        br.close();


    }
}
