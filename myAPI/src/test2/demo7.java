package test2;

public class demo7 {
    public static void main(String[] args) {
        String s="小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String regex1="[\\w&&[^_]]+";


        String s1 = s.replaceAll(regex1,"vs");
        System.out.println(s1);
        String[] arr = s.split(regex1);

        for (int  i= 0; i < arr.length;i ++) {
            System.out.println(arr[i]);
        }

    }
}
