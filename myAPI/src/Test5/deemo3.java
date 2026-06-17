package Test5;

public class deemo3 {
    public static void main(String[] args) {
        System.out.println(getcount(20));
    }
    public static int getcount(int floor){
        if(floor==1){
            return 1;
        } else if (floor==2) {
            return 2;
        } else if (floor==3) {
            return 4;
        }
        else{
            return getcount(floor-1)+getcount(floor-2)+getcount(floor-3);
        }
    }
}
