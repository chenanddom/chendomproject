package com.dom.visitormode;

/**
 * ��๤A����A�����������
 * @author adminster
 *
 */
public class VisitorB implements Visitor {

	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ParkA parkA) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub
		System.out.println("��๤B��ɨB����");
	}

}
