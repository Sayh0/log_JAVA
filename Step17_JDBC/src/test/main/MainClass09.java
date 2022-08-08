package test.main;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		//수정할 회원 정보
		int num=1;
		String name="HoBbang";
		String addr="AHyundong";
		
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		update(dto);

	}
	
	public static void update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
	
		try {conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
        try {
    		String sql="UPDATE member"
 	               + " SET name=?, addr=?"
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
			//닫는 건 열었던 순서 거꾸로.
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}
		
	}
}
