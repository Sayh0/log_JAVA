package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass_iistAll {
	public static void main(String[] args) {
		List<MemberDto> list=new MemberDao().getListAll();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getNum()
					+" | "+list.get(i).getName()
					+" | "+list.get(i).getAddr());
		}
	}
	
}
