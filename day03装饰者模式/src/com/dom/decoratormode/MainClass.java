package com.dom.decoratormode;

public class MainClass { 
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Car car = new RunCar();
		car.show();
		System.out.println("------------------------------------");
		Car decorator = new SwimCar(car);
		decorator.show();
		System.out.println("------------------------------------");
		Car decorator2 = new FlySwimCar(decorator);
		decorator2.show();
	}

}
