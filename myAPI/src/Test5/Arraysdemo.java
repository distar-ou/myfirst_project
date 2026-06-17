package Test5;

import java.util.Arrays;
import java.util.Comparator;

public class Arraysdemo {
    public static void main(String[] args) {

         Integer[]arr={16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};
        System.out.println(Arrays.toString(arr));


    Arrays.sort(arr,new Comparator<Integer>(){

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    });


        //lamda完整格式
        Arrays.sort(arr, (Integer o1, Integer o2)-> {
                return o1-o2;
            }
        );

        //lamda简化格式
        Arrays.sort(arr,( o1,  o2)->  o1-o2);




        System.out.println(Arrays.toString(arr));
    }


}
