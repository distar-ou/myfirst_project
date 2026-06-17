package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("demo.Student");
        Constructor con1 = clazz.getDeclaredConstructor();

        System.out.println(con1);
        Constructor con2 = clazz.getDeclaredConstructor(String.class,int.class);
        System.out.println(con2);
        Constructor[] cons1 = clazz.getConstructors();
        for (Constructor constructor : cons1) {
            System.out.println(constructor);
        }
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor constructor : cons2) {
            System.out.println(constructor);
        }

        Student stu =(Student) con2.newInstance("张三", 23);
        System.out.println(stu);
    }
}
