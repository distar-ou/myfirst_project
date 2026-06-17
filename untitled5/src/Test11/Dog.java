package Test11;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void swim(){
        System.out.println("狗在狗刨");
    }
}
