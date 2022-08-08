package test.frame;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frame02 extends JFrame implements ActionListener{
   
   // 필드
   JButton sendBtn;
   JButton deleteBtn;
   
   // 생성자 (지역변수는 생성자 호출될때만 잠깐 살아있고 그 이후에는 사라짐)
   public frame02(String title) {
      // 부모생성자에 프레임의 제목 넘겨주기
      super(title);
      
      setLayout(new FlowLayout());
      
      sendBtn = new JButton("전송");
      // 프레임에 버튼 추가하기(FlowLayout의 영향을 받는다)
      add(sendBtn);
      sendBtn.addActionListener(this); // this를 쓸때에는 반드시 클래스명을 명시해줘야 함
      // 이렇게 위에처럼 implements까지 다 해주면 Override 구역에서 실행이 된다.
      
      // 삭제 버튼을 만들어서
      deleteBtn = new JButton("삭제");
      // 프레임에 추가하기
      add(deleteBtn);
      deleteBtn.addActionListener(this);
      /*
       * getActionCommand() 사용하는 방법
       * 
       *   각각의 버튼에 ActionCommand를 설정한다
       *   sendBtn.setActionCommane("send");
       *   deleteBtn.setActionCommane("delete");
       */
   }
      
   
   
   public static void main(String[] args) {
      
      JFrame f = new frame02("나의 프레임");
      f.setBounds(100, 100, 500, 500);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      f.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // 이벤트가 발생한 객체(여기서는 JButton 객체)의 참조값을 return해준다.
      Object obj = e.getSource();
      
      // 필드는 모든 메소드에서 나오는 값들을 공유하는 곳이기 때문에 생성자의 값을 필드에 저장하면 됨
      // sentBtn, deleteBtn을 필드에다가 선언해주면 됨!
      /*
      if(obj == sendBtn) {
         JOptionPane.showMessageDialog(this, "전송합니다!");
      } else if(obj == deleteBtn) {
         JOptionPane.showMessageDialog(this, "삭제합니다!");
      }
      */
      
      
//      String command = e.getActionCommand();
//      if(command.equals("전송")) {
//         JOptionPane.showMessageDialog(this, "전송합니다!");
//      } else if(command.equals("삭제")) {
//         JOptionPane.showMessageDialog(this, "삭제합니다!");
//      }
//      선생님 혹시 setActionCommand를 별도로 작성안하고 위의 코드처럼 작성해도 정상적으로 동작이 되는데 위처럼 적는건 문법적으로
//         정상이라고 봐도 되나요?
//         
//         답변 : 네 버튼의 택스트가 디폴트로 액션 command 가 되기 때문에 가능 합니다.

      
      
      /*    getActionCommand() 사용하는 방법
       *    -> 필드에 선언이 안 되어 있어도 됨
       * 
       *   이벤트가 일어난 객체에 설정된 ActionCommand 문자열 읽어오기
       *    
       *    String command = e.getActionCommand();
       *    if(command.equals("send")) {
       *       JOptionPane.showMessageDialog(this, "전송합니다!");
       *    } else if(command.equals("delete")) {
       *       JOptionPane.showMessageDialog(this, "삭제합니다!");
       *    }
       */
      
      /*
       *   [ 문자열의 비교에 대해서 ]
       *   
       *   문자열을 비교한다는 것은 참조값이 같은지 비교하는 걸까?
       *   문자열의 내용이 같은지 비교하는 걸까?
       *   
       *   문자열의 내용이 같은지 비교하는 경우가 대부분이다.
       *
       *  그렇다면 == 연산자는 뭘 비교하는 연산자 이지?
       *     == 은  값이 같은 걸 비교하는 것이기 때문에 참조값을 비교하는 연산자이다.
       *  
       *  그러면 문자열의 내용이 같으면 참조값이 같을까?
       *     같은 때도 있고 아닐때도 있다.(문자열을 생성하는 방법에 따라서 다름)
       *  
       *  결론 : 문자열의 내용을 비교할 때 == 를 사용하면 안된다(문자열의 내용이 같아도 false가 출력되는 상황도 나타남)
       *  
       *  문자열을 비교하는 방법은 String 객체의 .equals() 메소드를 활용하면 된다.
       */
    }
}