package test.main;

import test.mypac.Arrow;
import test.mypac.Gun;
import test.mypac.MyObject;
import test.mypac.Radio;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj=new MyObject();
		obj.setNum(0); //�ݵ�� int type ���ڰ� ���޵Ǿ�� ��. ���Կ����ڸ� �����Ͻö�.
		obj.setName("kim");
		
		//useRadio()ȣ���ϱ�
		obj.useRadio(new Radio());	//�Ｎ���� �����͸� ���� ����.
		//�Ʒ� �ڵ�� ����.
		Radio radio1 = new Radio();	//�̸� �غ��ϰ�
		obj.useRadio(radio1);		//�غ��� ���� ����
		//�޼ҵ��� ���ڷ� ������ ���� �̹� �غ�Ǿ� �������� ����.
		//�̹� �غ�Ǿ� �ִٸ� �޼ҵ带 ȣ���ϸ鼭 �غ�� ���� �����ؼ� �����ϸ� �ȴ�.
		
		//attack() �޼ҵ� ȣ���ϱ�.
		obj.attack(new Gun(), new Arrow());
		//���� ���
		Gun gun1=new Gun();
		Arrow arrow1=new Arrow();
		obj.attack(gun1,arrow1);
	}

}
