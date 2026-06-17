package mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class diedaiqi {
//    Collection系列集合三种通用的適历方式:
//            1.迭代器遍历
//            2.增强for遍历
//            3.1ambda表达式遍历
//
//    迭代器遍历相关的三个方法:
//    Iterator<E> iterator():获取一个迭代器对象
//    boolean hasNext():判断当前指向的位置是否有元素
//    E next():获取当前指向的元素并移动指针
public static void main(String[] args) {
    Collection<String> coll=new ArrayList<>();
    coll.add("aaa");
    coll.add("bbb");
    coll.add("vcc");
    coll.add("ddd");

    Iterator<String> it = coll.iterator();    //默认指向0索引
    while(it.hasNext()){
        String str=it.next();
        System.out.println(str);
    }//遍历结束后，指针不会复位
    //循环中只能调用一次it。next（）
    //迭代器遍历时，不能使用集合的方法来添加或删除
    Iterator<String> it2 = coll.iterator();
    while(it2.hasNext()){
        String str=it2.next();
        if("bbb".equals(str))
        {
            it2.remove();
        }

    }
    System.out.println(coll);

}

}
