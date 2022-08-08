package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;

import test.dto.MemberDto;
import test.util.DBConnect;

/* 
 * � ���񽺸� ����� ��
 * 
 * ȸ�� �Ѹ��� ������ �ҷ����� �۾�	new MemberDao().getData()
 * 
 * ȸ�� �Ѹ��� ������ �����ϴ� �۾�	new MemberDao().delete()
 * 
 * ȸ�� �Ѹ��� ������ �����ϴ� ���� �۾���	new MemberDao().update()
 * 
 * code�� ���� �κп��� ���� �ϴ� ��츦 ���ϰ� ���� �� ������?
 * 
 */
public class MemberDao_mywork{ //DAO means Data Access Object
	Connection conn=null;
	PreparedStatement pstmt=null;
	int updatedRowCount=0; 

	//ȸ�� �Ѹ��� ������ �߰��ϰ� �������θ� �����ϴ� �޼ҵ�.
	public boolean insert(MemberDto dto) {
        try {
            conn=new DBConnect().getConn();
    		String sql="INSERT INTO member"
 	               + " (num, name, address)"
 	               + " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, dto.getName());
	        pstmt.setString(2, dto.getAddr()); 
	        pstmt.executeUpdate();
	        System.out.println("member Update completed.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}
		if (updatedRowCount<0) { 
        	return true;
        } else {
        	return false;
        }
	}
	//ȸ�� �Ѹ��� ������ �����ϰ� �������θ� �����ϴ� �޼ҵ�
	public boolean update(MemberDto dto) {
		try {conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
        try {
    		String sql="UPDATE member"
 	               + " SET name=?, address=?"
 	               + " WHERE num= ?";
			pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, dto.getName());
	        pstmt.setString(2, dto.getAddr()); 
	        pstmt.setInt(3, dto.getNum());
	        pstmt.executeUpdate();
	        System.out.println("member Update completed.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}
		if (updatedRowCount<0) { 
        	return true;
        } else {
        	return false;
        }
	}
	//ȸ�� �Ѹ��� ������ �����ϰ� �������θ� �����ϴ� �޼ҵ�.
	public boolean delete(int num) { 
		try {conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        try {
    		String sql="DELETE FROM member"
    				+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);

	        updatedRowCount=pstmt.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}
		if (updatedRowCount<0) { 
        	return true;
        } else {
        	return false;
        }
	}
}
