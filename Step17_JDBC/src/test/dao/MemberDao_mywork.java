package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;

import test.dto.MemberDto;
import test.util.DBConnect;

/* 
 * 어떤 서비스를 만드는 데
 * 
 * 회원 한명의 정보를 불러오는 작업	new MemberDao().getData()
 * 
 * 회원 한명의 정보를 삭제하는 작업	new MemberDao().delete()
 * 
 * 회원 한명의 정보를 수정하는 등의 작업을	new MemberDao().update()
 * 
 * code의 여러 부분에서 해햐 하는 경우를 편리하게 줄일 수 없을까?
 * 
 */
public class MemberDao_mywork{ //DAO means Data Access Object
	Connection conn=null;
	PreparedStatement pstmt=null;
	int updatedRowCount=0; 

	//회원 한명의 정보를 추가하고 성공여부를 리턴하는 메소드.
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
	//회원 한명의 정보를 수정하고 성공여부를 리턴하는 메소드
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
	//회원 한명의 정보를 삭제하고 성공여부를 리턴하는 메소드.
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
