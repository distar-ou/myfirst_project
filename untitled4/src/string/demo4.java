package string;

public class demo4 {
    public static void main(String[] args){
        String phonenumber="17576014245";
        String start=phonenumber.substring(0,3);
        String end=phonenumber.substring(7);
        String result=start+"****"+end;
        System.out.println(result);

    }

}