package com.dom.builder;

public class SpecificBuilder2 implements Builder {
	House house = new House();
	@Override
	public void makeTop() {
		// TODO Auto-generated method stub
		house.setTop("公寓->房顶");
	}

	@Override
	public void makeWall() {
		// TODO Auto-generated method stub
		house.setWall("公寓->墙壁");
	}

	@Override
	public void makeFloor() {
		// TODO Auto-generated method stub
		house.setFloor("公寓->地板");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
