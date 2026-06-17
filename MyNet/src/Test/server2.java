package Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(22222);

        Socket socket = ss.accept();
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        int b;
        while((b=isr.read())!=-1){
            System.out.print((char)b);
        }
        os.write("我已经接收到了".getBytes());

        socket.close();


        ss.close();
    }

}
