package baozlei;

public class demo4 {
    public static void main(String[] args) {
        String str="123";
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("数据错误");
        }else{
            System.out.println("数据正确");

            int number=Integer.parseInt(str);
            System.out.println(number+1);
        }
    }
}
