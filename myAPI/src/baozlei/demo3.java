package baozlei;

import java.util.ArrayList;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("请输入一个数");
            String  s= sc.nextLine();

            int num=Integer.parseInt(s);
            if(num>100 ||num<1){
                System.out.println("数据不正确");
                continue;
            }
            list.add(num);
            int sum=getsum(list);
            if(sum>200){
                System.out.println("数据和已经够200");
                break;
            }


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
    public static int getsum(ArrayList<Integer> list){
        int sum=0;
        for(int i=0;i< list.size();i++){
            sum+=list.get(i);
        }

        return sum;

    }
}
