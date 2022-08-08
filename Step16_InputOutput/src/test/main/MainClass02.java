package test.main;

import java.io.*;

public class MainClass02 {
	public static void main(String[] args) {
		//1byte 처리 스트림
		InputStream is=System.in;
		//2byte 처리 스트림 (256 * 256 65536개)
		InputStreamReader isr=new InputStreamReader(is); //생성자 인자로 인풋스트림 타입 전달
		System.out.println("입력 : ");
		try {
			int code=isr.read(); //한글자밖에 못 읽음
			System.out.println("code : "+code); //코드값
			char ch=(char)code;
			System.out.println("char : "+ch);//문자.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
