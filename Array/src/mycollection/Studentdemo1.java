package mycollection;

public class Studentdemo1 {
    public static void main(String[] args) {
        Student s1=new Student("张三",23);
        Student s2=new Student("张三",23);

        System.out.println(s1.hashCode());//24022543

        System.out.println(s2.hashCode());// 24022543
    }
}
