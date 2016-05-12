package com.dom.abstractfactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitFactory nf=new NorthFruitFactory();
		Fruit app =  nf.getApple();
		app.introduceIself();
		Fruit banana=nf.getBanana();
		banana.introduceIself();
		FruitFactory sf=new SouthFruitFactory();
		Fruit apple =sf.getApple();
		Fruit ban =sf.getBanana();
		apple.introduceIself();
		ban.introduceIself();
	}

}
