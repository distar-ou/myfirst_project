package a01;

public class thread3 extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+i);
            Thread.yield();//尽可能均匀
        }


    }
}
