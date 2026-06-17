package Chat;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> Uer = new HashMap<>();
        InputStreamReader isr = new InputStreamReader(new FileInputStream
                ("C:\\Users\\HP\\IdeaProjects\\MyNet\\Nerinfo"));
        BufferedReader br = new BufferedReader(isr);
        String uer;
        while ((uer = br.readLine()) != null) {
            list.add(uer);
        }
        for (String s : list) {
            String key = s.split("&")[0];
            Integer value = Integer.parseInt(s.split("&")[1]);
            Uer.put(key, value);

        }
        System.out.println(Uer);


        System.out.println("-------------欢迎来到聊天室------------");
        System.out.println("登录请按1");
        System.out.println("注册请按2");
        int n = sc.nextInt();
        sc.nextLine();
        String name="";
        if (n == 1) {
            while (true) {
                System.out.println("请输入账号:");
                name = sc.nextLine();
                if (!Uer.containsKey(name)) {
                    System.out.println("账号不存在");
                    continue;
                } else {
                    System.out.println("请输入密码:");
                    int password = sc.nextInt();
                    sc.nextLine();
                    if (password == Uer.get(name)) {
                        System.out.println("登录成功");
                        break;
                    } else {
                        System.out.println("密码错误");
                        continue;
                    }
                }
            }
        } else if (n == 2) {
            System.out.println("请输入账号:");
            name = sc.nextLine();
            System.out.println("请输入密码:");
            int number = sc.nextInt();
            Uer.put(name, number);
        }

        Socket socket = new Socket("127.0.0.1", 22222);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        new ClientThread(socket).start();

        while (true){
            String msg=sc.nextLine();
            bw.write(name+":"+msg);
            bw.newLine();
            bw.flush();
        }





    }
}
