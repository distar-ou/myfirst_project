package a01;

public class demo2 {

    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.setName("主");
        t2.setName("副");
//备胎线程会在主线程结束后陆续结束
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
