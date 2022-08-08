package test.main;

import java.io.*;

public class MainClass16 {
	public static void main(String[] args) {
		//필요한 참조값 담을 지역변수 미리 만들기
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("c:/acorn202206/myFolder/1.jpg"); //read
			fos=new FileOutputStream("c:/acorn202206/myFolder/copied.jpg"); //copy
			
			//byte 알갱이를 담을 방 1024개짜리 byte[] 생성
			byte[] buffer=new byte[1024]; //한번에 1kb씩 읽어낼 수 있다.
			while(true) {
				//byte[] 객체 read{} 메소드에 전달, 몇 byte를 읽었는지 리턴받는다.
				int readByte=fis.read(buffer);
				if(readByte==-1)break;
				fos.write(buffer, 0, readByte); //0번방에서부터 읽은 만큼만 출력
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
