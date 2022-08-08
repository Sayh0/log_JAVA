package test.main;

import java.io.*;

public class MainClass09 {
	public static void main(String[] args) {
		File f1=new File("c:/acorn202206/MyFolder/gura.txt");
		if(f1.exists()) {
			f1.delete();
			System.out.println("delete file");
		} else {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("create file");
			
		}
	}
}
