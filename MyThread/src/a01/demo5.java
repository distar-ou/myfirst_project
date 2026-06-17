package a01;

public class demo5 {

    public static void main(String[] args) {
        thread4 t1=new thread4();
        thread4 t2=new thread4();
        thread4 t3=new thread4();
        thread4 t4=new thread4();
        thread4 t5=new thread4();

        t1.setName("小A");
        t2.setName("小B");
        t3.setName("小C");
        t4.setName("小D");
        t5.setName("小E");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
