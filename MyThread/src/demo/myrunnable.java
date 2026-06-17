package demo;

import com.sun.security.jgss.GSSUtil;

public class myrunnable implements Runnable{
    int tiket=0;

    @Override
    public void run() {

        while(true){

            if(method()){
                break;
            }

        }

    }
    private synchronized boolean method(){
        if(tiket==100){
            return true;
        }else{
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tiket++;
            System.out.println(Thread.currentThread().getName()+"在卖第"+tiket+"张票");

        }
        return false;

    }



}
