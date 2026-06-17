package a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,800,500,20,5,100,200,700,50,80);
        callable1 cc=new callable1(list);
        FutureTask<Integer> f1=new FutureTask<>(cc);
        FutureTask<Integer> f2=new FutureTask<>(cc);


        Thread t1=new Thread(f1);
        Thread t2=new Thread(f2);


        t1.start();
        t2.start();

        Integer n1 = f1.get();
        Integer n2 = f2.get();
        System.out.println(n1);
        System.out.println(n2);



    }
}
