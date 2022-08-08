package test.main;

import java.util.*;

import test.mypac.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		List<MemberDto> members=new ArrayList<MemberDto>();
		
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		MemberDto dto3=new MemberDto(2, "원숭이", "상도동");
		
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		for(MemberDto temp:members) {
			System.out.println("번호 : "+temp.getNum()
							+", 이름 : "+temp.getName()
							+", 주소 : "+temp.getAddr());
		}
		

	}
		
}


