package com.domchainofresponsibilitymode2.copy;

public class CarTailHandler extends CarHandler {

	@Override
	public void handleCar() {
		// TODO Auto-generated method stub
		System.out.println("×é×°³µÎ²");
		if(this.carHandler!=null){
			this.carHandler.handleCar();
		}
	}

}
