package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);

        Random r=new Random();
        int index=r.nextInt(list.size());
        int i = list.get(index);
        System.out.println(i);

        ArrayList<String> boyList=new ArrayList<>();
        ArrayList<String> girlList=new ArrayList<>();
        Collections.addAll(boyList,"芳香","凡间","饭桶","送盒饭","毒气杨","主义之","珠穆朗玛峰");
        Collections.addAll(girlList,"芳香","萧六","沥青","琉璃","巴士");





        if(i==1){
            int boyindex=r.nextInt(boyList.size());
            System.out.println(boyList.get(boyindex));
        }else{
            int girlindex=r.nextInt(girlList.size());
            System.out.println(girlList.get(girlindex));
        }
    }
}
