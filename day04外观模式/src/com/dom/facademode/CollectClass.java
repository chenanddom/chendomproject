package com.dom.facademode;

public class CollectClass {
private Function1 fun1;
private Function2 fun2;
public CollectClass() {
	// TODO Auto-generated constructor stub
	fun1 = new Function1();
	fun2 = new Function2();
}
public void funList(){
	this.fun1.fun();
	this.fun2.fun();
}
}
