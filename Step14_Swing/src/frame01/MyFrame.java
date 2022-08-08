package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	//constructor
	public MyFrame(String title) {
		super(title); //부모 생성자에 프레임 제목 넘겨주기.
		
		//x좌표 y좌표 width height 전달
		setBounds(100,100,500,500);
		//어떻게 이런 메소드를 쓸 수 있을까? : JFrame에서 상속받은 것이라서.
		//상속받으면 힙영역에는 JFrame 객체도 만들어지고, 상속받은 MyFrame객체도 만들어진다.
		//만들어진 이 객체는 하나의 참조값으로 관리된다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임의 레이아웃 매니저를 사용하지 않기 때문에 UI를 절대좌표로 직접 배치
		setLayout(null);
		
		JButton btn1=new JButton("버튼1");
		btn1.setLocation(10,10);
		btn1.setSize(100,30);
		add(btn1);
		
		JButton btn2=new JButton("버튼2");
		//setLocation(), setSize() 메소드 대신에 한번에 설정 가능.
		btn2.setBounds(120,10,100,30);
		add(btn2);
		
		JButton btn3=new JButton("버튼3");
		//setLocation(), setSize() 메소드 대신에 한번에 설정 가능.
		btn3.setBounds(230,10,100,30);
		add(btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}
