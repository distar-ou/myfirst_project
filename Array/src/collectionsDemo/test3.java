package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        ArrayList<String> List=new ArrayList<>();
        ArrayList<String> List2=new ArrayList<>();

        Collections.addAll(List,"芳香","凡间","饭桶","送盒饭","毒气杨","主义之","珠穆朗玛峰");
        for (int i = 0; i < 10; i++) {
            int count=List.size();

            Random r=new Random();
            for (int j = 0; j < count; j++) {
                int index=r.nextInt(List.size());
                String name=List.remove(index);
                List2.add(name);
                System.out.println(name);
            }

            List.addAll(List2);List2.clear();
            System.out.println("---------------------------");
        }





    }
}
