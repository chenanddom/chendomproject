package com.dom.factorymode;

public class AddOperationFactory implements OperationFactory {

	@Override
	public Operation getOperation() {
		// TODO Auto-generated method stub
		return new AddOperation();
	}

}
