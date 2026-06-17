package mycollection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listdemo {
//    void add(int index, E element) 在此集合中的指定位置插入指定的元素
//    E remove(int index)             删除指定索引处的元素,返回被删除的元素
//    E set(int index, E element)     修改指定索引处的元素,返回被修改的元素
//    E get(int index)                返回指定索引处的元素
    public static void main(String[] args) {
    List<String> list=new ArrayList<>();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");

        ListIterator<String> it = list.listIterator();


        while(it.hasNext()){
            String s=it.next();
            if("bbb".equals(s)){
                it.add("qqq");
            }
            System.out.println(s);
        }
        System.out.println("--------------------");
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
