package demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress adress=InetAddress.getByName("LAPTOP-F1NKMGN7");
        System.out.println(adress);

        String hostAddress = adress.getHostAddress();
        System.out.println(hostAddress);

        String hostName = adress.getHostName();
        System.out.println(hostName);


    }
}
