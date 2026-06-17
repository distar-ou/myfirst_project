package Test;

public class Goodstest {
    public static void main(String[] args){
        Goods[] arr=new Goods[3];
        Goods g1=new Goods("001","华为mate100",100,7999);
        Goods g2=new Goods("002","华为mate80",100,6999);
        Goods g3=new Goods("003","保温杯",1200,99);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for(int i=0;i<arr.length;i++){
            Goods goods=arr[i];
            System.out.println(goods.getid()+","+goods.getname()+","+goods.getcount()+","+goods.getprice());
        }
    }
}
