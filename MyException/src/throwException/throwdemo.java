package throwException;

public class throwdemo {

    public static void main(String[] args) {
        int[] arr={};
        int max=0;
        try {
            max=getmax(arr);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("yes");
        System.out.println(max);


    }
    public static int getmax(int[ ] arr) /*throws NullPointerException,ArrayIndexOutOfBoundsException*/{
        if(arr==null){
            throw new NullPointerException();
        }
        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }

        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;


    }
}
