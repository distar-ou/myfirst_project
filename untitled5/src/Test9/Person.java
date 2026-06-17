package Test9;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepPet(Animal a,String something){
        if(a instanceof Dog){
            System.out.println(getAge()+"的"+getName()+"喂养了"+a.getAge()+"岁"+a.getColor()+"的"+"狗");
            a.eat(something);
        }else if(a instanceof Cat){
            System.out.println(getAge()+"的"+getName()+"喂养了"+a.getAge()+"岁"+a.getColor()+"的"+"猫");
            a.eat(something);
        }else{
            System.out.println("没有这个类型");
        }
    }
}
