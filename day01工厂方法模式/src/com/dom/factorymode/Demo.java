package com.dom.factorymode;

public class Demo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Factory appFactory=new AppleFactory();
		Fruit app=appFactory.getFruitInstance();
		app.introduceIself();
		Factory bananaFactory=new BananaFactory();
		Fruit banana=bananaFactory.getFruitInstance();
		banana.introduceIself();
		Factory pearFactory=new PearFactory();
		Fruit pear=pearFactory.getFruitInstance();
		pear.introduceIself();
	}

}
