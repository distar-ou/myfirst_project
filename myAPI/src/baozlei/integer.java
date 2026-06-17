package baozlei;

public class integer {
    public static void main(String[] args) {
        Integer i1=Integer.valueOf(127);
        Integer i2=Integer.valueOf("127");
        System.out.println(i1 == i2);


        Integer i3=Integer.valueOf(128);
        Integer i4=Integer.valueOf(128);
        System.out.println(i3==i4);

        int result=i1.intValue()+i2.intValue();
        Integer i5=result;
        System.out.println(i5);


        //自动拆箱
        Integer i6=10;
        Integer i7=10;



        Integer i8=i6+i7;
        System.out.println(i8);
    }
}
