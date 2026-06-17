package Test5;

public class demo1 {
    public static void main(String[] args) {
        System.out.print( getSum(12));
    }
    public static int getSum(int month){
        if(month ==1 ||month ==2)
        {
            return 1;

        }else {
            return getSum(month-1)+getSum(month-2);
        }
    }
}
