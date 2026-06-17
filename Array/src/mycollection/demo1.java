package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class demo1 {
//    public boolean add(E e)        添加
//    public void clear()               清空
//    public boolean remove(E e)删除
//    public boolean contains(Object obj)判断是否包含
//    public boolean isEmpty() 判断是否为空
//    public int size() 集合长度
public static void main(String[] args) {
    //Collection是一个接口，不能直接创建对象，需要通过创建实现类来调用方法
    //实现类：ArrayList
    Collection<String> coll=new ArrayList<>();
    coll.add("aaa");
    coll.add("bbb");
    coll.add("ccc");
    System.out.println(coll);


    System.out.println(coll.remove("aaa"));
    System.out.println(coll);
//  当判断自定义类时，要再自己定义的类中重写equals方法
    System.out.println(coll.contains("bbb"));
    coll.add("ddd");
    System.out.println(coll.size());

    System.out.println(coll.isEmpty());

}
}
