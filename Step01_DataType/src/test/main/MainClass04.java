package test.main;
/*
 * [자바 기본 데이터 타입]
 * 문자형 char
 * 
 * -65536개의 코드값 가질 수 있음.
 * -전 세계에서 사용하는 모든 문자 1글자 표현 가능
 * -single quotation(작은따옴표)로 작성
 */
public class MainClass04 {
		public char ch0='라'; //여긴 필드Field다.
		// 클래스 개념을 배우고 나니까 이제 왜 그냥 여기다 char ch0='라'로는 변수생성이 안되는거 알았음.
	public static void main(String[] args) {
		System.out.println("main method started.");
		char ch1='a';
		char ch2='b';
		char ch3='c';
		char ch4='가';
		char ch5='나';
		char ch6='다';
		char ch7='@';
		
		//정수값에 1:1 대응하는 char 값이 존재한다.
		
		int code1=ch1; //97
		int code2=ch2; //98
		int code3=ch3; //99
		int code4=ch4; //44032
		int code5=ch5; //45208
		int code6=ch6; //45796
		MainClass04 test=new MainClass04(); //이래야 생성됨.
		char ch8=test.ch0;
		int code7=ch8;
		
		System.out.println(code6); //45796 출력
	
	/*
	 * 이상의 기본데이터 값들(byte부터 char까지)는 실제 값이 대입되어 있음.
	 * 이거 아닌 String 같은 애들은 참조값이 들어있음.
	 * 무슨 소리냐고? 나중에 알려줄 테니 이해 안해도 된다.
	 */
	}
}
