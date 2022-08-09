package test.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.util.MemberDto;
import test.util.DBConnect;

public class MemberDao {
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    
   //��ü ȸ�� ��� �����ϴ� �޼ҵ�
    public List<MemberDto> getListAll() {
    	   List<MemberDto> listAll = new ArrayList<>();
    	   try {
    		   String sql="SELECT num, name, address"
            		+ " FROM member"
            		+ " ORDER BY num ASC";
    		   conn=new DBConnect().getConn();
	    	   pstmt=conn.prepareStatement(sql);
	    	   
	    	   //select �� ���� �� ����� ResultSet���� ����
	    	   rs=pstmt.executeQuery(); 
	    	  
	    	   //�ݺ��� ����
	           while(rs.next()) { //Ŀ�� �����鼭
//	              int num = rs.getInt("num");
	              String name = rs.getString("name");
	              String addr = rs.getString("address");
//	     		  System.out.println(num+" | "+name+" | "+addr);
	
	              //Ŀ�� ��ġ�� ���� ȸ�� �Ѹ��� ������ MemberDto ��ü�� ���
	              MemberDto mdto = new MemberDto();
	              mdto.setNum(rs.getInt("num")); //�̷��Ե� ����
	              mdto.setName(name);
	              mdto.setAddr(addr);
	               
	              //MemberDto ��ü�� �������� ArrayList ��ü�� ����.
	              listAll.add(mdto);
	           }
           
    	   } catch(Exception e) {
    		   e.printStackTrace();
    	   } finally {
    	        try {
    	            if(rs!=null)rs.close();
    	            if(pstmt!=null)pstmt.close();
    	            if(conn!=null)conn.close();
    	        } catch(Exception e) {}
    	   }
    	   //MemberDto ��ü�� �������� ������� ������ ArrayList ��ü�� ������ ����.
    	   return listAll;
    };
    
   //Ư�� ȸ�� ��� �����ϴ� �޼ҵ� 
    public MemberDto getList(int num) {
        MemberDto dto=null;

        try {
        	conn=new DBConnect().getConn();
            String sql="SELECT name, address"
                    + " FROM member"
                    + " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
	        pstmt.setInt(1, num);
	        rs=pstmt.executeQuery();
	        /*
	          *  primary key �� select �� �ϰ� �Ǹ� select �� row �� �ִ� 1�� �̹Ƿ�
	          *  cursor �� �ݺ��� ���鼭 ������ ���� �ʿ䰡 ����. 
	          *  �� rs.next() �� �ѹ��� ����Ǹ� �ȴ�. 
	          */
	        if(rs.next()) {
//	            String name=rs.getString("name");
//	            String addr=rs.getString("address");
	            dto=new MemberDto();
	            dto.setNum(num);
	            // ResultSet���� ���� �̸��� ���� ��´�.
	            dto.setName(rs.getString("name"));
	            // ���� ������� �ּҵ� ��´�.
	            dto.setAddr(rs.getString("address"));
	        }

		} catch (Exception e) {
			e.printStackTrace();
	      }finally {
	          try {
	             if(rs!=null)rs.close();
	             if(pstmt!=null)pstmt.close();
	             if(conn!=null)conn.close();
	          }catch(Exception e) {}
    	
	      }
		return dto;
    }
    
    
    
   //ȸ�� �Ѹ��� ������ �߰��ϰ� �������θ� �����ϴ� �޼ҵ�
   public boolean insert(MemberDto dto) {

      //��ȭ��(�߰�, ����, ����) ���� ������ ���� ���������� �̸� ����� �д�. 
      int updatedRowCount=0;
      try {
         //DBConnect ��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�. 
         conn=new DBConnect().getConn();
         //������ sql ��
         String sql="INSERT INTO member"
               + " (num, name, address)"
               + " VALUES(member_seq.NEXTVAL, ?, ?)";
         //PreparedStatement ��ü ���� 
         pstmt=conn.prepareStatement(sql);
         //? ���ε� �Ұ� ������ ���ε� �Ѵ�.
         pstmt.setString(1, dto.getName());
         pstmt.setString(2, dto.getAddr());
         //������ �޼ҵ尡 �������ִ� ��ȭ�� ���� ������ ���������� ��´�. 
         updatedRowCount=pstmt.executeUpdate();
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //���� ��ȭ�� ���� ������ 0���� ũ��
      if(updatedRowCount > 0) {
         //�۾� ������ �ǹ��̱� ������ true �� �����ϰ� 
         return true;
      }else {
         //�۾��� ���и� false �� �����Ѵ�. 
         return false;
      }
   }
   //ȸ�� �Ѹ��� ������ �����ϰ� �������θ� �����ϴ� �޼ҵ�
   public boolean update(MemberDto dto) {
      Connection conn=null;
      PreparedStatement pstmt=null;
      //��ȭ��(�߰�, ����, ����) ���� ������ ���� ���������� �̸� ����� �д�. 
      int updatedRowCount=0;
      try {
         //DBConnect ��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�. 
         conn=new DBConnect().getConn();
         //������ sql ��
         String sql="UPDATE member"
               + " SET name=?, address=?"
               + " WHERE num=?";
         //PreparedStatement ��ü ���� 
         pstmt=conn.prepareStatement(sql);
         //? ���ε� �Ұ� ������ ���ε� �Ѵ�.
         pstmt.setString(1, dto.getName());
         pstmt.setString(2, dto.getAddr());
         pstmt.setInt(3, dto.getNum());
         //������ �޼ҵ尡 �������ִ� ��ȭ�� ���� ������ ���������� ��´�. 
         updatedRowCount=pstmt.executeUpdate();
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //���� ��ȭ�� ���� ������ 0���� ũ��
      if(updatedRowCount > 0) {
         //�۾� ������ �ǹ��̱� ������ true �� �����ϰ� 
         return true;
      }else {
         //�۾��� ���и� false �� �����Ѵ�. 
         return false;
      }
   }
   //ȸ�� �Ѹ��� ������ �����ϰ� �������θ� �����ϴ� �޼ҵ�
   public boolean delete(int num) {
      Connection conn=null;
      PreparedStatement pstmt=null;
      //��ȭ��(�߰�, ����, ����) ���� ������ ���� ���������� �̸� ����� �д�. 
      int updatedRowCount=0;
      try {
         //DBConnect ��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�. 
         conn=new DBConnect().getConn();
         //������ sql ��
         String sql="DELETE FROM member"
               + " WHERE num=?";
         //PreparedStatement ��ü ���� 
         pstmt=conn.prepareStatement(sql);
         //? ���ε� �Ұ� ������ ���ε� �Ѵ�.
         pstmt.setInt(1, num);
         //������ �޼ҵ尡 �������ִ� ��ȭ�� ���� ������ ���������� ��´�. 
         updatedRowCount=pstmt.executeUpdate();
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //���� ��ȭ�� ���� ������ 0���� ũ��
      if(updatedRowCount > 0) {
         //�۾� ������ �ǹ��̱� ������ true �� �����ϰ� 
         return true;
      }else {
         //�۾��� ���и� false �� �����Ѵ�. 
         return false;
      }
   }
}










