package mycollection;

import java.util.Arrays;

public class myArrayList<E> {
    Object[] obj=new Object[10];
    int size;
    public boolean add(E e){
        obj[size]=e;
        size++;
        return true;
    }
    public E get(int index){
        return (E)obj[index];
    }

    public String toString(){
        return Arrays.toString(obj);
    }
}
