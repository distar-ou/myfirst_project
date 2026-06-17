package demo;

import javax.xml.catalog.CatalogFeatures;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        mycalllable mc=new mycalllable();
        FutureTask<Integer>  ft=new FutureTask<>(mc);
        Thread t1=new Thread(ft);

        t1.start();

        Integer i = ft.get();
        System.out.println(i);


    }
}
