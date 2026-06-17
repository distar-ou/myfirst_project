package a01;

public class demo3 {


    public static void main(String[] args) {
        thread3 t1=new thread3();
        thread3 t2=new thread3();
        t1.setName("飞机");
        t2.setName("坦克");
        t1.start();
        t2.start();

    }
}
