package test.main;

import java.util.ArrayList;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		ArrayList<Car> cars=new ArrayList<>();
		
		Car car1 = new Car("1번 차");
		Car car2 = new Car("2번 차");
		Car car3 = new Car("3번 차");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		for(int i=0; i<cars.size(); i++) {
			   cars.get(i).drive();
		}
		System.out.println("");
		for(Car tmp:cars) {
			tmp.drive();
		}
	}
}

