package converdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class demo11 {
    public static void main(String[] args) throws IOException {
        File scr=new File("D:\\aaa.zip");
        File dest=new File("D:\\");
        unZip(scr,dest);


    }

    public static void unZip(File scr,File dest) throws IOException {
        ZipInputStream zis=new ZipInputStream(new FileInputStream(scr));
        ZipEntry entry;
        while((entry=zis.getNextEntry())!=null){
            if(entry.isDirectory()){
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else {
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.getName()));
                int b;
                while((b=zis.read())!=-1){
                    fos.write(b);
                }
                fos.close();
            }
            zis.closeEntry();
        }
        zis.close();


    }


}
