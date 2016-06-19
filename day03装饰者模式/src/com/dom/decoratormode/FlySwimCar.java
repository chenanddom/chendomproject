package com.dom.decoratormode;

public class FlySwimCar extends CarDecorator {

	public FlySwimCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.getCar().show();
		this.fly();
	}
	private void fly() {
	// TODO Auto-generated method stub
		System.out.println("©ирт╥и");
	}
	}
