package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("","",""));
        Collections.addAll(list1,"","","","");
        Collections.addAll(list, "qwe", "er", "rt", "sdf");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"er"));

        Collections.copy(list1,list);
        System.out.println(list1);

        Collections.fill(list2,"a");
        System.out.println(list2);

        System.out.println(Collections.max(list));

        System.out.println(Collections.min(list));
    }
}
