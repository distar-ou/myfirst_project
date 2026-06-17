package a01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

public class demo8 {
    public static void main(String[] args) {


        ExecutorService pool1= Executors.newCachedThreadPool();
        ExecutorService pool2=Executors.newFixedThreadPool(2);

        pool2.submit(new runnable1());
        pool2.submit(new runnable1());
        pool2.submit(new runnable1());

       pool2.shutdown();

    }
}
