package com.dom.visitormode;

public class VisitorManager implements Visitor {
	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub
		System.out.println("����Ա����԰���");
	}
	@Override
	public void visit(ParkA parkA) {
		// TODO Auto-generated method stub
		System.out.println("����Ա����԰A������");
	}
	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub
		System.out.println("����Ա����԰B������");
	}
}
