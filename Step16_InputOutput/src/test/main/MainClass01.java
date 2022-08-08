package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		
		//키보드와 연결된 InputStream type의 참조값을 kbd라는 지역변수에 담기
		//InputStream 객체는 1byte 단위(2진수 8자리 0000 0000 256개) 처리스트림이다.
		//2byte 처리로 하면 더 많은 숫자와 문자 처리 가능
		//대소영문자, 숫자, 특문만 처리 가능(한글 처리 불가)
		
		InputStream kbd=System.in;
		System.out.println("입력 : ");
		try {
			int a=kbd.read(); //입력한 문자의 코드값으로 출력. 그래서 int로 받는 것.
			System.out.println("code : "+a); //코드값
			char ch=(char)a;
			System.out.println("char : "+ch);//문자. (아 근데 한글 처리는 안됨)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
