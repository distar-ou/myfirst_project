package fileDemo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo8 {
    public static void main(String[] args) {
        File scr=new File("C:\\Users\\HP\\Desktop\\Java");
        HashMap<String, Integer> hm = getcount(scr);
        System.out.println(hm);

    }
    public static HashMap<String,Integer> getcount(File scr){
        HashMap<String,Integer> hm=new HashMap<>();

        File[] files = scr.listFiles();
        if(files!=null){
            for (File file : files) {
                if(file.isFile()){
                    String[] arr = file.getName().split("\\.");
                    if(arr.length>=2){
                        String name=arr[arr.length-1];
                        if(hm.containsKey(name)){
                            int i = hm.get(name);
                            i++;
                            hm.put(name,i);
                        }else{
                            hm.put(name,1);
                        }
                    }


                } else{
                    HashMap<String, Integer> soonmap = getcount(file);
                    Set<Map.Entry<String, Integer>> entries = soonmap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        int value = entry.getValue();
                        if(hm.containsKey(key)){
                            int i = hm.get(key);
                            int count=value+i;
                            hm.put(key,count);
                        }else{
                            hm.put(key,value);
                        }

                    }



                }
            }
        }

        return hm;

    }
}
