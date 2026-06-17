package Mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class hashmap_demo {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};

        HashMap<String, Integer> hm = new HashMap<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            if (hm.containsKey(arr[index])) {
                int count = hm.get(arr[index]);
                count++;
                hm.put(arr[index], count);

            } else {
                hm.put(arr[index], 1);
            }
        }
        System.out.println(hm);

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }

        System.out.println();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
