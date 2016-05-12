package com.dom.factorymode;

public class AppleFactory implements Factory {

	@Override
	public Fruit getFruitInstance() {
	
			return new Apple();
	
	}
}
