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
 *  //1. 선택된 row  인덱스를 읽어온다.
   int selectedIndex=table.getSelectedRow();
   
   //2. 선택된 row 의 첫번째(0번째) 칼럼의 숫자를 읽어온다 (삭제할 회원의 번호)
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
   //필드
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   
   
   //생성자
   public MemberFrame() {
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("이름");
      inputName=new JTextField(10);
      
      JLabel label2=new JLabel("주소");
      inputAddr=new JTextField(10);
      
      JButton saveBtn=new JButton("저장");
      saveBtn.setActionCommand("save");
      saveBtn.addActionListener(this);

      
      //삭제 버튼 추가
      JButton deleteBtn=new JButton("삭제");
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
      
      //표형식으로 정보를 출력하기 위한 JTable
      table=new JTable();
      //칼럼명을 String[] 에 순서대로 준비
      String[] colNames= {"번호", "이름", "주소"};
      //테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)
      model=new DefaultTableModel(colNames, 0) {
    	  @Override
    	  // 셀 수정 여부를 리턴하는 메소드. true는 수정가능, false는 수정불가.
    	public boolean isCellEditable(int row, int column) {
    		  if (column==0) { //만약에 0번째 컬럼이면(번호컬럼)
    			  //수정이 불가능하도록 false return.
    			  return false;
    		  } else { //0번째 컬럼 이외에는 모두 수정 가능하도록 true 리턴.
    			  return true;  
    		  } //이제 0번째 컬럼(Num 컬럼)은 더블클릭해도 수정할 수 없다.
    	}
      }; //익명클래스. class (?) extends DefaultTableModel. 아주 간단히 오버라이드 가능.
      
      //모델을 테이블에 연결한다.
      table.setModel(model);
      //스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
      JScrollPane scroll=new JScrollPane(table);
      //JScrollPane  을 프레임의 가운데에 배치하기 
      this.add(scroll, BorderLayout.CENTER); //자기자신의 메소드니까 this. this는 생략 가능.
      
      //생성자에서 table 출력 한번 하고 시작하기.
      this.displayMember(); //자기자신의 메소드니까 this. this는 생략 가능.
      
      //테이블에 값이 바뀌었는지 감시할 리스너를 등록.
      table.addPropertyChangeListener(this);
   }
   
   //테이블에 데이터 출력하는 메소드
   public void displayMember() {
 	   System.out.println("display precess initiated");
	   //이미 테이블에 출력된 내용이 있는걸 삭제시킴.
	   model.setRowCount(0);
	   //회원 전체목록 얻어오기
	   List<MemberDto> list=new MemberDao().getListAll();
	   //확장 for문
	   for(MemberDto tmp:list) {
		   	//MemberDto 객체에 있는 내용을 Object[]에 순서대로 담기.
		      Object[] row={tmp.getNum(), tmp.getName(), tmp.getAddr()};
		      model.addRow(row);
		   }
 	   System.out.println("display precess completed");
   }
   @Override
   public void propertyChange(PropertyChangeEvent evt) {
	   System.out.println("property name : "+evt.getPropertyName());
	   System.out.println("isEditing : "+table.isEditing());
	   //만일 property name이 tableCellEditor와 같고 table이 수정중이 아니면
	   if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
		   //현재 선택된 row의 정보를 읽어와서 수정반영하기.
		   int selectedRow=table.getSelectedRow();
		   int num=(int) model.getValueAt(selectedRow, 0);
		   String name=(String)model.getValueAt(selectedRow, 1);
		   String addr=(String)model.getValueAt(selectedRow, 2);
		   
		   //MemberDto 객체에 담기
		   MemberDto mdto=new MemberDto(num, name, addr);
		   //memberDao 객체 이용해 수정반영
		   new MemberDao().update(mdto);
	   }
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      //눌러진 버튼의 action command 값을 읽어와서 
      String command=e.getActionCommand();
      String name=inputName.getText();
      String addr=inputAddr.getText();
	  MemberDto mdto=new MemberDto();
	  MemberDao mdao=new MemberDao();


      //분기한다. Save process complete.
      if(command.equals("save")) {
    	  System.out.println("save precess initiated");
    	  mdto.setName(name);
    	  mdto.setAddr(addr);
    	  mdao.insert(mdto);
    	  System.out.println("save precess completed");
    	  displayMember();
      }else if(command.equals("delete")) {
    	  
    	  int[] rows=table.getSelectedRows(); //여러개 선택하려면 Ctrl 누르고 선택한다.
    	  //인트 배열에는 선택된 순서대로 row가 들어감
    	  //만일 어떤 row도 선택하지 않았다면
    	  if(rows.length ==0) {
    		  JOptionPane.showMessageDialog(this, "There's no rows in choice");
    		  //this는 Frame의 참조값을 showMessageDialog에 갖다줌. 컴포넌트의 참조값이 필요하다고 뜨는데, 여기서 컴포넌트는 프레임이다.
    		  //혹시 컴포넌트가 여러개 있을 수 있는데, 알림창을 어떤 컴포넌트에 띄울 지 전달해야 하기 때문. 여기서 알림창 띄울 컴포넌트는 자기자신이니까 this.
    		  //this는 MemberFrame을 가리킴.
    		  return; //메소드 여기서 종료.
    	  }
     	  System.out.println("delete precess initiated");
    	  //반복문 돌면서 선택한 row 인덱스를 참조한다.
    	  for(int selcectedRow:rows) {
    		  //선택한 row의 가장 첫번재 칼럼에 있는 숫자 얻어내기.(0,1,2 순이니까 0 넣기)
    		  //읽어낸 오브젝트타입을 정수로 캐스팅
    		  int num=(int) model.getValueAt(selcectedRow, 0);
    		  //MemberDao 객체를 이용해서 해당 번호의 회원정보를 삭제하기.
    		  mdao.delete(num); 
    		  //반복문이니까, 여러개 선택했으면 여러개 지워진다.
    	  }
      	  System.out.println("delete precess completed");
    	  displayMember();
      } 
    	  
   }
   
   
   //main  메소드
   public static void main(String[] args) {
      MemberFrame f=new MemberFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   }



}








