package com.domchainofresponsibilitymode2.copy;

public abstract class CarHandler {
protected CarHandler carHandler;
public void setNextStep(CarHandler carHandler){
	this.carHandler = carHandler;
}
public abstract void handleCar();
}
