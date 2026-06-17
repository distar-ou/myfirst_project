package baozlei;

public class charu {
    public static void main(String[] args) {
        int []arr={16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sort(int[]arr){
        int start=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                start=i+1;
                break;
            }
        }

        for(int i=start;i< arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        return arr;
    }
}
