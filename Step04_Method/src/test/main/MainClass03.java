package test.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass03 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(300, 400);
		f.setTitle("Ÿ��Ʋ�Դϴ�.");
		f.setLayout(new BorderLayout());
		
		JButton btn = new JButton();
		btn.setText("push me");
		
		f.add(btn, BorderLayout.NORTH);
		
		f.setVisible(true);

	}
}
