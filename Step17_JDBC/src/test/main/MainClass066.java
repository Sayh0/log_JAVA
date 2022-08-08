package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.util.DBConnect;

public class MainClass066 {
	public static void main(String[] args) {
		
		//member_seq 이라는 시퀀스를 이용해서 아래의 회원 정보를 추가해보기.
		String name="Park";
		String addr="HangShinDong";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
	
		try {conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

        try {
    		String sql="INSERT INTO member"
 	               + " (num, name, addr)"
 	               + " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, name);
	        pstmt.setString(2, addr); 
	        pstmt.executeUpdate();
	        System.out.println("member Update completed.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//닫는 건 열었던 순서 거꾸로.
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}

			
		
	}
}
