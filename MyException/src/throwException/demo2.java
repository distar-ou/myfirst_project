package throwException;

public class demo2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        try{
            System.out.println(arr[10]);//此处异常，就会创建一个ArrayIndexOutOfBoundsException的对象
                                        //new ArrayIndexOutOfBoundsException（）
                                        //看看catch的小括号里的变量能不能接收这个对象
                                        //如果能，就意味着异常被捕获，就执行catch里的代码
                                        //执行完catch里的代码，还会继续执行try-catch下面的代码
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("索引越界");
        }

        System.out.println("我运行了吗");
    }
}
