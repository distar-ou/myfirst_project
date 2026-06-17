package ui;

import javax.swing.*;

public class registerJFrame extends JFrame {

    public  registerJFrame(){
        this.setSize(488,500);

        //设置标题
        this.setTitle("拼图 注册");

        //置顶
        this.setAlwaysOnTop(true);

        //界面居中
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(3);

        //打开界面
        this.setVisible(true);
    }
}
