package Test1;

public class arraycopy {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6,7,8,9,10};
        int []arr2=new int [10];
        //arr: 0 0 0 0 1 2 3 0 0 0
        //System.arraycopy(arr1,0,arr2,4,3);
        //for (int i = 0; i < arr2.length; i++) {
         //   System.out.print(arr2[i]+" ");
        //}
                                              /// 时间原点1970年1月1日0：0：0
        long l=System.currentTimeMillis();
        System.out.println(l);

/// ///arr2:   0 0 7 8 9 0 0 0 0 0
        System.out.println();
        System.arraycopy(arr1,6,arr2,2,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}
