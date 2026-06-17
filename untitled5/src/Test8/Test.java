package Test8;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(18);

        administor admin=new administor();
        admin.setAge(32);
        admin.setName("管理员");

        register(s);
        register(admin);

    }


    public static void register(Person p){
        p.show();
    }
}
