package fileDemo;

import java.io.File;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {

        File f1=new File("D:\\aaa\\a.txt");
        File f2=new File("D:\\aaa\\bbb");
        File f3=new File("D:\\aaa\\ccc\\c1\\c2");


        boolean result1 = f1.createNewFile();
        System.out.println(result1);

        boolean result2 = f2.mkdir();
        System.out.println(result2);

        boolean result3 = f3.mkdirs();
        System.out.println(result3);
//可以删除空的文件夹     以及文件
        File f4=new File("D:\\aaa\\a.txt");
        boolean result4 = f4.delete();
        System.out.println(result4);

    }
}
