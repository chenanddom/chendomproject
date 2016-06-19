package com.dom.decoratormode;

public class RunCar implements Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("可以跑起来");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.run();
	}
}
