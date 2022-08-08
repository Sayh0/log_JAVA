package Frame03;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	//constructor
	public MyFrame(String title) {
		super(title); //부모 생성자에 프레임 제목 넘겨주기.
		
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");

		add(sendBtn);
		
		//버튼의 동작을 리스닝할 interface 객체.
		ActionListener listener=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송.");
				JOptionPane.showMessageDialog(MyFrame.this, "전송");
			}
		};
		
		sendBtn.addActionListener(listener);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		JFrame f=new MyFrame("나의 프레임");
		f.setBounds(100,200,400,400);
	}
}
