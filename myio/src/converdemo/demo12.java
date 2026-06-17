package converdemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class demo12 {

    public static void main(String[] args) throws IOException {
        File scr=new File("D:\\dcdc.txt");
        File dest=new File("D:\\");
        tozip(scr,dest);

    }
    public static void tozip(File scr,File dest) throws IOException {
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"dcdc.zip")));
        ZipEntry entry=new ZipEntry("d.txt");
        zos.putNextEntry(entry);
        FileInputStream fis=new FileInputStream(scr);
        int b;
        while((b=fis.read())!=-1){
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();

    }
}
