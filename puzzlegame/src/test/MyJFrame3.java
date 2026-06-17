package test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {

    public MyJFrame3(){
        this.setSize(603,680);

        this.setTitle("事件演示");
        //界面居中设置
        this.setLocationRelativeTo(null);

        this.setAlwaysOnTop(true);

        this.setDefaultCloseOperation(3);

        this.setLayout(null);



        this.addKeyListener(this);



        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("按键不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code=e.getKeyCode();
        System.out.println("按键松开");
        if(code==65){
            System.out.println("现在按下的是A");
        }else if(code==66){
            System.out.println("现在按下的是B");
        }
    }
}
