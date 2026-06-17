package throwException;

public class demo4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("我执行了吗");

        System.err.println(123);
    }
}
