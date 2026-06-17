package Chat;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
    Socket socket;
    public ServerThread(Socket socket){
        this.socket=socket;
    }


    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String msg;
            while((msg=br.readLine())!=null){
                sendAll(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void sendAll(String s) throws IOException {
        for (Socket socket : Server.ScoketList) {
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

    }
}
