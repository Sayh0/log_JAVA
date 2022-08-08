package test.main;

import java.io.*;

public class MainClass08 {
	public static void main(String[] args) {
		File f=new File("c:/");
		File[] files=f.listFiles(); //file객체 목록 얻어내기
		for(File tmp:files) { //반복문 돌면서 file목록 객체 하나씩 참조해서
			if(tmp.isDirectory()) { //파일이 디렉토리이면
				System.out.println("[ "+tmp.getName()+" ]"); //대괄호 출력
			} else {
				System.out.println(tmp.getName());
			}
		}
		
		
	}
}
