package streamdemo;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test1 {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 = list.stream().filter(s -> get(s)).collect(Collectors.toList());
        System.out.println(list1);

    }
    public static boolean get(int value){
        if(value%2==0){
            return true;
        }else{
            return false;
        }
    }
}
