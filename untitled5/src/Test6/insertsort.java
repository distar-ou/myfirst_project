package Test6;
import java.util.Scanner;
public class insertsort {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        int i,j;
        for( i=2;i<=n;i++){
            if(arr[i]<arr[i-1]){
                arr[0]=arr[i];
                for( j=i-1;arr[j]>arr[0];j--){
                    arr[j+1]=arr[j];
                }
                arr[j+1]=arr[0];
            }

        }
        System.out.println();
        for(i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }





}
