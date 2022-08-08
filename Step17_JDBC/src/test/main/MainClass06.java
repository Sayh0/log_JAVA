package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass06 {
	public static void main(String[] args) {
	      Connection conn=null;
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         System.out.println("Oracle DB connect completed");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try {
	            String sql="SELECT empno, emp.deptno, dname, loc "
	            		+ " FROM emp, dept"
	            		+ " WHERE emp.deptno(+) = dept.deptno";

	    	  pstmt=conn.prepareStatement(sql);

	    	  rs=pstmt.executeQuery(); 
	           while(rs.next()) {
	               int empno = rs.getInt("empno");
	               int deptno = rs.getInt("deptno");
	               String dname = rs.getString("dname");
	               String loc = rs.getString("loc");
	    		  System.out.println(empno+" | "+deptno+" | "+dname+" | "+loc);
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	      System.out.println("method teminated");
	}
}
