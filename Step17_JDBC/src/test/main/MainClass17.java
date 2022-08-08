package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 * MemberDao 객체를 이용해서 회원 전체의 목록 얻어오기
 * 아래와 같은 형식으로 출력하기.
 * 
 * 번호 => 1, 이름 => XXX, 주소 => XXX
 * 번호 => 2, 이름 => ...
 * 
 */
public class MainClass17 {
	public static void main(String[] args) {
		List<MemberDto> list=new MemberDao().getListAll();
		
		for(int i=0;i<list.size();i++) {
			System.out.println("번호 => "+list.get(i).getNum()
					+",\t이름 => "+list.get(i).getName()
					+",주소 => "+list.get(i).getAddr());
		}
	}
}
