package demo;

public class demo1 {
    public static void main(String[] args) {
        mythread t1=new mythread();

        t1.start();

        for(int i=65;i<=65+26;i++){
            System.out.println((char)i);
        }


    }
}
