package com.dom.simplefactorymode;

public class SimpleFactory {
public static Fruit getFruitInstance(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
/*	if(type.equalsIgnoreCase("Apple")){
		
//		return new Apple();
		return Apple.class.newInstance();
	}else if(type.equalsIgnoreCase("Banana")){
//		return new Banana();
		return Banana.class.newInstance();
	}else{
		@SuppressWarnings("rawtypes")
		Class fruit = Class.forName(type);
		return (Fruit) fruit.newInstance();
	}*/
	Class fruit = Class.forName(type);
	return (Fruit) fruit.newInstance();
}
}
