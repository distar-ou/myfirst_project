package byteStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo11 {
    public static void main(String[] args) throws IOException {
        BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\HP\\IdeaProjects\\myio\\d.txt"));
        ArrayList<String> list=new ArrayList<>();
       String line;
        while((line= fr.readLine())!=null){
            list.add(line);
        }
        fr.close();

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1= Integer.parseInt(o1.split("\\.")[0]);
                int i2= Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;
            }
        });


       BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\HP\\IdeaProjects\\myio\\dcpoy.txt"));

        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();


    }
}
