package Test9;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    public void gragmouse(){
        System.out.println("猫在抓老鼠");
    }

    public void eat(String something){
        System.out.println("猫在吃"+something);
    }
}
