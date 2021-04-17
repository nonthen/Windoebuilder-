package first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.awt.event.ActionEvent;

public class database extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					database frame = new database();
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
	public database() {
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 24));
		setTitle("\u804C\u5DE5\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1162, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u804C\u5DE5\u4FE1\u606F");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 38));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("\u4FE1\u606F\u8BFB\u53D6");//读取信息
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String result = "";
				 File file=new File("E:\\Java文档\\Demo\\first\\database.txt");//文件所在地址
				 
				try {
					
					BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
					             String s = null;
					             int count=0;
					             while((s = br.readLine())!=null){//使用readLine方法，一次读一行
					                 //result = result + "\n" +s;
					            	 if(count==0) {//在文本区显示的时候不会显示多余的换行
					            		 result = result +s;
					            		 count=1;
					            	 }
					            	 else {
					            		 result = result + "\n" +s;
					            	 }
					            	 
					             }
					             textArea.setText(result);
					             br.close();
				
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 36));
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");//返回按钮，返回主页面
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);//将当前(即选择的主页面)页面隐藏
				test1.main(null);//跳转到主页面
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 36));
		
		JButton btnNewButton_2 = new JButton("\u4FDD\u5B58");//保存已经修改后的信息
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String content = textArea.getText();//读取文本框里的内容
				FileWriter openFile;
				
				try {
					openFile=new FileWriter("E:\\Java文档\\Demo\\first\\database.txt",false);
					//false表示覆盖文本
					openFile.write(content);
					openFile.close();
					
					/*如果使用这代码，这重新添加信息的时候不会换行
					FileOutputStream fileOutputStream = new FileOutputStream(openFile,false);
					OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
					outputStreamWriter.write(content);
					outputStreamWriter.flush();		//清空缓存
					outputStreamWriter.close();		//关闭文件字符输出流
					fileOutputStream.close();		//关闭文件字节输出流
					*/
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				contentPane.setVisible(false);//将当前(即选择的主页面)页面隐藏
				test1.main(null);//跳转到主页面
				
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 34));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(351)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(70)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1014, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(54, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(85)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addGap(173)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		//JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		contentPane.setLayout(gl_contentPane);
	}
}
