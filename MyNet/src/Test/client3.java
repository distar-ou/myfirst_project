package Test;

import java.io.*;

import java.net.Socket;

public class client3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 22222);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\HP\\IdeaProjects\\MyNet\\clientdir\\member-bg.jpg"));
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);

        socket.close();


    }
}
