package com.dom.bridegemode3;

/**
 * 桥接模式将更加的灵活
 * 将发动机和造车分开
 * 拓展性很强
 * @author adminster
 *
 */
public class MainClass {

public static void main(String[] args) {
Engine engine1 = new Engine2000();
Car bus1=new Bus(engine1);
bus1.installEngine();

Engine engine2 = new Engine2200();
Car bus2=new Bus(engine2);
bus2.installEngine();	
	
}
}
