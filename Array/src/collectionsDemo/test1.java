package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        Collections.addAll(list,"芳香","凡间","饭桶","送盒饭","毒气杨","主义之","珠穆朗玛峰");
        Random r=new Random();
        int index=r.nextInt(list.size());
        System.out.println(list.get(index));


        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
