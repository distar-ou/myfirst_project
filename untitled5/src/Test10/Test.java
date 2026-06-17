package Test10;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog("小狗",19);

        System.out.println(d.getName()+", "+d.getAge());
        d.eat();
    }
}
