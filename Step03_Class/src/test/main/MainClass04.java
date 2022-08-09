package test.main;

import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  MyUtil 클래스에 있는 send()를 호출하고 싶다면?
		 *  static 메소드이기 때문에 new 하지 않고,
		 *  import 후에 클래스명에 . 찍어서 호출한다.
		 */
		MyUtil.send(); //Static method called
		String v=MyUtil.version; // static field called.
		//new 해서 객체 생성해서 참조값에 점 찍는 방식이 아니다. 객체와 아무런 상관이 없다.
		
		
	}
}
