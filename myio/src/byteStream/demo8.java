package byteStream;

import java.io.*;
import java.util.Arrays;

public class demo8 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt");


        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }

        String s = sb.toString();


        Integer[] array = Arrays.stream(s.split("-")).map(Integer::parseInt).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        FileWriter fw = new FileWriter("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                    fw.write(array[i]+"");
            }else{
                fw.write(array[i]+"-");
            }
        }
        fw.close();
        fr.close();
    }
}
