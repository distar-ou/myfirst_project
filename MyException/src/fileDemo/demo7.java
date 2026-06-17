package fileDemo;

import java.io.File;

public class demo7 {
    public static void main(String[] args) {
        File scr=new File("D:\\dw");
        long len = getlen(scr);
        System.out.println(len);

    }
    public static long getlen(File scr){
        long sum=0;
        File[] files = scr.listFiles();
        for (File file : files) {
            if(file.isFile()){
                sum+=file.length();
            }else{
                 sum+=getlen(file);
            }
        }
        return sum;

    }
}
