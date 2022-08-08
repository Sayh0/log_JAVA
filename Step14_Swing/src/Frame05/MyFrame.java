package Frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
   
   //생성자
   public MyFrame(String title) {
      //부모생성자에 프레임의 제목 넘겨주기 
      super(title);
      
      setLayout(new FlowLayout());
      
      JButton sendBtn=new JButton("전송");
      JButton deleteBtn=new JButton("삭제");
      //프레임에 버튼 추가하기 ( FlowLayout 의 영향을 받는다 )
      add(sendBtn);
      add(deleteBtn);
      
      //버튼의 동작을 리스닝할 interface type 객체
      ActionListener listener=new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println("오잉 전송?");
            /*
             *  JOptionPane 클래스의 static 메소드를 호출해서 메세지 다이얼로그 띄우기
             *  
             *  .showMessageDialog(프레임의 참조값, 띄울 메세지)
             */
            JOptionPane.showMessageDialog(MyFrame.this, "전송합니다!");
         }
      };
      sendBtn.addActionListener(listener);
      

//      deleteBtn.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("오잉 삭제?");
//			JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다.");
//		}
//    	  
//      });
      
      deleteBtn.addActionListener(e->{});
      
   }
   
   
   public static void main(String[] args) {
      
      JFrame f=new MyFrame("나의 프레임");
      f.setBounds(100, 100, 500, 500);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      f.setVisible(true);
      
   }
}










