package last;

/*
 * @author yefethers
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.sun.glass.ui.TouchInputSupport;

public class Login extends JFrame {
	
	//用户名及密码
	private JTextField uersname;
	private JTextField password;

	//确认
	private JButton bu1;
	
	//组件
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	
	
	/*
	 * 构造函数
	 */
	public  Login() {
		this.setTitle("登录界面");
		init();//窗口初始化
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);//绝对定位
		this.setBounds(0,0,350,300);
		Image image = new ImageIcon("res\\a.jpg").getImage();
	    this.setIconImage(image);
		this.setResizable(false);//窗体大小固定
		this.setLocationRelativeTo(null);//居中显示
		this.setVisible(true);
	}
	
	public void init() {
		Container con=this.getContentPane();
		
		//背景
		label1 = new JLabel();
        ImageIcon imageIcon1 = new ImageIcon("res\\b.jpg");
        Image image1=imageIcon1.getImage();
        Image image4=image1.getScaledInstance(350,300,Image.SCALE_FAST);//调整大小来适合使用
        label1.setIcon(new ImageIcon(image4));
        label1.setBounds(0, 0, 350, 300);
		
		//头像
		label2 =new JLabel();
		ImageIcon imageIcon2=new ImageIcon("res\\a.jpg");
		Image image2=imageIcon2.getImage();
		Image image3=image2.getScaledInstance(60,60,Image.SCALE_FAST);//调整大小来适合使用
		label2.setIcon(new ImageIcon(image3));
		label2.setBounds(30, 80, 60, 60);
		
		//用户名
		uersname=new JTextField();
		uersname.setBounds(160, 80, 150, 20);
		label3=new JLabel("用户名:");
		label3.setBounds(100, 80, 50, 20);
		
		//密码
		password=new JTextField();
		password.setBounds(160, 110, 150, 20);
		label4=new JLabel("    密码:");
		label4.setBounds(100, 110, 50, 20);
		
		//按钮
		bu1 = new JButton("登录");
		bu1.setBounds(140, 180, 65, 20);
		bu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str=e.getActionCommand();
				String getName =uersname.getText();
                String getPwd =password.getText();
                //账号密码为123时跳转
                if(getName.equals("123")&&getPwd.equals("123")){
                   Login.this.setVisible(false);//这里得加上this
                   new homework();
                	}
                else {
                	new Error();
                	
                }
		  }
		});
		
		//加入容器
		label1.add(label2);
		label1.add(label3);
		label1.add(label4);
		label1.add(bu1);
		con.add(label1);
		con.add(uersname);
		con.add(password);
		
		
	}
	
	public static void main(String[] args){
		Login login =new Login();
	}
	
	//登录错误界面
	private class Error extends JFrame{
		public Error(){
		JTextField errorl=new JTextField();
		errorl.setText("用户名或密码错误!");
		errorl.setEditable(false);
		this.add(errorl);
		this.setSize(150,100);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		}

	}
}

