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
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 38));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("\u4FE1\u606F\u8BFB\u53D6");//��ȡ��Ϣ
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String result = "";
				 File file=new File("E:\\Java�ĵ�\\Demo\\first\\database.txt");//�ļ����ڵ�ַ
				 
				try {
					
					BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
					             String s = null;
					             int count=0;
					             while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
					                 //result = result + "\n" +s;
					            	 if(count==0) {//���ı�����ʾ��ʱ�򲻻���ʾ����Ļ���
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
		btnNewButton.setFont(new Font("����", Font.PLAIN, 36));
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");//���ذ�ť��������ҳ��
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);//����ǰ(��ѡ�����ҳ��)ҳ������
				test1.main(null);//��ת����ҳ��
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 36));
		
		JButton btnNewButton_2 = new JButton("\u4FDD\u5B58");//�����Ѿ��޸ĺ����Ϣ
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String content = textArea.getText();//��ȡ�ı����������
				FileWriter openFile;
				
				try {
					openFile=new FileWriter("E:\\Java�ĵ�\\Demo\\first\\database.txt",false);
					//false��ʾ�����ı�
					openFile.write(content);
					openFile.close();
					
					/*���ʹ������룬�����������Ϣ��ʱ�򲻻ỻ��
					FileOutputStream fileOutputStream = new FileOutputStream(openFile,false);
					OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
					outputStreamWriter.write(content);
					outputStreamWriter.flush();		//��ջ���
					outputStreamWriter.close();		//�ر��ļ��ַ������
					fileOutputStream.close();		//�ر��ļ��ֽ������
					*/
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				contentPane.setVisible(false);//����ǰ(��ѡ�����ҳ��)ҳ������
				test1.main(null);//��ת����ҳ��
				
			}
		});
		btnNewButton_2.setFont(new Font("����", Font.PLAIN, 34));
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
