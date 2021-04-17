package first;

//自己添加
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Date;

//

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class second1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;//姓名的文本框
	private JTextField txtxxxxxx;//出生年月
	private JTextField txtxx;//职工序号
	private JTextField textField_1;//工资
	private JTextField txtemail;//Email

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second1 frame = new second1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public second1() {
		setTitle("\u6DFB\u52A0\u804C\u5DE5\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1119, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(550, 5, 10, 10);
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setBounds(238, 192, 137, 55);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 27));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u6DFB\u52A0\u4EE5\u4E0B\u4FE1\u606F");//输入信息的标题
		lblNewLabel_1.setBounds(300, 25, 440, 55);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 38));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		
		textField = new JTextField();//文本框，输入姓名
		textField.setBounds(385, 190, 355, 59);
		textField.setForeground(Color.GRAY);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("宋体", Font.PLAIN, 26));
		textField.setText("\u5728\u6B64\u8F93\u5165\u59D3\u540D");
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u51FA\u751F\u5E74\u6708\uFF1A");
		lblNewLabel_2.setBounds(238, 277, 137, 55);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 27));
		lblNewLabel_2.setBackground(Color.WHITE);
		panel.add(lblNewLabel_2);
		
		txtxxxxxx = new JTextField();//出生年月
		txtxxxxxx.setBounds(385, 275, 355, 59);
		txtxxxxxx.setText("\u683C\u5F0F\uFF1Axxxxxx");
		txtxxxxxx.setHorizontalAlignment(SwingConstants.CENTER);
		txtxxxxxx.setForeground(Color.GRAY);
		txtxxxxxx.setFont(new Font("宋体", Font.PLAIN, 26));
		txtxxxxxx.setColumns(10);
		panel.add(txtxxxxxx);
		
		JLabel lblNewLabel_3 = new JLabel("\u804C\u5DE5\u5E8F\u53F7\uFF1A");
		lblNewLabel_3.setBounds(238, 102, 137, 55);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 27));
		lblNewLabel_3.setBackground(Color.WHITE);
		panel.add(lblNewLabel_3);
		
		txtxx = new JTextField();//职工序号
		txtxx.setBounds(385, 100, 355, 59);
		txtxx.setToolTipText("");
		txtxx.setText("\u683C\u5F0F\uFF1AXX");
		txtxx.setHorizontalAlignment(SwingConstants.CENTER);
		txtxx.setForeground(Color.GRAY);
		txtxx.setFont(new Font("宋体", Font.PLAIN, 26));
		txtxx.setColumns(10);
		panel.add(txtxx);
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("\u57FA\u672C\u5DE5\u8D44\uFF1A");
		lblNewLabel_2_1.setBounds(238, 373, 137, 55);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("宋体", Font.PLAIN, 27));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		panel.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();//工资
		textField_1.setBounds(385, 371, 355, 59);
		textField_1.setText("\u5728\u6B64\u8F93\u5165\u5DE5\u8D44");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.GRAY);
		textField_1.setFont(new Font("宋体", Font.PLAIN, 26));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("email:");
		lblNewLabel_2_1_1.setBounds(238, 464, 137, 55);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("宋体", Font.PLAIN, 27));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		panel.add(lblNewLabel_2_1_1);
		
		txtemail = new JTextField();//Email
		txtemail.setBounds(385, 462, 355, 59);
		txtemail.setText("\u5728\u6B64\u8F93\u5165email");
		txtemail.setHorizontalAlignment(SwingConstants.CENTER);
		txtemail.setForeground(Color.GRAY);
		txtemail.setFont(new Font("宋体", Font.PLAIN, 26));
		txtemail.setColumns(10);
		panel.add(txtemail);
		
		JButton btnNewButton = new JButton("\u5B8C\u6210");//完成按钮，返回主页面
		btnNewButton.setBounds(415, 562, 185, 70);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Sname=textField.getText();//姓名
				String Snum=txtxx.getText();//序号
				String Sbirth=txtxxxxxx.getText();//出生年月
				String Sprice=textField_1.getText();//工资
				String Semail=txtemail.getText();//Email
				FileWriter out;
				try {
					//将录入的信息存入到文本文档中
					out = new FileWriter("E:\\Java文档\\Demo\\first\\database.txt",true);//创建文件,如果没有则会自动创建,如果已经存在则会自动写入
					//true表示当不是第一次录入的时候，写入的数据就会在文档的后面自动追加
					Date date = new Date();//获取当前系统的年月
					SimpleDateFormat Send = new SimpleDateFormat("yyyyMM");//设计系统时间的显示格式
					String dateNowStr = Send.format(date);
					out.write("职工工号:"+dateNowStr+Snum);//将文本内容保存到文件中
					out.write("  姓名:"+Sname);
					out.write("  出生年月:"+Sbirth);
					out.write("  基本工资:"+Sprice);
					out.write("  email:"+Semail);
					out.write("\n");
					out.close();
					
					//String[] string= {"Snum","Sname","Sbirth","Sprice","Semail"};
					//revise.getString(string);//将这个字符串存到另一个窗口的表格中，这是参数的传递
					
					JOptionPane.showMessageDialog(contentPane, "保存成功");//在当前窗口弹出一个弹窗
					
					
			}catch(IOException e1) {
				e1.printStackTrace();
			}
				contentPane.setVisible(false);//将当前(即选择的主页面)页面隐藏
				test1.main(null);//跳转到主页面
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 36));
		panel.add(btnNewButton);
		
	}
}
