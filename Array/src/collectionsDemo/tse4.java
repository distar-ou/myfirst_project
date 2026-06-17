package collectionsDemo;

import java.util.*;

public class tse4 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm=new HashMap<>();

        ArrayList<String> city=new ArrayList<>();

        city.add("南京");
        city.add("无锡");
        city.add("苏州");
        city.add("扬州");

        hm.put("江苏省",city);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner js=new StringJoiner(", ","","");
            for (String s : value) {
                js.add(s);
            }
            System.out.println(key+"="+js);

        }

    }
}
