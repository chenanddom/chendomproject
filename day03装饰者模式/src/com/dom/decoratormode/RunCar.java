package com.dom.decoratormode;

public class RunCar implements Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����������");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.run();
	}
}
