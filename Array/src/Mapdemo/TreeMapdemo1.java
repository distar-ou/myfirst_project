package Mapdemo;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapdemo1 {
    public static void main(String[] args) {

        String str="aababcabcdadcde";
        TreeMap<Character,Integer> tm=new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(tm.containsKey(c)){
                int count=tm.get(c);
                count++;
                tm.put(c,count);
            }else{
                tm.put(c,1);
            }
        }
        StringBuilder sb=new StringBuilder();

       tm.forEach((Character character, Integer integer) ->{
               sb.append(character).append("(").append(integer).append(")");
           }
       );
        System.out.println(sb);

        StringJoiner sj=new StringJoiner("","","");

        tm.forEach((key,value)->sj.add(key+"").add("(").add(value+"").add(")"));
        System.out.println(sj);
    }
}
