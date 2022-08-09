package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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
public class MemberFrame extends JFrame implements ActionListener, PropertyChangeListener{
   //�ʵ�
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   
   
   //������
   public MemberFrame() {
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
      model=new DefaultTableModel(colNames, 0) {
    	  @Override
    	  // �� ���� ���θ� �����ϴ� �޼ҵ�. true�� ��������, false�� �����Ұ�.
    	public boolean isCellEditable(int row, int column) {
    		  if (column==0) { //���࿡ 0��° �÷��̸�(��ȣ�÷�)
    			  //������ �Ұ����ϵ��� false return.
    			  return false;
    		  } else { //0��° �÷� �̿ܿ��� ��� ���� �����ϵ��� true ����.
    			  return true;  
    		  } //���� 0��° �÷�(Num �÷�)�� ����Ŭ���ص� ������ �� ����.
    	}
      }; //�͸�Ŭ����. class (?) extends DefaultTableModel. ���� ������ �������̵� ����.
      
      //���� ���̺� �����Ѵ�.
      table.setModel(model);
      //��ũ���� ���� �ϵ��� ���̺��� JScrollPane �� ���Ѵ�.
      JScrollPane scroll=new JScrollPane(table);
      //JScrollPane  �� �������� ����� ��ġ�ϱ� 
      this.add(scroll, BorderLayout.CENTER); //�ڱ��ڽ��� �޼ҵ�ϱ� this. this�� ���� ����.
      
      //�����ڿ��� table ��� �ѹ� �ϰ� �����ϱ�.
      this.displayMember(); //�ڱ��ڽ��� �޼ҵ�ϱ� this. this�� ���� ����.
      
      //���̺� ���� �ٲ������ ������ �����ʸ� ���.
      table.addPropertyChangeListener(this);
   }
   
   //���̺� ������ ����ϴ� �޼ҵ�
   public void displayMember() {
 	   System.out.println("display precess initiated");
	   //�̹� ���̺� ��µ� ������ �ִ°� ������Ŵ.
	   model.setRowCount(0);
	   //ȸ�� ��ü��� ������
	   List<MemberDto> list=new MemberDao().getListAll();
	   //Ȯ�� for��
	   for(MemberDto tmp:list) {
		   	//MemberDto ��ü�� �ִ� ������ Object[]�� ������� ���.
		      Object[] row={tmp.getNum(), tmp.getName(), tmp.getAddr()};
		      model.addRow(row);
		   }
 	   System.out.println("display precess completed");
   }
   @Override
   public void propertyChange(PropertyChangeEvent evt) {
	   System.out.println("property name : "+evt.getPropertyName());
	   System.out.println("isEditing : "+table.isEditing());
	   //���� property name�� tableCellEditor�� ���� table�� �������� �ƴϸ�
	   if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
		   //���� ���õ� row�� ������ �о�ͼ� �����ݿ��ϱ�.
		   int selectedRow=table.getSelectedRow();
		   int num=(int) model.getValueAt(selectedRow, 0);
		   String name=(String)model.getValueAt(selectedRow, 1);
		   String addr=(String)model.getValueAt(selectedRow, 2);
		   
		   //MemberDto ��ü�� ���
		   MemberDto mdto=new MemberDto(num, name, addr);
		   //memberDao ��ü �̿��� �����ݿ�
		   new MemberDao().update(mdto);
	   }
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      //������ ��ư�� action command ���� �о�ͼ� 
      String command=e.getActionCommand();
      String name=inputName.getText();
      String addr=inputAddr.getText();
	  MemberDto mdto=new MemberDto();
	  MemberDao mdao=new MemberDao();


      //�б��Ѵ�. Save process complete.
      if(command.equals("save")) {
    	  System.out.println("save precess initiated");
    	  mdto.setName(name);
    	  mdto.setAddr(addr);
    	  mdao.insert(mdto);
    	  System.out.println("save precess completed");
    	  displayMember();
      }else if(command.equals("delete")) {
    	  
    	  int[] rows=table.getSelectedRows(); //������ �����Ϸ��� Ctrl ������ �����Ѵ�.
    	  //��Ʈ �迭���� ���õ� ������� row�� ��
    	  //���� � row�� �������� �ʾҴٸ�
    	  if(rows.length ==0) {
    		  JOptionPane.showMessageDialog(this, "There's no rows in choice");
    		  //this�� Frame�� �������� showMessageDialog�� ������. ������Ʈ�� �������� �ʿ��ϴٰ� �ߴµ�, ���⼭ ������Ʈ�� �������̴�.
    		  //Ȥ�� ������Ʈ�� ������ ���� �� �ִµ�, �˸�â�� � ������Ʈ�� ��� �� �����ؾ� �ϱ� ����. ���⼭ �˸�â ��� ������Ʈ�� �ڱ��ڽ��̴ϱ� this.
    		  //this�� MemberFrame�� ����Ŵ.
    		  return; //�޼ҵ� ���⼭ ����.
    	  }
     	  System.out.println("delete precess initiated");
    	  //�ݺ��� ���鼭 ������ row �ε����� �����Ѵ�.
    	  for(int selcectedRow:rows) {
    		  //������ row�� ���� ù���� Į���� �ִ� ���� ����.(0,1,2 ���̴ϱ� 0 �ֱ�)
    		  //�о ������ƮŸ���� ������ ĳ����
    		  int num=(int) model.getValueAt(selcectedRow, 0);
    		  //MemberDao ��ü�� �̿��ؼ� �ش� ��ȣ�� ȸ�������� �����ϱ�.
    		  mdao.delete(num); 
    		  //�ݺ����̴ϱ�, ������ ���������� ������ ��������.
    	  }
      	  System.out.println("delete precess completed");
    	  displayMember();
      } 
    	  
   }
   
   
   //main  �޼ҵ�
   public static void main(String[] args) {
      MemberFrame f=new MemberFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   }



}








