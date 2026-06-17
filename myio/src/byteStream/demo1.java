package byteStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {

//编码
        String str="ai你哟";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));

        //解码

        String s=new String(bytes);
        System.out.println(s);

        String s1=new String(bytes,"GBK");
        System.out.println(s1);

    }
}
