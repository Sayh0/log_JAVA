package test.main;
import test.mypac.*;
public class MainClass02_car {
	public static void main(String[] args) {
		//달리려면?
		
		Car car1=new Car();
		// new 로 Car를 틀에서 찍어내고, car1에다 담기.
		// car1에는 Car 클래스의 참조값이 담김. 진짜 car가 통으로 담기는게 아님.
		// 데이터타입은 Car. 변수명은 내맘대로긴 한데 car1으로 잡자.
		
		car1.drive(); // 달리기 성공~!
		
		// 아하. 이러면 일일히 맨날 일회용으로 불러오지 않아도 되니 메모리 관리에 효울적인~!!
		new Car().drive(); //<< 이게 일회용으로 쓰는 것.
		
		
		// 이 차의 브랜드가 뭔데?
		String carname=car1.name;
		System.out.println(carname);
	}
}

/*
 * 어떤 객체는 뭔가 여러개를 찍어내야 할 필요가 있음.
 * 필드 모양과 기능은 같지만 여러개가 필요한 경우가 있단 말이지.
 * 똑같은 모양의 객체가 상당히 여러번 필요할 때가 있디. 
 * 게시판에 글 저장할때도 틀은 똑같지만 안에 있는 내용은 다르니까...
 * 아 참고로 배열도 객체임. 배열이라는 형식은 같지만 안의 내용은 다 다르다.
 * 
*/
