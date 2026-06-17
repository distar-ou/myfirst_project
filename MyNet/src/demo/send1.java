package demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;
import java.util.Scanner;

public class send1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(22222);
        Scanner sc=new Scanner(System.in);

        InetAddress adress=InetAddress.getByName("127.0.0.1");
        int port=10086;
        while(true){
            String str=sc.nextLine();

            byte[] bytes = str.getBytes();
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length,adress,port);
            ds.send(dp);
            if(str.equals("886")){
                break;
            }
        }

        ds.close();
    }
}
