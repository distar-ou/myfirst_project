package demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class mythread extends Thread{

        static int tiket=0;
        static Lock lock=new ReentrantLock();
        public void run(){
            while(true){
                lock.lock();
                try{
                    if(tiket==100){
                        break;
                    }else{

                        Thread.sleep(10);
                        tiket++;
                        System.out.println(getName()+"在卖第"+tiket+"张票");

                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }




            }

        }


}
