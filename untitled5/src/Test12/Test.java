package Test12;

public class Test {
    public static void main(String[] args) {
        basketballsporter bbs=new basketballsporter("老山",22);
        System.out.println(bbs.getName()+", "+bbs.getAge());
        bbs.Study();

        pinponspoorter ppps=new pinponspoorter("小雨",44);
        System.out.println(ppps.getName()+" ,"+ppps.getAge());
        ppps.Study();
        ppps.tall();
    }
}
