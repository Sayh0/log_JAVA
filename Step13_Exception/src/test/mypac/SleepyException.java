package test.mypac;
/*
 * 프로그래머는 필요에 따라 예외 객체를 생성상 클래스를 직접 만들수도 있음.
 * 실행중에 발생하는 예외를 발생시키고 싶으면 RuntimeException 을 상속받아 만들면 됨.
 */
public class SleepyException extends RuntimeException {
	//생성자
	public SleepyException(String msg) {
		
		super(msg); // 예외 메세지의 생성자를 인자로 전달받아 부모 생성자에 전달
		
		// 전달된 예외 메세지는 나중에 .getMessage()를 호출하면 리턴됨.
	}

}
