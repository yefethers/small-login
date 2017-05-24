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
	
	//�û���������
	private JTextField uersname;
	private JTextField password;

	//ȷ��
	private JButton bu1;
	
	//���
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	
	
	/*
	 * ���캯��
	 */
	public  Login() {
		this.setTitle("��¼����");
		init();//���ڳ�ʼ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);//���Զ�λ
		this.setBounds(0,0,350,300);
		Image image = new ImageIcon("res\\a.jpg").getImage();
	    this.setIconImage(image);
		this.setResizable(false);//�����С�̶�
		this.setLocationRelativeTo(null);//������ʾ
		this.setVisible(true);
	}
	
	public void init() {
		Container con=this.getContentPane();
		
		//����
		label1 = new JLabel();
        ImageIcon imageIcon1 = new ImageIcon("res\\b.jpg");
        Image image1=imageIcon1.getImage();
        Image image4=image1.getScaledInstance(350,300,Image.SCALE_FAST);//������С���ʺ�ʹ��
        label1.setIcon(new ImageIcon(image4));
        label1.setBounds(0, 0, 350, 300);
		
		//ͷ��
		label2 =new JLabel();
		ImageIcon imageIcon2=new ImageIcon("res\\a.jpg");
		Image image2=imageIcon2.getImage();
		Image image3=image2.getScaledInstance(60,60,Image.SCALE_FAST);//������С���ʺ�ʹ��
		label2.setIcon(new ImageIcon(image3));
		label2.setBounds(30, 80, 60, 60);
		
		//�û���
		uersname=new JTextField();
		uersname.setBounds(160, 80, 150, 20);
		label3=new JLabel("�û���:");
		label3.setBounds(100, 80, 50, 20);
		
		//����
		password=new JTextField();
		password.setBounds(160, 110, 150, 20);
		label4=new JLabel("    ����:");
		label4.setBounds(100, 110, 50, 20);
		
		//��ť
		bu1 = new JButton("��¼");
		bu1.setBounds(140, 180, 65, 20);
		bu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str=e.getActionCommand();
				String getName =uersname.getText();
                String getPwd =password.getText();
                //�˺�����Ϊ123ʱ��ת
                if(getName.equals("123")&&getPwd.equals("123")){
                   Login.this.setVisible(false);//����ü���this
                   new homework();
                	}
                else {
                	new Error();
                	
                }
		  }
		});
		
		//��������
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
	
	//��¼�������
	private class Error extends JFrame{
		public Error(){
		JTextField errorl=new JTextField();
		errorl.setText("�û������������!");
		errorl.setEditable(false);
		this.add(errorl);
		this.setSize(150,100);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		}

	}
}

