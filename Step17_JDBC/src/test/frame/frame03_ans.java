package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.pac.MemberDto;
/*
 *  //1. ���õ� row  �ε����� �о�´�.
   int selectedIndex=table.getSelectedRow();
   
   //2. ���õ� row �� ù��°(0��°) Į���� ���ڸ� �о�´� (������ ȸ���� ��ȣ)
   int num=(int)model.getValueAt(selectedIndex, 0);
   
   
   -------------------------------------
   
   List<MemberDto>  list=dao.getList();
   
   for(MemberDto tmp:list){
      Object[] row={tmp.getNum(), tmp.getName(), tmp.getAddr()};
      model.addRow(row);
   }
 * 
 */
public class frame03_ans extends JFrame implements ActionListener {
   //�ʵ�
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   
   //������
   public frame03_ans() {
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("�̸�");
      inputName=new JTextField(10);
      
      JLabel label2=new JLabel("�ּ�");
      inputAddr=new JTextField(10);
      
      JButton saveBtn=new JButton("����");
      saveBtn.setActionCommand("save");
      
      //���� ��ư �߰�
      JButton deleteBtn=new JButton("����");
      deleteBtn.setActionCommand("delete");
      
      JPanel panel=new JPanel();
      panel.add(label1);
      panel.add(inputName);
      panel.add(label2);
      panel.add(inputAddr);
      panel.add(saveBtn);
      panel.add(deleteBtn);
      
      add(panel, BorderLayout.NORTH);
      
      //ǥ�������� ������ ����ϱ� ���� JTable
      table=new JTable();
      //Į������ String[] �� ������� �غ�
      String[] colNames= {"��ȣ", "�̸�", "�ּ�"};
      //���̺� ����� ������ ������ �ִ� �� ��ü (Į����, row ����)
      model=new DefaultTableModel(colNames, 0);
      //���� ���̺� �����Ѵ�.
      table.setModel(model);
      //��ũ���� ���� �ϵ��� ���̺��� JScrollPane �� ���Ѵ�.
      JScrollPane scroll=new JScrollPane(table);
      //JScrollPane  �� �������� ����� ��ġ�ϱ� 
      add(scroll, BorderLayout.CENTER);
      
      displayMember();
      displayMembers();
      
      saveBtn.addActionListener(this);
      deleteBtn.addActionListener(this);
   }
   
   //���̺� ������ ����ϴ� �޼ҵ�
   public void displayMember() {
      
      //model.setRowCount(0); //���̺� ��µ� ������ reset 
      
      Object[] row1= {1, "�豸��", "�뷮��"};
      model.addRow(row1);
      
      Object[] row2= {2, "�ذ�", "��ŵ�"};
      model.addRow(row2);
      
      Object[] row3= {3, "������", "�󵵵�"};
      model.addRow(row3);
      
   }
   
   public void displayMembers() {
      model.setRowCount(0);
      
      MemberDao dao = new MemberDao();
      List<MemberDto> memList = dao.getAllData();
      for(MemberDto member:memList) {
         Object[] row = {member.getNum(), member.getName(), member.getAddr()};
         model.addRow(row);
      }
   }
   
   
   //main  �޼ҵ�
   public static void main(String[] args) {
      TestFrame f=new TestFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String actionComm = e.getActionCommand();
      MemberDao dao = new MemberDao();
      MemberDto dto = null;
      List<MemberDto> memList = null;
      boolean isSuccess = true;
      
      if(actionComm.equals("save")) {
         String name = inputName.getText();
         String addr = inputAddr.getText();
         
         if(name.equals("")) {
            JOptionPane.showMessageDialog(null, "ȸ������ �Է��ϼ���!", "Did not input userName", JOptionPane.WARNING_MESSAGE);
         }
         
         dto = new MemberDto();
         dto.setName(name);
         dto.setAddr(addr);
         
         isSuccess = dao.insert(dto);
         
         if(isSuccess) {
            // ���̺� �ʱ�ȭ
            model.setRowCount(0);
            
            // ��ü ������ ����
            memList = dao.getAllData();
            
            // ��ü ������ ���
            for(MemberDto member:memList) {
               Object[] row = {member.getNum(), member.getName(), member.getAddr()};
               model.addRow(row);
            }
         } else {
            JOptionPane.showMessageDialog(null, "ROW �߰� ����!", "Fail to add rowData", JOptionPane.WARNING_MESSAGE);
         }
      } else if(actionComm.equals("delete")) {
         try {
            int selectedNum = table.getSelectedRow();
            int num = (int)model.getValueAt(selectedNum, 0);
            isSuccess = dao.delete(num);
            if(isSuccess) {
               // ���̺� �ʱ�ȭ
               model.setRowCount(0);
               
               // ��ü ������ ����
               memList = dao.getAllData();
               
               // ��ü ������ ���
               for(MemberDto member:memList) {
                  Object[] row = {member.getNum(), member.getName(), member.getAddr()};
                  model.addRow(row);
               }
            } else {
               JOptionPane.showMessageDialog(null, "ROW ���� ����!", "Fail to delete rowData", JOptionPane.WARNING_MESSAGE);
            }
         } catch(Exception e1) {
            JOptionPane.showMessageDialog(null, "������ ROW�� �����ϼ���!", "Did not choice rowData", JOptionPane.WARNING_MESSAGE);
         }
      }
   }
}