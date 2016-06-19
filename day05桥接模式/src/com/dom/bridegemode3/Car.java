package com.dom.bridegemode3;

public abstract class Car {
private Engine engine;

public Car(Engine engine) {
	// TODO Auto-generated constructor stub
	this.engine=engine;
	}
	public abstract void installEngine();
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
