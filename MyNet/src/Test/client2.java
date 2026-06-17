package Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 22222);

        OutputStream os = socket.getOutputStream();
        InputStreamReader irs = new InputStreamReader(socket.getInputStream());
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一句话:");
            String str = sc.nextLine();
            if (str.equals("886")) {
                break;
            }
            os.write(str.getBytes());
        }
        //写一个结束标记
        socket.shutdownOutput();
        int b;
        while ((b = irs.read()) != -1) {
            System.out.print((char) b);
        }


        os.close();
        socket.close();


    }
}
