package com.dom.builder;

public class SpecificBuilder1 implements Builder {
	House house = new House();

	@Override
	public void makeTop() {
		// TODO Auto-generated method stub
		house.setTop("平房->房顶");
	}

	@Override
	public void makeWall() {
		// TODO Auto-generated method stub
		house.setWall("平房->墙壁");
	}

	@Override
	public void makeFloor() {
		// TODO Auto-generated method stub
		house.setFloor("平房->地板");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
