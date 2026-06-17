package throwException;

import java.io.File;

public class filedemo {

    public static void main(String[] args) {
        String s="C:\\Users\\HP\\IdeaProjects\\MyException\\Java";
        File f1=new File(s);
        System.out.println(f1);

        String parent="C:\\Users\\HP\\IdeaProjects\\MyException";
        String child="Java";
        File f2=new File(parent,child);
        System.out.println(f2);

        File f3=new File(parent);
        File f4=new File(f3,child);
        System.out.println(f4);
    }
}
