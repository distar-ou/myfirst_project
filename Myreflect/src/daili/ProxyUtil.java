package daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {



    public static Star CreateProxy(BigStar bigStar){
        Star star = (Star)Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("Sing")){
                            System.out.println("准备话筒，收钱");
                        }else if(method.getName().equals("Dance")){
                            System.out.println("准备舞台，收钱");
                        }

                        return method.invoke(bigStar,args);
                    }
                }
        );
        return star;
    }
}
