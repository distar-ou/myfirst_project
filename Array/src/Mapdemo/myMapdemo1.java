package Mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class myMapdemo1 {

    public static void main(String[] args) {

        Map<String,String> m=new HashMap<>();

        m.put("杨过","小龙女");
        m.put("韦小宝","暮江平");
        m.put("郭靖","黄蓉");

        //通过键找值
        Set<String> keys=m.keySet();

        for (String key : keys) {
            //System.out.println(key);

            String str=m.get(key);
            //System.out.println(key+"->"+str);
        }
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String str=m.get(it.next());
            //System.out.println(str);
        }
        System.out.println(System.getProperty("java.version"));
        //第二种遍历
        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //System.out.println(entry.getKey()+"="+entry.getValue());
        }

        Iterator<Map.Entry<String, String>> it2 = entries.iterator();
//        while (it2.hasNext()){
//
//            //System.out.println(it2.next());
//        }
        System.out.println(entries.size());
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                System.out.println(stringStringEntry);
            }
        });


        m.forEach(( s,  s2)-> {
            System.out.println(s+"="+s2);
            }
        );

    }

}
