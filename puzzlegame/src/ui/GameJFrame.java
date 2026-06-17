package ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int [][]data=new int [4][4];


    JMenuItem replayItem=new JMenuItem("重新游戏");
    JMenuItem reLoginItem=new JMenuItem("重新登录");
    JMenuItem closeItem=new JMenuItem("关闭游戏");

    JMenuItem accountItem=new JMenuItem("公众号");

    JMenuItem girl=new JMenuItem("美女");
    JMenuItem animal=new JMenuItem("动物");
    JMenuItem sport=new JMenuItem("运动");


    int x=0;
    int y=0;

    int [][]win={
            {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}
    };

    int step=0;

    String path="C:\\Users\\HP\\IdeaProjects\\puzzlegame\\animal3\\";

    public GameJFrame(){

        initFrame();

        initJMenubar();


        //初始化图片
        //初始化数据（打乱）
        initdata();


        initImage();


        //打开界面
        this.setVisible(true);

    }
    //初始化图片数据(打乱)
    private void initdata() {
        int []tempArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r=new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index=r.nextInt(tempArr.length);

            int temp=tempArr[i];
            tempArr[i]=tempArr[index];
            tempArr[index]=temp;

        }


        for (int i = 0; i < tempArr.length ; i++) {

            if(tempArr[i]==0){
                x=i/4;y=i%4;
            }
            data[i/4][i%4]=tempArr[i];


        }

    }

    //初始化图片
    private void initImage() {
        //清空原本已经出现图片
        this.getContentPane().removeAll();

        if(victory()){

            JLabel winjLabel=new JLabel(new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\win.png"));
            winjLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winjLabel);

        }
        JLabel stepcount=new JLabel("步数: "+step);
        stepcount.setBounds(50,30,100,20);
        this.getContentPane().add(stepcount);



        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个图片ImageIcon的对象
                int num=data[i][j];
                ImageIcon icon=new ImageIcon(path+ ""+num+".jpg");
                //创建一个JLabel的对象
                JLabel jLabel=new JLabel(icon);
                jLabel.setBounds(105*j+83,105*i+134,105,105);

                jLabel.setBorder(new BevelBorder(1));


                //获取隐藏容器，在把JLabel添加到界面
                this.getContentPane().add(jLabel);


            }

        }


        ImageIcon icon=new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\background.png");
        JLabel backgroup=new JLabel(icon);
        backgroup.setBounds(40,40,508,560);
        this.getContentPane().add(backgroup);


        //刷新一下界面
        this.getContentPane().repaint();
    }


    private void initFrame(){
        this.setSize(603,680);

        //设置标题
        this.setTitle("拼图单机版 v1.0");

        //置顶
        this.setAlwaysOnTop(true);

        //界面居中
        this.setLocationRelativeTo(null);
        //关闭操作
        this.setDefaultCloseOperation(3);


        //取消默认的居中位置，这样才会按照XY轴的形式添加组件

        this.setLayout(null);

        this.addKeyListener(this);


    }

    private void initJMenubar(){
        //初始化菜单
        JMenuBar jMenuBar=new JMenuBar();

        JMenu changeImage=new JMenu("更换图片");
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");



        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);


        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);animal.addActionListener(this);
        sport.addActionListener(this);



        this.setJMenuBar(jMenuBar);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code=e.getKeyCode();
        if(code==65){
            //删除原来图片
            this.getContentPane().removeAll();
            //加载一张完整的图片
            JLabel all=new JLabel(new ImageIcon(path +"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //加载背景图

            ImageIcon icon=new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\background.png");
            JLabel backgroup=new JLabel(icon);
            backgroup.setBounds(40,40,508,560);
            this.getContentPane().add(backgroup);

            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，方法要结束
        if(victory()){
            return;
        }

            int code=e.getKeyCode();
            if(code==37){
                if(y==3){return ;}
                System.out.println("向左移动");
                data[x][y]=data[x][y+1];
                data[x][y+1]=0;
                y++;
                step++;
                initImage();

            }else if(code==38){
                //逻辑：
                //把空白方块下方的数字往上移动
                if(x==3){return ;}
                data[x][y]=data[x+1][y];
                data[x+1][y]=0;
                x++;
                step++;
                //重新加载图片
                initImage();

                System.out.println("向上移动");
            }else if(code==39){
                if(y==0){return ;}
                System.out.println("向右移动");
                data[x][y]=data[x][y-1];
                data[x][y-1]=0;
                y--;
                step++;
                initImage();

            }else if(code==40){
                if(x==0){return;}
                System.out.println("向下移动");

                data[x][y]=data[x-1][y];
                data[x-1][y]=0;
                x--;
                step++;
                initImage();

            } else if (code==65) {
                initImage();
            }else if(code==87){
                data=new int [][]{
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}
                };
                initImage();           //一键通关快捷键
            }
    }
    public boolean victory(){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj== replayItem){
            System.out.println("重新游戏");
            initdata();
            step=0;
            initImage();


        }else if(obj==reLoginItem){
            System.out.println("重新登录");
            this.setVisible(false);

            new LoginJFrame();

        }else if(obj==closeItem){
            System.out.println("关闭游戏");
            System.exit(0);

        }else if(obj==accountItem){
            System.out.println("公众号");

            JDialog jDialog=new JDialog();
            JLabel jLabel=new JLabel(new ImageIcon("C:\\Users\\HP\\IdeaProjects\\puzzlegame\\about.png"));
            jDialog.setBounds(0,0,258,258);
            jDialog.setTitle("公众号");
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭无法进行其他操作
            jDialog.setModal(true);
            jDialog.setVisible(true);

        }else if(obj==animal){
            step=0;
            Random r=new Random();
            int num=r.nextInt(1,5);
            path="C:\\Users\\HP\\IdeaProjects\\puzzlegame\\animal"+""+num+"\\";
            initdata();
            initImage();
        }
    }
}
