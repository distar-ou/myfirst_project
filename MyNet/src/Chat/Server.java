package Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static ArrayList<Socket> ScoketList=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(22222);

        while (true) {
            Socket socket = ss.accept();
            System.out.println(socket.getInetAddress().getHostAddress()+"上线了");
            ScoketList.add(socket);
            new ServerThread(socket).start();

        }




    }
}