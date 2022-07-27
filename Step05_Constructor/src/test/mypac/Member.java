package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	//아무런 값도 전달받지 않는 기본 생성자.
	public Member() {
		System.out.println("기본 생성자가 호출되었습니다.");
	}
	
	//필드에 저장할 값을 전달받는 생성자.
	public Member(int num, String name, String addr) { //생성자 call.
		this.num=num;
		this.name=name;
		this.addr=addr;
	//생성자는 용도에 따라 여러개 생성할 수 있음.
		
		
	
	}
}
