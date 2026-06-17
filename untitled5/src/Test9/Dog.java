package Test9;

public class Dog extends Animal{


    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    public void LookHome(){
        System.out.println("狗在看家");
    }

    public void eat(String something){
        System.out.println("狗在吃"+something);
    }
}
