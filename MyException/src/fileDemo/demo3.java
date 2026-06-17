package fileDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\aaa");
        File f1=new File("D:\\aaa\\aaa");
        File f3=new File("D:\\aaa\\a.txt");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        File[] files1 = f1.listFiles();
        System.out.println(files1);

        File[] arr=f.listFiles();
        for (File file : arr) {
            System.out.println(file);
        }
        String[] list = f.list();
        System.out.println(Arrays.toString(list));

        boolean newFile = f3.createNewFile();

        File[] arr2 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith("txt");
            }
        });
        System.out.println(Arrays.toString(arr2));


    }
}
