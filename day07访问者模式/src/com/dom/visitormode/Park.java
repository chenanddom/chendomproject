package com.dom.visitormode;

public class Park implements ParkElement {
private ParkA parkA;
private ParkB parkB;

public Park() {

	this.parkA = new ParkA();
	this.parkB = new ParkB();
}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		this.parkA.accept(visitor);
		this.parkB.accept(visitor);
	}

}
