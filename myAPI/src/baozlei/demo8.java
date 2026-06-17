package baozlei;

public class demo8 {
    public static void main(String[] args) {
        int []arr={13,14,24,35,66,88,98};
        System.out.println(insert_sort(arr,98));

    }
    public static int insert_sort(int []arr,int num){
        int low=0;int high= arr.length-1;
        while(low<high){
            int mid=(num-arr[low])/(arr[high]-arr[low])*(high-low)+low;
            if(arr[mid]<num){
                low=mid+1;
            } else if (arr[mid]>num) {
                high=mid-1;
            }
            else {
                return mid+1;
            }
        }
        return -1;
    }
}
