package Test10;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("吃草");
    }
}
