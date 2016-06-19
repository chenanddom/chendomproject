package com.dom.factorymode;

public class AddOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		double result = this.getN1()+this.getN2();
		return result;
	}

}
