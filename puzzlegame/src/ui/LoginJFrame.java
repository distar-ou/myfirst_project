package ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class LoginJFrame extends JFrame{

    public LoginJFrame(){
        initFrame();
        initView();




        this.setVisible(true);
    }

    private void initFrame(){
        this.setSize(488,430);

        //设置标题
        this.setTitle("拼图 登录");

        //置顶
        this.setAlwaysOnTop(true);

        //界面居中
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(3);

        //打开界面
        this.setVisible(true);
    }
    private void initView(){
        ImageIcon icon=new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\login\\用户名.png");
        JLabel usernameText=new JLabel(icon);
        usernameText.setBounds(116,135,47,17);
        this.getContentPane().add(usernameText);

        JTextField username=new JTextField();
        username.setBounds(195,134,200,30);
        this.getContentPane().add(username);

        //JLabel userPassword=new JLabel(new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\login\\密码.png"));
        //userPassword.setBounds(130,195,32,16);
        //this.getContentPane().add(userPassword);

        /*JTextField PasswordText=new JTextField();
        PasswordText.setBounds(195,195,200,30);
        this.getContentPane().add(PasswordText);
*/
    }
}
