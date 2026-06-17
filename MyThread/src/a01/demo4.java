package a01;

public class demo4 {

    public static void main(String[] args) throws InterruptedException {
        thread3 t1=new thread3();
        t1.setName("土豆");

        t1.start();


        t1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
