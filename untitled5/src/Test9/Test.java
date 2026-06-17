package Test9;

public class Test {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.setAge(2);
        a.setColor("黑色");
        Animal b=new Cat();
        b.setAge(3);
        b.setColor("灰色");
        Person p1=new Person("老王",30);
        Person p2=new Person("老李",25);

        p1.keepPet(a,"骨头");
        p2.keepPet(b,"鱼");

    }
}
