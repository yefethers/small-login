package last;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class homework extends JFrame implements ActionListener{
	
	//��һ���ֽ���
	JPanel row1=new JPanel();
	JButton ��������=new JButton("��������");
	JButton ѧϰ����=new JButton("ѧϰ����");
	JButton У԰�=new JButton("У԰�");
	JButton ʵϰ����=new JButton("ʵϰ����");
	JButton �����=new JButton("�����");
	JButton ��Ȥ����=new JButton("��Ȥ����");
	//�ڶ����ֽ���
	JPanel row2=new JPanel();
	JTextArea ��ʾ=new JTextArea();
	
	public homework(){
		super("homework");
		setLookAndFeel();
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout layout=new GridLayout(2,1);
		setLayout(layout);
		setLocationRelativeTo(null);//������ʾ
		
		//���������
		��������.addActionListener(this);
		ѧϰ����.addActionListener(this);
		У԰�.addActionListener(this);
		ʵϰ����.addActionListener(this);
		�����.addActionListener(this);
		��Ȥ����.addActionListener(this);
		
		//��һ����
		GridLayout Layout1=new GridLayout(2,3,10,10);
		row1.setLayout(Layout1);
		row1.add(��������);
		row1.add(ѧϰ����);
		row1.add(У԰�);
		row1.add(ʵϰ����);
		row1.add(�����);
		row1.add(��Ȥ����);
		add(row1);
		
		//�ڶ�����
		FlowLayout layout2=new FlowLayout();
		row2.setLayout(layout2);
		row2.add(��ʾ);
		add(row2);
		
		setVisible(true);
	}
		
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if(command.equals("��������")){
				button1();
			}
			if(command.equals("ѧϰ����")){
				button2();
			}
			if(command.equals("У԰�")){
				button3();
			}
			if(command.equals("ʵϰ����")){
				button4();
			}
			if(command.equals("�����")){
				button5();
			}
			if(command.equals("��Ȥ����")){
				button6();
			}
		}
		
	private void button6() {
		��ʾ.setText("��ë���ܲ������飬lol\n");
	}



	private void button5() {
		��ʾ.setText("���ϴ�ѧѧ�����������\n "
				+ "���������У԰����ѧ������\n");
	}



	private void button4() {
		��ʾ.setText("����������������ͻ�����       ����ʵϰ��     8/2015--9/2015\n "
				+ "ҵ�����վ���չ�ͻ�����\n"
				+ "�˽�ͻ����г�������һ���ĵ������������\n"
				+ "��巽���                      Ӣ���ʦ        6/2016��7/2016\n"
				+ "����ѧ����Ӣ���ѧ\n"
				+ "��ҳ���������ʦ��Ǣ�ദ\n");
	}

	private void button3() {
		��ʾ.setText("����������ѧԺѧ����         ����������              ��Ӱ��\n"
					+"�ٰ�2014��������ӭ����� (11/2014)\n"
					+"��θ���Ҫ��������\n"
					+"����ʹ��ps\n"
					+"��������������ֻ�           У԰����                ��Ҫ������ \n"
					+"�ٰ�2015����������ӭ�����(9/2015)\n"
					+"�ٰ�2016����������ӭ����ᣨ9/2016��\n");
	}

	private void button2() {
		��ʾ.setText("2014�ꡪ2017�� ���ϴ�ѧ     ����������ѧԺ         ����������רҵ\n");
	}

	private void button1() {
		   ��ʾ.setText("�����������\n"
		   		+ "�������£�3/1996\n"
		   		+ "��ϵ�绰��17766475590\n"
		   		+ "����:yefethers@163.com\n"
		   		+ "QQ��382913704\n");
	}

	private static void setLookAndFeel() {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch(Exception e){
			//����
		}
	}
	
	public static void main(String[] args){
		homework frame=new homework();
	}

}
