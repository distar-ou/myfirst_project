package daili;

public class Test {

    public static void main(String[] args) {
        
        BigStar bigStar=new BigStar("鸡哥");
        Star proxy = ProxyUtil.CreateProxy(bigStar);
        String sing = proxy.Sing("只因你太美");
        System.out.println(sing);
        proxy.Dance();
    }
}
