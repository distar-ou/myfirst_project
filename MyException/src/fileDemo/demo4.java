package fileDemo;

import java.io.File;

public class demo4 {
    public static void main(String[] args) {
        File f=new File("D:\\aaa");
        boolean b = haveAVI(f);
        System.out.println(b);
    }

    public static boolean haveAVI(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()&&file1.getName().endsWith("avi")){
                return true;
            }

        }
        return false;

    }
}
