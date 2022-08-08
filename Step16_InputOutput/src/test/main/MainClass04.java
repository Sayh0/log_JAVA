package test.main;

import java.io.*;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		ps.println("hello");
		System.out.println("hello two");
		
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream 으로 받아보기.
		OutputStream os =ps; //1byte 처리 스트림이다.
		try {
			os.write(97); //출력할 준비 까지만 되어 있는 경우.
			os.write(44032); //한글은 안 나옴. 1바이트라.
			os.flush(); //방출을 꼭 해줘야 함.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
