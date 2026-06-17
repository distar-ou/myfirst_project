package baozlei;

import java.util.Random;

public class puickSort {
    public static void main(String[] args) {
        //int[] arr = {16, 5, 9, 12, 21, 18,
         //       32, 23, 37, 26, 45, 34,
           //     50, 48, 61, 52, 73, 66};
        int []arr=new int [1000000];
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt();
        }
        long start=System.currentTimeMillis();
        quickly_sort(arr, 0, arr.length - 1);
        long end=System.currentTimeMillis();
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i] + " ");
        //}
        System.out.println(end-start);

    }

    public static void quickly_sort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start >= end) {
            return;
        }
        int baseNumber = arr[i];
        //利用循环找到要交换的数
        while (start != end) {
            //利用end，从后往前找，找到比基准数小的数
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start从前往后找，找到比基准数大的数
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            //把start和ebd所指的元素互换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;



        }
        //start和ebd相等，基准数归位
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp ;


            //再确定范围，重复操作
        quickly_sort(arr, i, start - 1);
        quickly_sort(arr, start + 1, j);
    }
}