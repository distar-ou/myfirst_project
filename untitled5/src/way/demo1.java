package way;

public class demo1 {
    public static void main(String[] args){
        int []arr={23,34,4,2};
        int max=getmax(arr);
        System.out.print(max);
    }

    public static int getmax(int []arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
