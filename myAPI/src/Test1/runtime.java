package Test1;

import java.io.IOException;

public class runtime {
    public static void main(String[] args) throws IOException {
        //获取当前系统的运行环境的对象
       /* Runtime r1=Runtime.getRuntime();
        Runtime r2=Runtime.getRuntime();
        System.out.println(r1==r2);
*/
        //停止虚拟机
        //Runtime.getRuntime().exit(0);
        System.out.println("执行");

        //获取cpu的线程
        System.out.println(Runtime.getRuntime().availableProcessors());

        //总内存大小
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //已经获取的总内存的大小
        System.out.println(Runtime.getRuntime().totalMemory() /1024 /1024);
        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() /1024 /1024);

        //运行cmd
        //shutdown   :关机

        //-s:默认1分钟后关机
        //-s -t 指定时间关机
        //-a  取消关机
        Runtime.getRuntime().exec("notepad");


        Runtime.getRuntime().exec("shutdown -a");
        }
}
