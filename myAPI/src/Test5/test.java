package Test5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Student s1=new Student("max",16,167);
        Student s2=new Student("min",23,167);
        Student s3=new Student("xiao",23,177);

        Student[]arr={s1,s2,s3};
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double temp=o1.getAge()-o2.getAge();
                temp=temp==0 ? o1.getHeight()-o2.getHeight() :temp;

                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;

                if(temp>0){
                    return 1;
                }else if(temp<0){
                    return -1;
                }else{
                    return 0;
                }

            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
