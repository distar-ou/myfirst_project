package a01;

import java.util.ArrayList;
import java.util.Collections;

public class demo6 {


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,800,500,20,5,100,200,700,50,80);
        thread5 t1=new thread5(list);
        thread5 t2=new thread5(list);
        thread5 t3=new thread5(list);
        t1.setName("奖箱1");
        t2.setName("奖箱2");

        t1.start();
        t2.start();


    }
}
