package a01;

import java.sql.SQLOutput;

public class MyRunnable implements Runnable{
    int tiket=0;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(tiket==1000){
                    break;
                }else{
                    tiket++;
                    System.out.println(Thread.currentThread().getName()+"在卖第"+tiket+"张票");
                }



            }


        }
    }
}
