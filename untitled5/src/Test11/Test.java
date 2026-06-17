package Test11;

public class Test {

    public static void main(String[] args) {
        Dog d=new Dog("雄哥",16);
        System.out.println(d.getName()+", "+d.getAge());
        d.swim();
        d.eat();

    }
}
