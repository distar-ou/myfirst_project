package throwException;

import java.util.Scanner;

public class demo5 {

    public static void main(String[] args) {
        Girlfriend s=new Girlfriend();
        Scanner sc=new Scanner(System.in);

        while (true) {
            try {
                System.out.println("请输入名字:");
                String name=sc.nextLine();
                s.setName(name);

                System.out.println("请输入年龄:");
                String age=sc.nextLine();
                s.setAge(Integer.parseInt(age));
                break;
            }catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            }catch (NameFormatException e){
                e.printStackTrace();
                continue;
            }catch (AgeOutofBoundsException e){
                e.printStackTrace();
            }
        }

        System.out.println(s);

    }
}
