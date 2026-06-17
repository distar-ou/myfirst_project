package a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class callable1 implements Callable<Integer> {
    ArrayList<Integer> list;

    public callable1(ArrayList<Integer> list) {
        this.list = list;
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
    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxlist = new ArrayList<>();
        while (true) {

            synchronized (thread5.class) {

                if (list.size() == 0) {

                    System.out.println(Thread.currentThread().getName() + boxlist + "最大奖项为" + getMax(boxlist) + "元");
                    break;
                } else {
                    Collections.shuffle(list);

                    int price = list.remove(0);
                    boxlist.add(price);
                    //System.out.println(getName()+"又产生了一个"+price+"元的奖项");


                }
            }

                thread5.sleep(10);
            }

            if(boxlist.size()==0){
                return null;
            }else{
                return Collections.max(boxlist);
            }



    }




}


