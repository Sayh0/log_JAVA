package test.main;

import java.io.*;
import java.util.*;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15_Update {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input data (NUM NAME ADDRESS)");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str," ");
		int num=Integer.parseInt(st.nextToken());
		String name=st.nextToken();
		String addr=st.nextToken();
		
		MemberDto mdto=new MemberDto(num,name,addr);
		
		boolean isSuccses=new MemberDao().update(mdto);
		if(isSuccses) {
			System.out.println("member data update completed.");
		} else {
			System.out.println("update failed!");
		}
	}
}

