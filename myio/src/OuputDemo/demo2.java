package OuputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {


        FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt",true);

        String s = "yuanlairuchi";
        byte[] bytes1 = s.getBytes();
        fos.write(bytes1);

        String a = "\r\n";
        byte[] bytes2 = a.getBytes();
        fos.write(bytes2);

        String c = "6666";
        byte[] bytes3 = c.getBytes();
        fos.write(bytes3);

        fos.close();
    }
}
