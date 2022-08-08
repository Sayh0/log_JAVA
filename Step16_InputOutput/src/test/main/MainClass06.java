package test.main;

import java.io.*;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os=ps;
		OutputStreamWriter osw=new OutputStreamWriter(os);
		// InputStreamReader <-> OutputStreamWriter
		
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("하나");
			bw.newLine();
			bw.write("두울\r");
			bw.write("세엣");

			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
