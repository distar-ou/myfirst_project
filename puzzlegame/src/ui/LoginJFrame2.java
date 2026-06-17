package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoginJFrame2 extends JFrame implements ActionListener , MouseListener {
    JTextField username=new JTextField();
    static class User {
        String name;
        String password;
        User(String name,String password) {
            this.name = name;this.password=password;
        }
    }
    static ArrayList<User> list=new ArrayList<>();
    static {
        list.add(new User("张三","123"));
        list.add(new User("理事","1234"));
    }


    public LoginJFrame2(){
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


    }
    private void initView(){
        this.getContentPane().removeAll();
        this.getContentPane().setLayout(null);

        ImageIcon icon=new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\login\\用户名.png");
        JLabel usernameText=new JLabel(icon);
        usernameText.setBounds(116,135,47,17);
        this.getContentPane().add(usernameText);


        username.setBounds(195,134,200,30);
        this.getContentPane().add(username);

        JLabel userPassword=new JLabel(new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\login\\密码.png"));
        userPassword.setBounds(130,195,32,16);
        this.getContentPane().add(userPassword);

        JTextField PasswordText=new JTextField();
        PasswordText.setBounds(195,195,200,30);
        this.getContentPane().add(PasswordText);


        JLabel codeText=new JLabel(new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\login\\验证码.png"));
        codeText.setBounds(133,256,50,30);
        this.getContentPane().add(codeText);

        JTextField code=new JTextField();
        code.setBounds(196,256,100,30);
        this.getContentPane().add(code);

        String codeStr=CodeUtil.getcode();
        JLabel rightCode=new JLabel();
        rightCode.setText(codeStr);
        rightCode.setBounds(300,256,50,30);
        rightCode.addMouseListener(this);
        this.getContentPane().add(rightCode);

        JButton login=new JButton();
        login.setBounds(123,310,128,47);
        login.setIcon(new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\login\\登录按钮.png"));
        login.addActionListener(this);
        //去除边框
        login.setBorderPainted(false);
        //去除按钮背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        JButton register=new JButton();
        register.setBounds(256,310,128,47);
        register.setIcon(new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\login\\注册按钮.png"));
        //去除边框
        register.setBorderPainted(false);
        //去除按钮背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        JLabel background=new JLabel(new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\login\\background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);




        this.getContentPane().repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = username.getText();
        if(text.equals("张三") || text.equals("理事") ){
            this.dispose();
            new GameJFrame();
         }else{
            showDialog("账号或密码错误");

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String codeStr=CodeUtil.getcode();
        initView();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void showDialog(String content){
        JDialog jDialog=new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning =new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);

    }
}




