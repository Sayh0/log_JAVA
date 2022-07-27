package test.main;

import test.mypac.Arrow;
import test.mypac.Gun;
import test.mypac.MyObject;
import test.mypac.Radio;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj=new MyObject();
		obj.setNum(0); //반드시 int type 인자가 전달되어야 함. 대입연산자를 연상하시라.
		obj.setName("kim");
		
		//useRadio()호출하기
		obj.useRadio(new Radio());	//즉석에서 데이터를 만들어서 전달.
		//아래 코드와 같다.
		Radio radio1 = new Radio();	//미리 준비하고
		obj.useRadio(radio1);		//준비한 값을 전달
		//메소드의 인자로 전달할 값이 이미 준비되어 있을수도 있음.
		//이미 준비되어 있다면 메소드를 호출하면서 준비된 값을 참조해서 전달하면 된다.
		
		//attack() 메소드 호출하기.
		obj.attack(new Gun(), new Arrow());
		//같은 방법
		Gun gun1=new Gun();
		Arrow arrow1=new Arrow();
		obj.attack(gun1,arrow1);
	}

}
