package com.dom.builder;

public class SpecificBuilder2 implements Builder {
	House house = new House();
	@Override
	public void makeTop() {
		// TODO Auto-generated method stub
		house.setTop("��Ԣ->����");
	}

	@Override
	public void makeWall() {
		// TODO Auto-generated method stub
		house.setWall("��Ԣ->ǽ��");
	}

	@Override
	public void makeFloor() {
		// TODO Auto-generated method stub
		house.setFloor("��Ԣ->�ذ�");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
