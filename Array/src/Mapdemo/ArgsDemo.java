package Mapdemo;

public class ArgsDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getsum1(arr));
        System.out.println(getsum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static int getsum1(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
    public static int getsum2(int a,int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
