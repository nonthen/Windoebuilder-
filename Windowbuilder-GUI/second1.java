package first;

//�Լ����
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
	private JTextField textField;//�������ı���
	private JTextField txtxxxxxx;//��������
	private JTextField txtxx;//ְ�����
	private JTextField textField_1;//����
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
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 27));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u6DFB\u52A0\u4EE5\u4E0B\u4FE1\u606F");//������Ϣ�ı���
		lblNewLabel_1.setBounds(300, 25, 440, 55);
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 38));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		
		textField = new JTextField();//�ı�����������
		textField.setBounds(385, 190, 355, 59);
		textField.setForeground(Color.GRAY);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("����", Font.PLAIN, 26));
		textField.setText("\u5728\u6B64\u8F93\u5165\u59D3\u540D");
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u51FA\u751F\u5E74\u6708\uFF1A");
		lblNewLabel_2.setBounds(238, 277, 137, 55);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 27));
		lblNewLabel_2.setBackground(Color.WHITE);
		panel.add(lblNewLabel_2);
		
		txtxxxxxx = new JTextField();//��������
		txtxxxxxx.setBounds(385, 275, 355, 59);
		txtxxxxxx.setText("\u683C\u5F0F\uFF1Axxxxxx");
		txtxxxxxx.setHorizontalAlignment(SwingConstants.CENTER);
		txtxxxxxx.setForeground(Color.GRAY);
		txtxxxxxx.setFont(new Font("����", Font.PLAIN, 26));
		txtxxxxxx.setColumns(10);
		panel.add(txtxxxxxx);
		
		JLabel lblNewLabel_3 = new JLabel("\u804C\u5DE5\u5E8F\u53F7\uFF1A");
		lblNewLabel_3.setBounds(238, 102, 137, 55);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 27));
		lblNewLabel_3.setBackground(Color.WHITE);
		panel.add(lblNewLabel_3);
		
		txtxx = new JTextField();//ְ�����
		txtxx.setBounds(385, 100, 355, 59);
		txtxx.setToolTipText("");
		txtxx.setText("\u683C\u5F0F\uFF1AXX");
		txtxx.setHorizontalAlignment(SwingConstants.CENTER);
		txtxx.setForeground(Color.GRAY);
		txtxx.setFont(new Font("����", Font.PLAIN, 26));
		txtxx.setColumns(10);
		panel.add(txtxx);
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("\u57FA\u672C\u5DE5\u8D44\uFF1A");
		lblNewLabel_2_1.setBounds(238, 373, 137, 55);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("����", Font.PLAIN, 27));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		panel.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();//����
		textField_1.setBounds(385, 371, 355, 59);
		textField_1.setText("\u5728\u6B64\u8F93\u5165\u5DE5\u8D44");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.GRAY);
		textField_1.setFont(new Font("����", Font.PLAIN, 26));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("email:");
		lblNewLabel_2_1_1.setBounds(238, 464, 137, 55);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("����", Font.PLAIN, 27));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		panel.add(lblNewLabel_2_1_1);
		
		txtemail = new JTextField();//Email
		txtemail.setBounds(385, 462, 355, 59);
		txtemail.setText("\u5728\u6B64\u8F93\u5165email");
		txtemail.setHorizontalAlignment(SwingConstants.CENTER);
		txtemail.setForeground(Color.GRAY);
		txtemail.setFont(new Font("����", Font.PLAIN, 26));
		txtemail.setColumns(10);
		panel.add(txtemail);
		
		JButton btnNewButton = new JButton("\u5B8C\u6210");//��ɰ�ť��������ҳ��
		btnNewButton.setBounds(415, 562, 185, 70);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Sname=textField.getText();//����
				String Snum=txtxx.getText();//���
				String Sbirth=txtxxxxxx.getText();//��������
				String Sprice=textField_1.getText();//����
				String Semail=txtemail.getText();//Email
				FileWriter out;
				try {
					//��¼�����Ϣ���뵽�ı��ĵ���
					out = new FileWriter("E:\\Java�ĵ�\\Demo\\first\\database.txt",true);//�����ļ�,���û������Զ�����,����Ѿ���������Զ�д��
					//true��ʾ�����ǵ�һ��¼���ʱ��д������ݾͻ����ĵ��ĺ����Զ�׷��
					Date date = new Date();//��ȡ��ǰϵͳ������
					SimpleDateFormat Send = new SimpleDateFormat("yyyyMM");//���ϵͳʱ�����ʾ��ʽ
					String dateNowStr = Send.format(date);
					out.write("ְ������:"+dateNowStr+Snum);//���ı����ݱ��浽�ļ���
					out.write("  ����:"+Sname);
					out.write("  ��������:"+Sbirth);
					out.write("  ��������:"+Sprice);
					out.write("  email:"+Semail);
					out.write("\n");
					out.close();
					
					//String[] string= {"Snum","Sname","Sbirth","Sprice","Semail"};
					//revise.getString(string);//������ַ����浽��һ�����ڵı���У����ǲ����Ĵ���
					
					JOptionPane.showMessageDialog(contentPane, "����ɹ�");//�ڵ�ǰ���ڵ���һ������
					
					
			}catch(IOException e1) {
				e1.printStackTrace();
			}
				contentPane.setVisible(false);//����ǰ(��ѡ�����ҳ��)ҳ������
				test1.main(null);//��ת����ҳ��
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("����", Font.PLAIN, 36));
		panel.add(btnNewButton);
		
	}
}
