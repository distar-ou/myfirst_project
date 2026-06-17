package doudizhu1;

import java.util.*;

public class PokerGame1 {
    static ArrayList<Integer> List = new ArrayList<>();
    static HashMap<Integer, String> hm = new HashMap<>();

    //准备牌
    static {
        String[] color = {"♦", "♥", "♣", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialNumber = 1;
        for (String s : number) {
            for (String c : color) {
                hm.put(serialNumber, s + c);List.add(serialNumber);
                serialNumber++;

            }
        }
        List.add(serialNumber);
        hm.put(serialNumber++, "小王");
        List.add(serialNumber);
        hm.put(serialNumber, "大王");


    }


    public PokerGame1() {

        //打乱
        Collections.shuffle(List);

        TreeSet<Integer> lord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();
        for (int i = 0; i < List.size(); i++) {

            if(i<=2){
                lord.add(List.get(i));
                continue;
            }
            if(i%3==0){
                player1.add(List.get(i));
            }else if(i%3==1){
                player2.add(List.get(i));

            }else{
                player3.add(List.get(i));

            }
        }
        lookpoker("底牌",lord);
        lookpoker("玩家1",player1);
        lookpoker("玩家2",player2);
        lookpoker("玩家3",player3);



    }

    public void lookpoker(String name,TreeSet<Integer> list){
        System.out.print(name+": ");
        for (Integer i : list) {
            System.out.print(hm.get(i)+" ");
        }
        System.out.println();
    }
}