package test.main;

import test.mypac.Messenger;
import test.mypac.Radio;

public class MainClass05 {
	public static void main(String[] args) {
		//Messenger 클래스의 sendMessage(),getMessage(),useRadio() 호출.
		
		Messenger msgr1=new Messenger();
		msgr1.sendMessage("message");
		String a=msgr1.getMessage();
		Messenger.useRadio(new Radio());
		
	}

}
