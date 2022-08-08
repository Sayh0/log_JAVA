package test.frame;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frame02 extends JFrame implements ActionListener{
   
   // �ʵ�
   JButton sendBtn;
   JButton deleteBtn;
   
   // ������ (���������� ������ ȣ��ɶ��� ��� ����ְ� �� ���Ŀ��� �����)
   public frame02(String title) {
      // �θ�����ڿ� �������� ���� �Ѱ��ֱ�
      super(title);
      
      setLayout(new FlowLayout());
      
      sendBtn = new JButton("����");
      // �����ӿ� ��ư �߰��ϱ�(FlowLayout�� ������ �޴´�)
      add(sendBtn);
      sendBtn.addActionListener(this); // this�� �������� �ݵ�� Ŭ�������� �������� ��
      // �̷��� ����ó�� implements���� �� ���ָ� Override �������� ������ �ȴ�.
      
      // ���� ��ư�� ����
      deleteBtn = new JButton("����");
      // �����ӿ� �߰��ϱ�
      add(deleteBtn);
      deleteBtn.addActionListener(this);
      /*
       * getActionCommand() ����ϴ� ���
       * 
       *   ������ ��ư�� ActionCommand�� �����Ѵ�
       *   sendBtn.setActionCommane("send");
       *   deleteBtn.setActionCommane("delete");
       */
   }
      
   
   
   public static void main(String[] args) {
      
      JFrame f = new frame02("���� ������");
      f.setBounds(100, 100, 500, 500);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      f.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // �̺�Ʈ�� �߻��� ��ü(���⼭�� JButton ��ü)�� �������� return���ش�.
      Object obj = e.getSource();
      
      // �ʵ�� ��� �޼ҵ忡�� ������ ������ �����ϴ� ���̱� ������ �������� ���� �ʵ忡 �����ϸ� ��
      // sentBtn, deleteBtn�� �ʵ忡�ٰ� �������ָ� ��!
      /*
      if(obj == sendBtn) {
         JOptionPane.showMessageDialog(this, "�����մϴ�!");
      } else if(obj == deleteBtn) {
         JOptionPane.showMessageDialog(this, "�����մϴ�!");
      }
      */
      
      
//      String command = e.getActionCommand();
//      if(command.equals("����")) {
//         JOptionPane.showMessageDialog(this, "�����մϴ�!");
//      } else if(command.equals("����")) {
//         JOptionPane.showMessageDialog(this, "�����մϴ�!");
//      }
//      ������ Ȥ�� setActionCommand�� ������ �ۼ����ϰ� ���� �ڵ�ó�� �ۼ��ص� ���������� ������ �Ǵµ� ��ó�� ���°� ����������
//         �����̶�� ���� �ǳ���?
//         
//         �亯 : �� ��ư�� �ý�Ʈ�� ����Ʈ�� �׼� command �� �Ǳ� ������ ���� �մϴ�.

      
      
      /*    getActionCommand() ����ϴ� ���
       *    -> �ʵ忡 ������ �� �Ǿ� �־ ��
       * 
       *   �̺�Ʈ�� �Ͼ ��ü�� ������ ActionCommand ���ڿ� �о����
       *    
       *    String command = e.getActionCommand();
       *    if(command.equals("send")) {
       *       JOptionPane.showMessageDialog(this, "�����մϴ�!");
       *    } else if(command.equals("delete")) {
       *       JOptionPane.showMessageDialog(this, "�����մϴ�!");
       *    }
       */
      
      /*
       *   [ ���ڿ��� �񱳿� ���ؼ� ]
       *   
       *   ���ڿ��� ���Ѵٴ� ���� �������� ������ ���ϴ� �ɱ�?
       *   ���ڿ��� ������ ������ ���ϴ� �ɱ�?
       *   
       *   ���ڿ��� ������ ������ ���ϴ� ��찡 ��κ��̴�.
       *
       *  �׷��ٸ� == �����ڴ� �� ���ϴ� ������ ����?
       *     == ��  ���� ���� �� ���ϴ� ���̱� ������ �������� ���ϴ� �������̴�.
       *  
       *  �׷��� ���ڿ��� ������ ������ �������� ������?
       *     ���� ���� �ְ� �ƴҶ��� �ִ�.(���ڿ��� �����ϴ� ����� ���� �ٸ�)
       *  
       *  ��� : ���ڿ��� ������ ���� �� == �� ����ϸ� �ȵȴ�(���ڿ��� ������ ���Ƶ� false�� ��µǴ� ��Ȳ�� ��Ÿ��)
       *  
       *  ���ڿ��� ���ϴ� ����� String ��ü�� .equals() �޼ҵ带 Ȱ���ϸ� �ȴ�.
       */
    }
}