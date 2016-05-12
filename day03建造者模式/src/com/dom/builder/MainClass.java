package com.dom.builder;

/**
 * @author adminster
 *
 */
public class MainClass {
	
public static void main(String[] args) {
	System.out.println("---------------------------------------------------------------------------");
	//1.用户自己动手做(这样用户必须了解所有的细节)
	House house = new House();
	house.setFloor("地板");
	house.setWall("墙壁");
	house.setTop("天花板");
	System.out.println(house.getFloor()+"-\n-"+house.getWall()+"-\n-"+house.getTop());
	System.out.println("---------------------------------------------------------------------------");
	//2.改进上述的繁琐的方法通过工程对来建造房子，不要用户了解过多的细节,但是任然是要用户来指挥工程对来建造房子，仍然不是很好
	SpecificBuilder1 specificBuilder1=new SpecificBuilder1();
	//这里还是要用户去指挥工程队去建造房子
	specificBuilder1.makeFloor();
	specificBuilder1.makeWall();
	specificBuilder1.makeTop();
	House house2 = specificBuilder1.getHouse();
	System.out.println(house2.getFloor()+"\n"+house2.getWall()+"\n"+house2.getTop());
	System.out.println("---------------------------------------------------------------------------");
	//3.进一步有优化,再创建一个设计者类去指挥工程队去完成任务，将用户从繁琐的任务中解脱出来
	//指定一个工程队
	SpecificBuilder2 specificBuilder2=new SpecificBuilder2();
	Designer designer= new Designer();
	designer.makeHouse(specificBuilder2);
	//向工程队要房子
	House house3 = specificBuilder2.getHouse();
	System.out.println(house3.getFloor()+"\n"+house3.getWall()+"\n"+house3.getTop());
	System.out.println("---------------------------------------------------------------------------");
}
}
