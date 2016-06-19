package com.dom.visitormode;

public class VisitorManager implements Visitor {
	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub
		System.out.println("管理员负责公园检查");
	}
	@Override
	public void visit(ParkA parkA) {
		// TODO Auto-generated method stub
		System.out.println("管理员负责公园A区域检查");
	}
	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub
		System.out.println("管理员负责公园B区域检查");
	}
}
