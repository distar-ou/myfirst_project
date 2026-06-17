package Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 22222);

        OutputStream os = socket.getOutputStream();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一句话:");
            String str = sc.nextLine();
            if (str.equals("886")) {
                break;
            }

            os.write(str.getBytes());


        }
        os.close();
        socket.close();

    }
}
