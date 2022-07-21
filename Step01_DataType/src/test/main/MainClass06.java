package test.main;
/*
 * 자바 참조 데이터 타입
 * String type.
 * -문자열을 다룰 대 사용하는 데이터 type.
 */
public class MainClass06 {
	public static void main(String[] args) {
		
		String name="피카츄";//피카츄 라는 String type 객체를 heap 영역에 만들고 참조값(id값) 변수에 담기
		/*
		 *객체를 이해하기. 객체는 사물함에 들어있는 무언가. 값의 저장소와 기능 역할.
		 *객체는 저장소(값)와 기능(동작).
		 *자바에서 .을 찍는것은 저장소 혹은 기능을 찾아간다는 의미이다.
		 *위 name에다 점을 찍으면 name. <<기능 목록이 주루루룩 나열될 것이다. 나중에 배우자.
		 *자바스크립트의 오브젝트처럼 이해하자. 
		 */
		String tmp=name; //name 안의 참조값을 변수에 대입.
		//int num.<< 기본 데이터 값은 값 자체이기 때문에 점을 찍어도 아무것도 안나온다. 
		
		name="라이츄"; //"라이츄" String type 객체를 heap 영역에 만들고 참조값 name 변수에 덮어쓰기.

		//이때 id값은 변경됨.
		name=null; // name 변수 비우기.
		//(참고)null은 참조데이터가 담길 수 있는 빈 공간을 의미한다고 생각하자.
		
		
	}
}
