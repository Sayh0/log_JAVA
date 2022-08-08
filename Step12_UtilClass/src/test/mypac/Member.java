package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	/*
	 * 기본 생성자도 필요하다면 정의 가능
	 * 생성자는 다중정의 가능
	 * 어떤 객체를 생성하는 방법이 여러가지가 될 수 있다는 말.
	 */
	public Member() {}
	
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}
