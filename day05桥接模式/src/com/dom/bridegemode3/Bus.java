package com.dom.bridegemode3;

public class Bus extends Car{

	public Bus(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void installEngine() {
		// TODO Auto-generated method stub
		System.out.print("Car:");
		this.getEngine().installEngine();
	}

}
