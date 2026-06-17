package string;

public class demo5 {
    public static void main(String[] args){
        String id="440514200601254233";
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        char sex=id.charAt(16);
        System.out.println(year+"年"+ month+"月"+day+"日");
        int number=sex-48;
        if(number%2==0){
            System.out.println("性别:女");
        }
        else{System.out.println("性别:男");}
    }
}
