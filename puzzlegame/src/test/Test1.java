package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {

    public static void main(String[] args) {
        //设置界面
        JFrame jFrame=new JFrame();
        jFrame.setSize(603,680);

        jFrame.setTitle("事件演示");
        //界面居中设置
        jFrame.setLocationRelativeTo(null);

        jFrame.setAlwaysOnTop(true);

        jFrame.setDefaultCloseOperation(3);

        jFrame.setLayout(null);
        //反馈
        JButton jtb=new JButton("点我");

        jtb.setBounds(0,0,100,50);

        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });


        jFrame.getContentPane().add(jtb);


        jFrame.setVisible(true);
    }
}
