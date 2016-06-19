package com.domchainofresponsibilitymode2.copy;

public class CarBodyHandler extends CarHandler {

	@Override
	public void handleCar() {
		// TODO Auto-generated method stub
		System.out.println("组装车身");
		if(this.carHandler!=null){
			this.carHandler.handleCar();
		}
	}

}
