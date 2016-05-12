package com.dom.factorymode;

public class BananaFactory implements Factory {

	@Override
	public Fruit getFruitInstance() {
		// TODO Auto-generated method stub
		return new Banana();
	}

}
