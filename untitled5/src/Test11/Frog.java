package Test11;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("青蛙吃虫子");
    }
    public void swim(){
        System.out.println("青蛙在蛙泳");
    }
}
