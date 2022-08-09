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
import test.dto.MemberDto;
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
public class TestFrame extends JFrame implements ActionListener{
   //�ʵ�
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   
   //������
   public TestFrame() {
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("�̸�");
      inputName=new JTextField(10);
      
      JLabel label2=new JLabel("�ּ�");
      inputAddr=new JTextField(10);
      
      JButton saveBtn=new JButton("����");
      saveBtn.setActionCommand("save");
      saveBtn.addActionListener(this);
      
      //���� ��ư �߰�
      JButton deleteBtn=new JButton("����");
      deleteBtn.setActionCommand("delete");
      deleteBtn.addActionListener(this);
      
      //���� ��ư �߰�
      JButton updateBtn=new JButton("����");
      updateBtn.setActionCommand("update");
      updateBtn.addActionListener(this);
      
      JPanel panel=new JPanel();
      panel.add(label1);
      panel.add(inputName);
      panel.add(label2);
      panel.add(inputAddr);
      panel.add(saveBtn);
      panel.add(deleteBtn);
      panel.add(updateBtn);

      
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
      
      displayMemberInit();
      
   }
   //table �ʱ�ȭ �޼ҵ�
   public void displayMemberInit() {
	      model.setRowCount(0);
	      MemberDao dao = new MemberDao();
	      List<MemberDto> list = dao.getListAll();
	      for(MemberDto member:list) {
	         Object[] row = {member.getNum(), member.getName(), member.getAddr()};
	         model.addRow(row);
	      }
//	      for(int i=0; i<list.size(); i++) {
//	    	  MemberDto tmp=list.get(i);
//	    	  Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
//	    	  model.addRow(row);
//	      }

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

   
   
   //main  �޼ҵ�
   public static void main(String[] args) {
      TestFrame f=new TestFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		String actCmd=e.getActionCommand();
		
		MemberDto mdto=null;
		MemberDao mdao=new MemberDao();
		String name=inputName.getText();
		String addr=inputAddr.getText();
		
		if(actCmd.equals("save")) {
			System.out.println("save initiated");
			if(name.equals("") || addr.equals("") || name.equals(" ") || addr.equals(" ")) {
				System.out.println("wrong input");
	            JOptionPane.showMessageDialog(null, "input username please!", 
	            		"input userName", 
	            		JOptionPane.WARNING_MESSAGE);
			}
			mdto=new MemberDto();
			mdto.setName(name);
			mdto.setAddr(addr);
			
			boolean isSuccess=mdao.insert(mdto);
			if (isSuccess) {
				System.out.println("save succeeded.");
				model.setRowCount(0); //���̺� ī��Ʈ �ʱ�ȭ
				
				displayMemberInit();
				
			} else {
				System.out.println("save failed.");
	            JOptionPane.showMessageDialog(null, "save failed!", 
	            		"Error", 
	            		JOptionPane.WARNING_MESSAGE);
			}
			
		} else if (actCmd.equals("delete")) {
			try {
				System.out.println("delete initiated");
				int selectedNum=table.getSelectedRow(); //row ����
				int num=(int) model.getValueAt(selectedNum, 0);
				boolean isSuccess=mdao.delete(num);
				if(isSuccess) {
					model.setRowCount(0); //���̺� �ʱ�ȭ
					displayMemberInit();

				} else {
					System.out.println("delete failed.");
		            JOptionPane.showMessageDialog(null, "delete failed!", 
		            		"Error", 
		            		JOptionPane.WARNING_MESSAGE);
				}
			} catch(Exception delexception) {
				
			}
		} else {
			System.out.println("update initiated");
			int selectedNum=table.getSelectedRow(); //row ����
			int num=(int) model.getValueAt(selectedNum, 0);

			if(name.equals("") || addr.equals("") || name.equals(" ") || addr.equals(" ")) {
				System.out.println("wrong input");
	            JOptionPane.showMessageDialog(null, "input username please!", 
	            		"Error", 
	            		JOptionPane.WARNING_MESSAGE);
			}
			mdto=new MemberDto(num, name, addr);
			boolean isSuccess=mdao.update(mdto);

			if(isSuccess) {
				model.setRowCount(0);
				displayMemberInit();

			} else {
				System.out.println("update failed.");
	            JOptionPane.showMessageDialog(null, "update failed!", 
	            		"Error", 
	            		JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}








