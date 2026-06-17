package Test1;
import java.util.Scanner;
public class Cartest {
    public static void main(String[] args){
        Car []arr=new Car[3];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            Car c=new Car();
            System.out.println("请输入汽车的品牌:");
            String brand=sc.next();
            c.setName(brand);
            System.out.println("请输入汽车的颜色:");
            String color=sc.next();
            c.setColor(color);
            System.out.println("请输入汽车的价格:");
            double price=sc.nextInt();
            c.setPrice(price);
            arr[i]=c;
        }
        for(int i=0;i<arr.length;i++){
            Car car=arr[i];
            System.out.println(car.getName()+","+car.getColor()+","+car.getPrice());

        }

    }
}
