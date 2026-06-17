package Test6;

import java.util.Scanner;

public class Binsertsort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i=2;i<n;i++){
            arr[0]=arr[i];
            int low=1;int high=i-1;

            while(low<=high){
                int mid=(low+high)/2;
                if(arr[0]<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            for(int j=i-1;j>=high+1;j--){
                arr[j+1]=arr[j];
            }
            arr[high+1]=arr[0];
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}