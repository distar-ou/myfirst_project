package baozlei;

public class demo9 {
    public static void main(String[] args) {
        //分块查找
        int []arr={16,5,9,12,21,18,
                   32,23,37,26,45,34,
                   50,48,61,52,73,66};
        int num= arr.length;
        sort_insert(arr,num);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public  static  int[] sort(int[]arr,int num){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;
    }
    public static int []  sort_insert(int[ ]arr,int num){
        int i,j;
        for( i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                int key=arr[i];
                for( j=i-1 ;j>=0&&arr[j]>key;j--){
                    arr[j+1]=arr[j];
                }
                arr[j+1]=key;
            }

        }
        return arr;
    }
}

