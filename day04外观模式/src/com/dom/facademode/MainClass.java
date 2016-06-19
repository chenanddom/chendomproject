package com.dom.facademode;

public class MainClass {

public static void main(String[] args) {
	//这种方法比较笨。
/*Function1 fun1 =new Function1();
Function2 fun2 =new Function2();
fun1.fun();
fun2.fun();*/
CollectClass collectClass = new CollectClass();
collectClass.funList();
}
}
