package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass_getList {
	public static void main(String[] args) {
		int num=3;
		MemberDto mdto=new MemberDto();
		
		MemberDao mdao=new MemberDao();
		MemberDto getlist=mdao.getList(num);
		if(getlist!=null) {
			System.out.println(getlist.getNum()+getlist.getName()+"member data print completed");
		} else {
			System.out.println("추가 실패! update failed!");
		}
		
		//성공이면 "회원 정보를 추가했습니다"와 리스트 출력
		//실패면 "추가 실패!" 를 콘솔창에 출력하는 코드 작성.
		
	}
}

