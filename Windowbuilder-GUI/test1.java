package first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 frame = new test1();
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
	public test1() {
		setForeground(Color.BLACK);
		setTitle("\u804C\u5DE5\u57FA\u672C\u4FE1\u606F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1038, 696);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u804C\u5DE5\u57FA\u672C\u4FE1\u606F\u7684\u7BA1\u7406");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 46));
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBounds(307, 26, 423, 68);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0\u804C\u5DE5\u4FE1\u606F");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 32));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//第一个按钮的监听器部分
				contentPane.setVisible(false);//将当前(即选择的主页面)页面隐藏
				second1 addMessage=new second1();
				addMessage.setVisible(true);
			}
		});
		btnNewButton.setBounds(328, 104, 369, 68);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u663E\u793A\u804C\u5DE5\u4FE1\u606F");//先是职工信息
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);//将当前(即选择的主页面)页面隐藏
				database addMessage=new database();
				addMessage.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 32));
		btnNewButton_1.setBounds(328, 230, 369, 68);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u4FEE\u6539/\u5220\u9664\u804C\u5DE5\u4FE1\u606F");//修改信息操作
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);//将当前(即选择的主页面)页面隐藏
				database Database=new database();
				Database.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 32));
		btnNewButton_2.setBounds(328, 368, 369, 75);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\u7EDF\u8BA1\u8BA1\u7B97");//统计计算
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);//将当前(即选择的主页面)页面隐藏
				calculte Calculte=new calculte();
				Calculte.setVisible(true);
			}
		});
		btnNewButton_2_1.setFont(new Font("宋体", Font.PLAIN, 32));
		btnNewButton_2_1.setBounds(328, 505, 369, 68);
		contentPane.add(btnNewButton_2_1);
	}
}
