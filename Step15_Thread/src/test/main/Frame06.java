package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountRunnable;
import test.mypac.CountThread;



public class Frame06 extends JFrame implements ActionListener{
   
   //생성자
   public Frame06() {
      //레이아웃 설정 
      setLayout(new BorderLayout());
      //페널을 프레임의 상단에 배치 
      JPanel panel=new JPanel();
      panel.setBackground(Color.YELLOW);
      add(panel, BorderLayout.NORTH);
      //버튼을 페널에 추가 하고 
      JButton countBtn=new JButton("1~10 까지 세기");
      panel.add(countBtn);
      //버튼에 리스너 등록하기
      countBtn.addActionListener(this);
   }
   
   public static void main(String[] args) {
      //MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame 에 담기 
      Frame06 frame=new Frame06();
      //프레임의 제목 설정
      frame.setTitle("Frame03");
      //프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }

   String myName="김구라";
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
	   
	 new Thread(()->{ //functional(()->{})로 제일 간단하게 바꿔보기. 추상메소드 하나짜리 인터페이스는 이렇게 간단하게 쓸 수 있는거 기억하지?
		 //람다함수 형식이래.
		 
			//새로운 작업 단위의 시작점.
			  int count=0;
			  while(true) {
			     try {
			        Thread.sleep(1000);
			     } catch (InterruptedException e) {
			        e.printStackTrace();
			     }
			     count++;
			     System.out.println("현재 카운트:"+count+myName); //이너클래스로 만들었기 때문에 내부 변수,필드,메소드 막 사용 가능
			     if(count==10) {
			        break;
			     }
			  }				
	 }).start(); 



	   
	  

	   //아래 내용이 바로 콘솔창에 찍힘
	   System.out.println("새로운 스레드가 시작되었습니다.");
	  
	   
      
      
   }
}








