package com.domchainofresponsibilitymode2.copy;

public class CarBodyHandler extends CarHandler {

	@Override
	public void handleCar() {
		// TODO Auto-generated method stub
		System.out.println("��װ����");
		if(this.carHandler!=null){
			this.carHandler.handleCar();
		}
	}

}
