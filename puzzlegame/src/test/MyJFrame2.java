package test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    JButton jtb=new JButton("点我");
    public MyJFrame2(){
        this.setSize(603,680);

        this.setTitle("事件演示");
        //界面居中设置
        this.setLocationRelativeTo(null);

        this.setAlwaysOnTop(true);

        this.setDefaultCloseOperation(3);

        this.setLayout(null);




        jtb.setBounds(0,0,100,50);
        jtb.addMouseListener(this);



        this.getContentPane().add(jtb);

        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
