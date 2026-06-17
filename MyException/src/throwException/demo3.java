package throwException;

public class demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
            String s = null;
            System.out.println(s.equals("abc"));
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        } catch (Exception e) {
            System.out.println("异常");
        }

        System.out.println("我执行了吗");
    }

}
