package ui;

public class Test {
    public static void main(String[] args) {


        Swim s=new Swim(){
            @Override
            public void swim() {
                System.out.println("重写之后的swim方法");
            }
        };
        s.swim();

        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写之后的swim方法");
            }
        }.swim();

    }
}
