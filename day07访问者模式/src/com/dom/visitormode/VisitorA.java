package com.dom.visitormode;

/**
 * 清洁工A负责A区的卫生情况
 * @author adminster
 *
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ParkA parkA) {
		// TODO Auto-generated method stub
		System.out.println("清洁工A打扫该区域");
	}

	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub

	}

}
