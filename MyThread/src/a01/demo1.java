package a01;

import java.sql.SQLOutput;

public class demo1 {

    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();

        Thread t1=new Thread(mr,"窗口1");
        Thread t2=new Thread(mr,"窗口2");
        Thread t3=new Thread(mr,"窗口3");
        t1.setPriority(10);
        t2.setPriority(7);

        t1.start();
        t2.start();
        t3.start();

    }

}
