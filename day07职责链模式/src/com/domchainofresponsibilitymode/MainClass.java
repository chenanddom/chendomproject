package com.domchainofresponsibilitymode;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarHeadHandler carHeadHandler = new CarHeadHandler();
		CarBodyHandler carBodyHandler = new CarBodyHandler();
		CarTailHandler carTailHandler = new CarTailHandler();
		carHeadHandler.handleCar();
		carBodyHandler.handleCar();
		carTailHandler.handleCar();

	}

}
