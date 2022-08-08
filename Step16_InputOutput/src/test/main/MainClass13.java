package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
	      File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
	      try {
	         //파일에서 문자열을 읽어들일수 있는 객체 생성
		      FileReader fr=new FileReader(memoFile);
		      BufferedReader br=new BufferedReader(fr); 
	         //반복문 돌면서
	         while(true) {
	            //문자 한줄 읽어내기
	        	 String liner=br.readLine(); //개행기호는 읽어내지 않음.
	            //만일 더이상 읽을 code 값이 없으면
	            if(liner == null) {
	               break;//반복문 탈출
	            }
	            
	            System.out.println(liner);
	         }
	         
	         
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	}
}
