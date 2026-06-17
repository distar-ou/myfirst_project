package Test1;

import javax.swing.*;
import java.awt.*;

public class myJFrame extends JFrame{
    JButton yesBut=new JButton("帅爆了");
    JButton miBut=new JButton("一般般");
    JButton noBut=new JButton("不帅");

    public myJFrame(){
        initJFrame();
        initview();
    }
    public void initJFrame(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private void initview(){
        JLabel text=new JLabel("你觉得自己帅吗");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);
        this.getContentPane().add(text);


    }
}
