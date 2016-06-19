package com.dom.singleinstancemode;

public class Person2 {
public static Person2 p;
private String name;
//构造函数私有化(无法直接创建对象)
private Person2() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//创建一个获取对象的全局方法
public static Person2 getPerson(){

	if(p==null){
		p=new Person2();
	}
	return p;
}
}
