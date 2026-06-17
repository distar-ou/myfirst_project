package throwException;

public class Girlfriend {
    private String name;
    private int age;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3||name.length()>10){
            throw new NameFormatException(name+"格式有误，长度应为3到10");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18||age>40){
            throw new AgeOutofBoundsException(age+"格式有误，超出了范围");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
