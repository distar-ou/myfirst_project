package mycollection;

import java.util.ArrayList;

public class mylistutil {
    private mylistutil(){

    }
    //泛型方法
    public static<E> void addAll(ArrayList<E>list,E...e){
        for (E e1 : e) {
            list.add(e1);
        }


    }
}
