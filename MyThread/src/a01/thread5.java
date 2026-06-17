package a01;

import java.util.ArrayList;
import java.util.Collections;

public class thread5 extends Thread {

    ArrayList<Integer> list;

    public thread5(ArrayList<Integer> list) {
        this.list = list;
    }

    public void run() {
        ArrayList<Integer> boxlist = new ArrayList<>();
        while (true) {

            synchronized (thread5.class) {

                if (list.size() == 0) {

                    System.out.println(getName() + boxlist + "最大奖项为" + getMax(boxlist) + "元");
                    break;
                } else {
                    Collections.shuffle(list);

                    int price = list.remove(0);
                    boxlist.add(price);
                    //System.out.println(getName()+"又产生了一个"+price+"元的奖项");


                }
            }
            try {
                thread5.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }


    }

    public int getMax(ArrayList<Integer> list) {

        int max = 0;

        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }
}
