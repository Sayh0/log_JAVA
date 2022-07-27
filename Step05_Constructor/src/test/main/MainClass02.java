package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main method started");
		Member m1=new Member(1, "pikachu", "elec");
		Member m2=new Member(2, "raichu", "elec");
		Member m3=new Member(3, "peageon", "fly");
		//생성자를 미리 만들어 두어서 쇽쇽 넣어버린 경우.
		
		// new Member(); 임의로 생성자를 하나라도 정의하면 디폴트 생성자는 이제 생성 못함. 
	}
}
