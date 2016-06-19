package com.dom.simplefactorymode;

public class Demo {
private static Fruit fruit;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		fruit=SimpleFactory.getFruitInstance("Apple");
		fruit.introduceIself();
		 
		fruit=SimpleFactory.getFruitInstance("Banana");
		fruit.introduceIself();
		
	/*	fruit=SimpleFactory.getFruitInstance("Pear");
		fruit.introduceIself();*/
	}

}
