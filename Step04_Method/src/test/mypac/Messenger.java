package test.mypac;

public class Messenger {
	//String type�� ���ڷ� ���޹޴� static method
	public static void sendMessage(String msg) {
		System.out.println(msg+"�� �����մϴ�.");	
	}
	//String type�� �������ִ� static method
	public static String getMessage() {
		return "Hello";	
	}
	public static void useRadio(Radio r) {
		r.listenMusic();
	}
}
