package com.dom.builder;

/**
 * @author adminster
 *
 */
public class MainClass {
	
public static void main(String[] args) {
	System.out.println("---------------------------------------------------------------------------");
	//1.�û��Լ�������(�����û������˽����е�ϸ��)
	House house = new House();
	house.setFloor("�ذ�");
	house.setWall("ǽ��");
	house.setTop("�컨��");
	System.out.println(house.getFloor()+"-\n-"+house.getWall()+"-\n-"+house.getTop());
	System.out.println("---------------------------------------------------------------------------");
	//2.�Ľ������ķ����ķ���ͨ�����̶������췿�ӣ���Ҫ�û��˽�����ϸ��,������Ȼ��Ҫ�û���ָ�ӹ��̶������췿�ӣ���Ȼ���Ǻܺ�
	SpecificBuilder1 specificBuilder1=new SpecificBuilder1();
	//���ﻹ��Ҫ�û�ȥָ�ӹ��̶�ȥ���췿��
	specificBuilder1.makeFloor();
	specificBuilder1.makeWall();
	specificBuilder1.makeTop();
	House house2 = specificBuilder1.getHouse();
	System.out.println(house2.getFloor()+"\n"+house2.getWall()+"\n"+house2.getTop());
	System.out.println("---------------------------------------------------------------------------");
	//3.��һ�����Ż�,�ٴ���һ���������ȥָ�ӹ��̶�ȥ������񣬽��û��ӷ����������н��ѳ���
	//ָ��һ�����̶�
	SpecificBuilder2 specificBuilder2=new SpecificBuilder2();
	Designer designer= new Designer();
	designer.makeHouse(specificBuilder2);
	//�򹤳̶�Ҫ����
	House house3 = specificBuilder2.getHouse();
	System.out.println(house3.getFloor()+"\n"+house3.getWall()+"\n"+house3.getTop());
	System.out.println("---------------------------------------------------------------------------");
}
}
