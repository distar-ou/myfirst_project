package mycollection;

public class myArraaaylistdemo {
    public static void main(String[] args) {
        myArrayList<String> list=new myArrayList<>();

        list.add("123");
        list.add("124");
        list.add("12");

        System.out.println(list);
        System.out.println(list.get(2));
    }
}
