package string;
import java.util.Scanner;
public class StringDemo {
    public static void main(String[ ] args){
        String rightusername="月月";
        String rightuserPassword="12345";

        for (int i=0;i<3;i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名:");
            String username=sc.next();
            System.out.println("请输入账号密码:");
            String userpassword=sc.next();
            if(username.equals(rightusername) && userpassword.equals(rightuserPassword)){
                System.out.println("用户登陆成功");
            }
            else if(i==2){
                System.out.println("账号"+username+"被锁定，请10分钟后重新尝试");
            }
            else{
                System.out.println("登陆失败，账号名或密码错误，还剩"+(2-i)+"次机会");
            }
        }
    }
}
