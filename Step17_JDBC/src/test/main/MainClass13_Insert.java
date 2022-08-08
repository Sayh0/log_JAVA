package test.main;

import test.dao.MemberDao;
import test.dao.MemberDao_mywork;
import test.dto.MemberDto;

public class MainClass13_Insert {
	public static void main(String[] args) {
		String name="Hamburger";
		String addr="McDonald";
		MemberDto mdto=new MemberDto();
		mdto.setName(name);
		mdto.setAddr(addr);
		
		MemberDao mdao=new MemberDao();
		boolean isSuccess=mdao.insert(mdto);
		if(isSuccess) {
			System.out.println("회원 정보를 추가했습니다. member data update completed");
		} else {
			System.out.println("추가 실패! update failed!");
		}
		
		//위 회원정보를 MemberDao 객체를 이용하여 DB에 저장하고
		//성공이면 "회원 정보를 추가했습니다"
		//실패면 "추가 실패!" 를 콘솔창에 출력하는 코드 작성.
		
	}
}
