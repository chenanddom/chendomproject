package com.domchainofresponsibilitymode2.copy;

public class CarHeadHandler extends CarHandler {

	@Override
	public void handleCar() {
		// TODO Auto-generated method stub
		System.out.println("��װ��ͷ");
		if(this.carHandler!=null){
			this.carHandler.handleCar();
		}
	}

}
