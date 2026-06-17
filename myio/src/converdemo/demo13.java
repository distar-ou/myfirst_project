package converdemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class demo13 {
    public static void main(String[] args) throws IOException {
        File scr=new File("D:\\aaa");
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File("D:\\aaa.zip")));
        toZip(scr,zos,scr.getName());

        zos.close();

    }

    public static void toZip(File scr,ZipOutputStream zos,String path) throws IOException {
        if(scr.isFile()){
            ZipEntry entry=new ZipEntry(path);
            zos.putNextEntry(entry);
            FileInputStream fis=new FileInputStream(scr);
            int b;
            while((b=fis.read())!=-1){
                zos.write(b);
            }
            fis.close();
            zos.closeEntry();

        }else{

            File[] files = scr.listFiles();

            for (File file : files) {
                if(file!=null){
                    toZip(file,zos,path+"\\"+file.getName());
                }
            }



        }



    }
}
