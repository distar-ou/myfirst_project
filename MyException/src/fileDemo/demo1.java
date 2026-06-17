package fileDemo;

import java.io.File;
import java.text.SimpleDateFormat;

public class demo1 {
    public static void main(String[] args) {
        File f1=new File("D:\\dw\\Microsoft VS Code\\6a44c352bd\\chrome_100_percent.pak");

        long length = f1.length();
        System.out.println(length);

        System.out.println("-------------------------");

        File f2 = f1.getAbsoluteFile();
        System.out.println(f2);
        System.out.println("----------------------");

        File f3=new File("MyException\\a.txt");
        System.out.println(f3);
        //返回绝地路径
        String path=f3.getAbsolutePath();
        System.out.println(path);
        String f4=f3.getPath();
        System.out.println(f4);
        System.out.println("----------------------");

        String name = f1.getName();
        System.out.println(name);

        long l = f1.lastModified();
        System.out.println(l);

        SimpleDateFormat sdf=new  SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String result = sdf.format(l);
        System.out.println(result);
    }
}
