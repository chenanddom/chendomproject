package com.dom.decoratormode;

public class SwimCar extends CarDecorator {

	public SwimCar(Car car) {
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
		this.swim();
	}
	private void swim() {
	// TODO Auto-generated method stub
		System.out.println("©иртсн");
	}
	}
