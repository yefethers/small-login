package last;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class homework extends JFrame implements ActionListener{
	
	//第一部分界面
	JPanel row1=new JPanel();
	JButton 个人资料=new JButton("个人资料");
	JButton 学习经历=new JButton("学习经历");
	JButton 校园活动=new JButton("校园活动");
	JButton 实习经历=new JButton("实习经历");
	JButton 获奖情况=new JButton("获奖情况");
	JButton 兴趣爱好=new JButton("兴趣爱好");
	//第二部分界面
	JPanel row2=new JPanel();
	JTextArea 显示=new JTextArea();
	
	public homework(){
		super("homework");
		setLookAndFeel();
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout layout=new GridLayout(2,1);
		setLayout(layout);
		setLocationRelativeTo(null);//居中显示
		
		//加入监听器
		个人资料.addActionListener(this);
		学习经历.addActionListener(this);
		校园活动.addActionListener(this);
		实习经历.addActionListener(this);
		获奖情况.addActionListener(this);
		兴趣爱好.addActionListener(this);
		
		//第一部分
		GridLayout Layout1=new GridLayout(2,3,10,10);
		row1.setLayout(Layout1);
		row1.add(个人资料);
		row1.add(学习经历);
		row1.add(校园活动);
		row1.add(实习经历);
		row1.add(获奖情况);
		row1.add(兴趣爱好);
		add(row1);
		
		//第二部分
		FlowLayout layout2=new FlowLayout();
		row2.setLayout(layout2);
		row2.add(显示);
		add(row2);
		
		setVisible(true);
	}
		
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if(command.equals("个人资料")){
				button1();
			}
			if(command.equals("学习经历")){
				button2();
			}
			if(command.equals("校园活动")){
				button3();
			}
			if(command.equals("实习经历")){
				button4();
			}
			if(command.equals("获奖情况")){
				button5();
			}
			if(command.equals("兴趣爱好")){
				button6();
			}
		}
		
	private void button6() {
		显示.setText("羽毛球，跑步，看书，lol\n");
	}



	private void button5() {
		显示.setText("江南大学学生会优秀干事\n "
				+ "湖北老乡会校园优秀学生奖金\n");
	}



	private void button4() {
		显示.setText("苏南龙湖渠道及大客户中心       销售实习生     8/2015--9/2015\n "
				+ "业绩：日均发展客户三人\n"
				+ "了解客户及市场需求做一定的调整并提出建议\n"
				+ "智宸教育                      英语教师        6/2016—7/2016\n"
				+ "初中学生的英语教学\n"
				+ "与家长及其他老师融洽相处\n");
	}

	private void button3() {
		显示.setText("物联网工程学院学生会         新闻宣传部              摄影组\n"
					+"举办2014年物联网迎新晚会 (11/2014)\n"
					+"多次给重要会议拍照\n"
					+"熟练使用ps\n"
					+"湖北老乡会无锡分会           校园部分                主要负责人 \n"
					+"举办2015年湖北老乡会迎新晚会(9/2015)\n"
					+"举办2016年湖北老乡会迎新晚会（9/2016）\n");
	}

	private void button2() {
		显示.setText("2014年—2017年 江南大学     物联网工程学院         物联网工程专业\n");
	}

	private void button1() {
		   显示.setText("姓名：项关羽\n"
		   		+ "出生年月：3/1996\n"
		   		+ "联系电话：17766475590\n"
		   		+ "邮箱:yefethers@163.com\n"
		   		+ "QQ：382913704\n");
	}

	private static void setLookAndFeel() {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch(Exception e){
			//忽略
		}
	}
	
	public static void main(String[] args){
		homework frame=new homework();
	}

}
