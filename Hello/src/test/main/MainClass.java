package test.main; //패키지 파일명과 패키지 명시부는 일치해야한다.

public class MainClass { //자바 파일명과 클래스 명 또한 일치해야한다.
	public static void main(String[] args) {
		System.out.println("main method가 시작되었습니다.");
		int num1 = 10; // 자바는 let 같은 편한 거 못 쓴다 아쎄이.
		//int는 정수. 
		//int num2=10.11 << 에러.
		double num2=10.26326536;
		//double이 실수타입.
		boolean isRun=true;
		//boolean 타입.
		String myName="피카츄";
		//String 타입. String은 예약어가 아니다. 그래서 색도 안 변하는거임. 일단 여기까지 알고있으셈.
		//데이터 타입은 님들이 만들어 낼 수 있음. 이건 나중에 객체지향 할 때 배울듯.
		//자바는 타입별로 변수를 고정해야함. 타입이 '정적이다'. 문법이 '엄격하다'.
		//자바스크립트에서 let으로 온갖 변수를 다 처넣을 수 있었던 것에 비해 불편해지긴 했지. 대신 확실함. 근본이다 이말이야.
		
		myName="라이츄";
		System.out.println("main method가 종료되었습니다.");
	}
}