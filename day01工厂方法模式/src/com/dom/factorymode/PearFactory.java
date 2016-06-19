package com.dom.factorymode;

public class PearFactory implements Factory {

	@Override
	public Fruit getFruitInstance() {
		// TODO Auto-generated method stub
		return new Pear();
	}

}
