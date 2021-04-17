package first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class calculte extends JFrame {

	private JPanel contentPane;
	private JTextField textField;//输出总职工人数
	private JButton btnNewButton_1;//查看按钮

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculte frame = new calculte();
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
	public calculte() {
		setTitle("\u7EDF\u8BA1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u603B\u4EBA\u6570\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 34));
		lblNewLabel.setBounds(219, 111, 148, 51);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 26));
		textField.setBounds(388, 115, 167, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u603B\u4F53\u7EDF\u8BA1");//总体查看
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int count=0;
				 File file=new File("E:\\Java文档\\Demo\\first\\database.txt");//文件所在地址
				
				try {
					
					BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
					             String s = null;
					             while((s = br.readLine())!=null){//使用readLine方法，一次读一行
					                 count++;//每换一行代表一位职工
					             }
					             String scount=String.valueOf(count);//将int类型转换为String类型
					             textField.setText(scount);//在文本框里显示
					             br.close();
				
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
			
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 38));
		btnNewButton.setBounds(288, 10, 210, 47);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\u8FD4\u56DE");//返回主页面
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);//将当前(即选择的主页面)页面隐藏
				test1.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 34));
		btnNewButton_1.setBounds(699, 456, 140, 55);
		contentPane.add(btnNewButton_1);
	}
}
