package test.main;

import java.io.*;

public class MainClass10 {
	public static void main(String[] args) {
		//폴더 만들기
		/*
		 *  위 코드를 참고해서
		 *  폴더 1000개 만들기
		 */
		//만들기
		for(int i=0;i<1000;i++) {
			File f1=new File("c:/acorn202206/MyFolder/folder"+i);
			if (f1.exists()) {
				f1.delete();
			} else {
				f1.mkdir();
			}
		}
		
	}
}
