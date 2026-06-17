package mycollection;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private  String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
   //o:表示已经添加在红黑树的元素
    //this：表示要添加的元素
    @Override
    public int compareTo(Student o) {

        System.out.println("---------------");
        System.out.println("this:"+this);
        System.out.println("o:"+o);

        return this.getAge()-o.getAge();
    }
}
