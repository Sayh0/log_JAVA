package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("검색을 원하는 회원의 번호를 입력하세요(종료 : q).");
			String str=scan.nextLine();
			if(str.equals("q")) {
				break;
			}
			//입력한 문자열을 정수로 변환.
			int num=Integer.parseInt(str);
			System.out.println(num+"번 회원 정보 조회중");
			
			MemberDao mdao=new MemberDao();
			MemberDto getlist=mdao.getList(num);
			if(getlist!=null) {
				System.out.println("이름 => "+getlist.getName()+", 주소 => "+getlist.getAddr());
			} else {
				System.out.println(num+"번 회원은 존재하지 않습니다.");
			}
		}
		System.out.println("앱이 종료됩니다.");
	}
}
