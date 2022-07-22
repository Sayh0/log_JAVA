package test.main;

import test.mypac.Member;

public class MainClass03_member {
	public static void main(String[] args) {
		System.out.println("메인 메소드 작동 시작");
		Member mem1=new Member(); //객체 생성.
		mem1.num=1;			//1 들어감
		mem1.name="피카츄";	//피카츄 들어감
		mem1.addr="상록숲"; 	//상록숲 들어감.
		// mem1.isMan=true; << 오류. 있는 것만 쓰자.
		
		/*
		 * 이런식으로 mem1에 하나, mem2에 또 다른거 하나...이런식으로 응용.
		 */
		
		Member mem2=new Member(); // 알겠지?
		mem2.num=2;
		mem2.name="라이츄";
		mem2.addr="갈색시티";
		
	}
}
