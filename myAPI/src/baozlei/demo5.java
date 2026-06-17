package baozlei;

import javax.sound.midi.Soundbank;

public class demo5 {
    public static void main(String[] args) {

        System.out.println(toBinaryString(6));
        System.out.println(Integer.toBinaryString(6));

    }
    public static  String toBinaryString(int num){
        StringBuilder sb=new StringBuilder();
        while(true){
            if(num==0){
                break;
            }else{
                    int redia=num%2;
                    num=num/2;
                    sb.insert(0,redia);

            }

        }
        return sb.toString();


    }
}
