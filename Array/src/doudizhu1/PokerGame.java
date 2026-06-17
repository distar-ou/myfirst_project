package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    static ArrayList<String> List = new ArrayList<>();
    static HashMap<String, Integer> hm = new HashMap<>();

    //准备牌
    static {
        String[] color = {"♦", "♥", "♣", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (int i = 0; i < color.length; i++) {
            String c = color[i];
            for (int i1 = 0; i1 < number.length; i1++) {
                String n = number[i1];
                List.add(c + n);
            }
        }
        List.add(" 小王");
        List.add(" 大王");

        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);


    }


    public PokerGame() {

        //打乱
        Collections.shuffle(List);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < List.size(); i++) {
            String num = List.get(i);
            if (i <= 2) {
                lord.add(num);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(num);
            } else if (i % 3 == 1) {
                player2.add(num);
            } else {
                player3.add(num);
            }

        }

        order(lord);
        order(player2);
        order(player3);
        order(player1);




        //看牌
        lookPoker("底牌", lord);
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);

    }

    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int value1 = getvalue(o1);
                String color2 = o2.substring(0, 1);
                int value2 = getvalue(o2);

                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });


    }


    public int getvalue(String poker) {
        String number = poker.substring(1);
        if (hm.containsKey(number)) {
            return hm.get(number);
        } else {
            return Integer.parseInt(number);
        }
    }


    public static void lookPoker(String name, ArrayList<String> list) {

        System.out.print(name + ":" + list);
        System.out.println();
    }
}
