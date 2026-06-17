package mycollection;

import java.util.ArrayList;

public class listutilTest {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        mylistutil.addAll(list,1,2,3,4,5,6);
        System.out.println(list);
    }
}
