package Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(22222);

        ThreadPoolExecutor pool= new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        
        while(true){
            Socket socket = ss.accept();
            //new Thread(new Myrunnable(socket)).start();
            pool.submit(new Myrunnable(socket));
        }





    }
}
