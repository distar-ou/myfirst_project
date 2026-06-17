package demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class recive {

    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);

        byte[] bytes=new byte[1024];

        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        System.out.println(111);
        ds.receive(dp);
        System.out.println(222);
        InetAddress address = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        int port = dp.getPort();
        ds.close();
        System.out.println("从"+address+"这台电脑的"+port+"端接收到    "+new String(data,0,length));
    }
}
