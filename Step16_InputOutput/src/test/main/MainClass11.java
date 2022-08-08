package test.main;

import java.io.*;

public class MainClass11 {
	public static void main(String[] args) {
		//문자열 저장할 파일을 만들기 위한 file 객체
		File memoFile=new File("c:/acorn202206/MyFolder/memo.txt");
		
		try {
			if(!memoFile.exists()) {
				memoFile.createNewFile();
			}
			//파일에 문자열 출력할 수 있는 FileWriter 객체 
			FileWriter fw=new FileWriter(memoFile, true); //파일에다가 문자열 기록 가능, 누적 텍스트 (append)켜기.
			fw.write("String text is written here");
			fw.write("\n");
			fw.write("ABCDEFU");
			fw.write("\n");
			fw.write("lalala");
			fw.write("\n");
			fw.flush();
			fw.close();// 출력을 마치고 마무리를 한다.
			System.out.println("txt save completed");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
