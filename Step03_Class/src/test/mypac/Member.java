package test.mypac;
/*
 * Member 객체에 회원의 번호, 이름, 주소를 담고 싶다면?
 * 클래스를 어떻게 설계하면 좋을까?
 * 
 * 저장소(필드)가 3개 필요하다.
 * 필드 타입은 int, String, String 정도면 적당하겠다.
 * 필드에 값은 나중에 new Member() 한 이후에 담을 예정.
 */
public class Member {
	public int num=0;
	public String name=null;
	public String addr; //필드 변수는 알아서 초기화를 해준다. null이랑 0 안써도 됨. 편리하여라. 
}
