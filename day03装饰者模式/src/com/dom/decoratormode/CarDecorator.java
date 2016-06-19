package com.dom.decoratormode;

public abstract class CarDecorator implements Car {
private Car car;
	public CarDecorator(Car car) {
	// TODO Auto-generated constructor stub
		this.car=car;
	}

	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public abstract void show();
}
