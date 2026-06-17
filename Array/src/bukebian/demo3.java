package bukebian;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo3 {

    public static void main(String[] args) {

        Map<String, String> map = Map.of("张三", "北京");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        HashMap<Integer, Integer> m = new HashMap<>();


        m.put(1, 11);
        m.put(2, 22);
        m.put(3, 33);
        m.put(4, 44);
        m.put(5, 55);
        m.put(6, 66);
        m.put(7, 77);
        m.put(8, 88);
        m.put(9, 99);
        m.put(10, 1010);
        m.put(11, 1111);

//        Map.Entry[] array = m.entrySet().toArray(new Map.Entry[0]);
//        Map map1 = Map.ofEntries(array);
//        map1.put(12,1212);
        Map<Integer, Integer> map1 = Map.copyOf(m);


    }
}
