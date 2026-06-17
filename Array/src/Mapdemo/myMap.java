package Mapdemo;

import java.util.HashMap;
import java.util.Map;

public class myMap {

    public static void main(String[] args) {


        Map<String,String> m=new HashMap<>();

        m.put("杨过","小龙女");
        m.put("韦小宝","暮江平");
        m.put("郭靖","黄蓉");
        //覆盖并返回value
        System.out.println( m.put("韦小宝", "路路"));
        System.out.println(m);
        System.out.println(m.remove("郭靖", "黄蓉"));
        System.out.println(m.remove("杨过"));
        System.out.println(m);


        System.out.println(m.size());
    }
}
