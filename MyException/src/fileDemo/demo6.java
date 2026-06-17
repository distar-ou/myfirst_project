package fileDemo;

import java.io.File;

public class demo6 {
    public static void main(String[] args) {
        File f=new File("D:\\aaa\\bbb");

        delete(f);
    }

    public  static void delete(File scr){
        File[] files = scr.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                delete(file);
            }
        }
        scr.delete();


    }
}
