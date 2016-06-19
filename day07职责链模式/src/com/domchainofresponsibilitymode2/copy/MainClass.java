package com.domchainofresponsibilitymode2.copy;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarHeadHandler carHeadHandler = new CarHeadHandler();
		CarBodyHandler carBodyHandler = new CarBodyHandler();
		CarTailHandler carTailHandler = new CarTailHandler();
		carHeadHandler.setNextStep(carBodyHandler);
		carBodyHandler.setNextStep(carTailHandler);
		carHeadHandler.handleCar();
	}

}
