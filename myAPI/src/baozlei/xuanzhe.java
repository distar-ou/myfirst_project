package baozlei;

public class xuanzhe {
    public static void main(String[] args) {
        int []arr={16,5,9,12,21,18,
               32,23,37,26,45,34,
                50,48,61,52,73,66};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
    }
    public static int[]  sort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            //拿着i与i后面的元素进行比较交换
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }return arr;
    }
}
