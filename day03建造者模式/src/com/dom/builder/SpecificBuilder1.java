package com.dom.builder;

public class SpecificBuilder1 implements Builder {
	House house = new House();

	@Override
	public void makeTop() {
		// TODO Auto-generated method stub
		house.setTop("ƽ��->����");
	}

	@Override
	public void makeWall() {
		// TODO Auto-generated method stub
		house.setWall("ƽ��->ǽ��");
	}

	@Override
	public void makeFloor() {
		// TODO Auto-generated method stub
		house.setFloor("ƽ��->�ذ�");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
