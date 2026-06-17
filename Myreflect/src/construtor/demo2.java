package construtor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class demo2 {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Student s=new Student("张三",23,"男");
        Teacher t=new Teacher("李四",177);

         saveField(s);
    }
    public static void saveField(Object obj) throws IllegalAccessException, IOException {
        Class clazz = obj.getClass();BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\HP\\IdeaProjects\\Myreflect\\a.txt"));
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object o = field.get(obj);

            bw.write(name+"="+o);
            bw.newLine();


        }
        bw.close();

    }
}
