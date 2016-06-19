package com.dom.bridgemode;

public class MainClass {
	
public static void main(String[] args) {
	Car bus = new Bus2000();
	Car bus2 = new Bus2200();
	bus.installEngine();
	bus2.installEngine();
}
}
