package Test;

public class Goods {
    private String id;
    private String name;
    private int count;
    private double price;

    public Goods(){

    }
    public Goods(String id,String name,int count ,double price){
        this.id=id;
        this.name=name;
        this.count=count;
        this.price=price;
    }
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getcount(){
        return count;
    }
    public double getprice(){
        return price;
    }


}
