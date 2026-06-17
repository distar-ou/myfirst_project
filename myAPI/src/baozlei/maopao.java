package baozlei;

import java.util.Random;

public class maopao {
    public static void main(String[] args) {
//        int []arr={16,5,9,12,21,18,
//                32,23,37,26,45,34,
//                50,48,61,52,73,66};
        int []arr=new int[100000];
        Random r=new Random();
        for(int i=0;i< arr.length;i++){
            arr[i]=r.nextInt();
        }
        long start=System.currentTimeMillis();
        sort(arr);

        //for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i]+" ");
        //}
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static int [] sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
