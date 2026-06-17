package demo;

public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        //获取字节码文件
        Class Clazz1 = Class.forName("demo.Student");

        Class clazz2 = Student.class;

        Student s=new Student();
        Class Clazz3 = s.getClass();

        System.out.println(Clazz3==clazz2);
        System.out.println(clazz2==Clazz1);

        System.out.println(Clazz3);

    }
}
