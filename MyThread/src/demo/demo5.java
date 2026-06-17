package demo;

public class demo5 {

    public static void main(String[] args) {
        mythread t1=new mythread();
        mythread t2=new mythread();
        mythread t3=new mythread();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
