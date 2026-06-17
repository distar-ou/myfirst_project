package OuputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\aaa\\a");
        byte[] bytes={97,98,99,100,101};
        fos.write(bytes);
        fos.close();

    }
}
