package Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread extends Thread{
    Socket socket;
    public ClientThread(Socket socket){
        this.socket=socket;
    }
    //接收消息线
        @Override
        public void run() {

            try {

                BufferedReader br =
                        new BufferedReader(
                                new InputStreamReader(
                                        socket.getInputStream()));

                String msg;

                while((msg = br.readLine()) != null){

                    System.out.println(msg);
                }

            } catch (Exception e) {

                System.out.println("服务器断开");
            }
        }
    }

