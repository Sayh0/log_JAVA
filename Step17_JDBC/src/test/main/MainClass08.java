package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		String name="DungUree";
		String addr="Sangdodong";
		HashMap<String, String> mem=new HashMap<>();
		mem.put("name", name);
		mem.put("addr", addr);
		insert(mem);

	}
	
	public static void insert(Map<String, String> map) {
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
	        pstmt.setString(1, map.get("name"));
	        pstmt.setString(2, map.get("addr")); 
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

