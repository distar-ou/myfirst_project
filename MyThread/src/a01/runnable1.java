package a01;

public class runnable1 implements Runnable{
    static int count=0;
    @Override
    public void run() {
        synchronized (runnable1.class) {
            count++;
            System.out.println("当前任务编号：" + count);
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(
                    Thread.currentThread().getName()
                            + "----" + i
            );
        }
    }
}
