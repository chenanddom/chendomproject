package com.dom.visitormode;

public class ParkB implements ParkElement {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
