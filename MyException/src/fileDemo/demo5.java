package fileDemo;

import java.io.File;

public class demo5 {
    public static void main(String[] args) {
        File scr=new File("D:\\");
        findAVI(scr);

    }

    public static void findAVI(File scr){
        File[] files = scr.listFiles();
        if(files !=null){
            for (File file : files) {
                if(file.isFile()){
                    if(file.getName().endsWith(".avi")){
                        System.out.println(file);
                    }else{
                        findAVI(file);
                    }
                }
            }

        }

    }
}
