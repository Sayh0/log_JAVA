package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass10_delete {
	public static void main(String[] args) {
		//delete member number
		int num=1;
		//method call and deliver number
		delete(num);
	}
	
	public static void delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
	
		try {conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        try {
    		String sql="DELETE FROM member"
    				+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
	        pstmt.executeUpdate();
	        System.out.println("member delete completed.");
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
