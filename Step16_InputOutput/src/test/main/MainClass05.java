package test.main;

import java.io.*;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os=ps;
		OutputStreamWriter osw=new OutputStreamWriter(os);
		// InputStreamReader <-> OutputStreamWriter
		
		try {
			osw.write(97);
			osw.write(98);
			osw.write(44032);
			osw.write("문자열도 전달된다");
			osw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
