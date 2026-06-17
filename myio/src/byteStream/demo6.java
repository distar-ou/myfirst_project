package byteStream;

import java.io.*;

public class demo6 {

    public static void main(String[] args) throws IOException {
        File scr = new File("D:\\aaa");
        File dest = new File("D:\\bbb");

        copydir(scr, dest);
    }

    private static void copydir(File scr, File dest) throws IOException {
        dest.mkdir();
        File[] files = scr.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                int len;
                byte[] bytes = new byte[2];
                while ((len = fis.read(bytes))!=-1){
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();

            } else {
                copydir(file,new File(dest,file.getName()));

            }
        }


    }
}
