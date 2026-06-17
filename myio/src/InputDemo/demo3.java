package InputDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\myio\\a.txt");
        byte[] b = new byte[3];
        int len;
//        int len = fis.read(b);
//        System.out.println(len);
//        System.out.println(new String(b, 0, len));
//
//        len = fis.read(b);
//        System.out.println(len);
//        System.out.println(new String(b, 0, len));
//        len = fis.read(b);
//        System.out.println(len);
//        System.out.println(new String(b, 0, len));
//        len = fis.read(b);
//        System.out.println(len);
//        System.out.println(new String(b, 0, len));

        while((len=fis.read(b))!=-1){
            System.out.println(len);
            System.out.println(new String(b,0,len));
        }


        fis.close();


    }
}
