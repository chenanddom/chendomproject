package com.domadaptermode;

public class MainClass {
public static void main(String[] args) {
	/*Current current = new Current();
	current.use220();*/
/*	Adapter adapter = new Adapter();
	adapter.use18();*/
	Adapter2 adapter2 = new Adapter2(new Current());
	adapter2.use18();
}
}
