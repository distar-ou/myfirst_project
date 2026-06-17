package Test;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class Myrunnable implements Runnable{
   Socket socket;
   public Myrunnable(Socket socket){
       this.socket=socket;
   }

    @Override


    public void run() {
        try {
            BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
            String name = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream bos=new BufferedOutputStream(
                    new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\MyNet\\Serverdir\\"+name+".jpg"));
            byte[] bytes=new byte[1024];
            int len;
            while((len=bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
            }

            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
