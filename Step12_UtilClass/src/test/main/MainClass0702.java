package test.main;

import java.util.ArrayList;

import test.mypac.Member;

public class MainClass0702 {
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();
		/*
		 * 향상된 for 문 이용하기
		 * 
		 * String[] arr = {"홍길동","아무개","호호호"};
		 *
		 * for( String str : arr) {		
		 * 		System.out.println(str);
		 * }
		 * for( 자료형 변수명 : 배열명) {
		 * 		문장
		 * }
		 */
	
		Member[] mems = {
		   new Member(1, "a1", "강남"),
		   new Member(2, "a2", "서초"),
		   new Member(3, "a3", "역삼")
		};
	
		for(Member mem:mems) {
		   members.add(mem);
		}
	
		for(Member member:members) {
		   System.out.print("번호 : "+member.num+", ");
		   System.out.print("이름 : "+member.name+", ");
		   System.out.println("주소 : "+member.addr);
		}
	}
}
