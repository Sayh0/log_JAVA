package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		File f=new File("D:/DEV_THINGS/myFolder/memo.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드 종료.");
	}
	
}
