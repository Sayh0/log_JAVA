package test.mypac;

public class Messenger {
	//String type을 인자로 전달받는 static method
	public static void sendMessage(String msg) {
		System.out.println(msg+"를 전송합니다.");	
	}
	//String type을 리턴해주는 static method
	public static String getMessage() {
		return "Hello";	
	}
	public static void useRadio(Radio r) {
		r.listenMusic();
	}
}
