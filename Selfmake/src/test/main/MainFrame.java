package test.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import oracle.net.aso.a;

public class MainFrame extends JFrame implements ActionListener {
	   //필드
    JTextField inputName, inputAddr;
    DefaultTableModel model;
    JTable table;
    
	public MainFrame() {
		  setLayout(new BorderLayout());
			
		  JLabel label1=new JLabel("COUNTRY");
		  inputName=new JTextField(10);
		  
		  JLabel label2=new JLabel("MUST GO");
		  inputAddr=new JTextField(10);
		  
		  
		  
		  JButton saveBtn=new JButton("SAVE");
		  saveBtn.setActionCommand("save");
		  saveBtn.addActionListener(this);
		  
		  //삭제 버튼 추가
		  JButton deleteBtn=new JButton("DELETE");
		  deleteBtn.setActionCommand("delete");
		  deleteBtn.addActionListener(this);
		  
	      JPanel panel=new JPanel();
	      panel.add(label1);
	      panel.add(inputName);
	      panel.add(label2);
	      panel.add(inputAddr);
	      panel.add(saveBtn);
	      panel.add(deleteBtn);
	      this.add(panel, BorderLayout.NORTH);
	      
	      JPanel botmPanel=new JPanel();
	      JLabel manual=new JLabel("If you want to update cell, "
		      		+ "click the cell and input data to update, "
		      		+ "press the UPDATE button.");
	      botmPanel.add(manual);
	      
	      table=new JTable();
	      String[] colNames= {"NUMBER","COUNTRY","CAPITAL"};
	      model=new DefaultTableModel(colNames, 0);
	      JScrollPane scroll=new JScrollPane(table);
	      this.add(scroll, BorderLayout.CENTER);
	      this.add(botmPanel, BorderLayout.SOUTH);
	      
	      
		      
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		MainFrame mainFrame=new MainFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(100, 100, 800, 500);
		mainFrame.setVisible(true);
	}
}
