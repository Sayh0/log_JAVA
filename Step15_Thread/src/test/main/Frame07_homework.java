package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import test.mypac.CountRunnable;
import test.mypac.CountThread;

/*
 * 
프레임을 하나 만들고
프레임에 숫자를 입력하고 실행하기 버튼 누르면
구구단 하나가 콘솔창에 출력되는 프로그래밍

단, 1초에 1줄씩 출력이 되도록 하고, 출력하는 작업은 새로운 스레드에서.
 * 
 */

public class Frame07_homework extends JFrame implements ActionListener{
   JTextField tf1;
	
   //생성자
   public Frame07_homework() {
      //레이아웃 설정 
      //프레임의 레이아웃 법칙 설정하기 
      setLayout(new BorderLayout());
      
      //JPanel
      JPanel topPanel=new JPanel();
      topPanel.setBackground(Color.YELLOW);
      //Panel 을 북쪽에 배치하기 
      add(topPanel, BorderLayout.NORTH);
      
      //JTextField 객체를 만들에서 JPanel 에 추가하기 
      tf1=new JTextField(10);
      topPanel.add(tf1);
      //기능 버튼 객체를 만들어서 JPanel 에 추가하기
      JButton exeBtn=new JButton("실행하기");
      topPanel.add(exeBtn);


      //버튼에 리스너 등록하기
      exeBtn.addActionListener(this);
   }
   
   //메인 메소드
   public static void main(String[] args) {
      //MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame 에 담기 
      Frame07_homework frame=new Frame07_homework();
      //프레임의 제목 설정
      frame.setTitle("Frame03");
      //프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
		   try {
			   new Thread(new Runnable() {
					@Override
					public void run() {
						//새 단위의 작업 시작
						String strNum=tf1.getText();
						//문자열 숫자로 변경
						int num1=Integer.parseInt(strNum);
						System.out.println(num1);
						for(int i=0;i<9;i++) {
						    System.out.println(num1+" x "+(i+1)+" = "+num1*(i+1)); 
							try {
							        Thread.sleep(1000);
							     } catch (InterruptedException e) {
							        e.printStackTrace();
							     }
						}
					}
					   
				   }).start();
			   
		   } catch(NumberFormatException nfe) {
			   JOptionPane.showMessageDialog(this, "숫자만 입력하세요.");
		   }
	
	   
//	   new Thread(()->{
//			   try {
//					//새 단위의 작업 시작
//					String strNum=tf1.getText();
//					//문자열 숫자로 변경
//					int num1=Integer.parseInt(strNum);
//					System.out.println(num1);
//					for(int i=0;i<9;i++) {
//					    System.out.println(num1+" x "+(i+1)+" = "+num1*(i+1)); 
//						try {
//						        Thread.sleep(1000);
//						     } catch (InterruptedException e) {
//						        e.printStackTrace();
//						     }
//					}
//		   } catch(NumberFormatException nfe) {
//			   JOptionPane.showMessageDialog(this, "숫자만 입력하세요.");
//		   }
//	   }).start();
	   
	   

	   System.out.println("새로운 스레드가 시작되었습니다.");

   }
}








