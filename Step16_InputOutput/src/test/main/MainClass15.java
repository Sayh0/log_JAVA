package test.main;

import java.io.*;

public class MainClass15 {
	public static void main(String[] args) {
		//필요한 참조값 담을 지역변수 미리 만들기
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("c:/acorn202206/myFolder/1.jpg"); //read
			fos=new FileOutputStream("c:/acorn202206/myFolder/copied.jpg"); //copy
			
			//읽어낸 1byte 출력하기
			while(true) {
				int data=fis.read(); //read 1byte
				if (data == -1) break;
				fos.write(data); 
				fos.flush();
			}
		} catch (Exception e) {
	         e.printStackTrace();
		} finally {
				try {
					if(fos!=null) fos.close(); //null check
					if(fis!=null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
