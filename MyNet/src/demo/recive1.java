package demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class recive1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);
        while(true){
            byte[] bytes=new byte[1024];
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
            ds.receive(dp);

            byte[] data = dp.getData();
            int len = dp.getLength();
            int port = dp.getPort();
            String ip = dp.getAddress().getHostAddress();
            String hostName = dp.getAddress().getHostName();
            System.out.println("从"+hostName+"/"+ip+"这台电脑的"+port+"端接收到    "+new String(data,0,len));
            if(new String(data,0,len).equals("886")){
                break;
            }

        }

        ds.close();





    }
}
