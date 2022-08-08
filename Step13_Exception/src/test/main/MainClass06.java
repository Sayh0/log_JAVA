package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		MyUtil.draw();
		
		try {
			MyUtil.send();
		} catch (InterruptedException e) { //너는 아까 외부로 throw해서 불러오면 trycatch로 결국 묶어야 한다.
			e.printStackTrace();
		} 
	}
}
