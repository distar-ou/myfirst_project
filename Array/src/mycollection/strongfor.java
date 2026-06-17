package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class strongfor {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("aaa");
        coll.add("aaa");
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
